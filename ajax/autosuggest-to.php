<?php
/**
 * Autosuggest To,CC and BCC
 *
 * This file call when provider press any key on To,BCC and CC textbox.
 *
 *
 * Author: Rajesh Mishra 
 * Date: 07-15-2014
 */
 
	//Configure file of database and static variable.
	require_once('config.php');
?>



<?php

		/*search query to find the Provider email id on keyup event
			User can type emailId/name of the provider and we show the correct info.
			its search user by name or email.
		*/

		$rkm=2;
		$selectall=1;
		
		
		
		//Get the value from ajax Call, 
		//REQUEST & POST are worked here.
		$queryStringMail=strtolower($queryString);
		$accountid;
		$pat_role=strtoupper(trim($_POST['pat_role']));
		$practics=strtoupper(trim($_POST['practics']));
		$ncls=substr(trim($_POST['cls']),1);
		$ncls="$ncls"."n";
		//store all the provider id in array from prov_practice table based on certain condication.
		$practics_provid_key=array();
		$practics_query="select provid from prov_practice where practiceid='".$practics."' AND accountid='".$accountid."'";
		$practics_provid_query = pg_query($practics_query);
			while ($practics_provid=pg_fetch_array($practics_provid_query)){
				
				//store all the id in array
				$practics_provid_key[] = $practics_provid['provid'];
			}
			
		//uncomment below for debugging.	
		//print_r($practics_provid_key);
		
		$role_provid_key=array();
		$useridbyrole="select usernumid from user_assigned_roles where roleid='".$pat_role."' AND accountid='".$accountid."'";
		$useridbyrole_provid="select provid from phy_password where usernumid in ($useridbyrole) AND  accountid='".$accountid."'";
		$role_provid_query = pg_query($useridbyrole_provid);
			while ($role_provid=pg_fetch_array($role_provid_query)){
				
				//store all the id in array
				$role_provid_key[] = $role_provid['provid'];
			}
			
		//uncomment below for debugging.	
		//print_r($role_provid_key);
		
		
		
		//marge provid by role and practics
		$all_provid=array();
		$all_provid_unique=array();
		
		
		//$all_provid = array_intersect($practics_provid_key,$role_provid_key);
		//$all_provid=array_merge($practics_provid_key,$role_provid_key);
		
		//uncomment below for debugging.	
		//print_r($intersect);
		
		
		
		//build the first name /lastname and email query we pass query string or null condication
		if($queryStringMail!=''){
		$querysearchbuilder="AND (firstname LIKE '$queryString%' OR email LIKE '%".$queryStringMail."%' ) AND isactive = 'TRUE' AND email!='' LIMIT 15";
		
		}else{
		$querysearchbuilder=" AND email!='' LIMIT 15";
		
		}
		
		
		//filter record by practics and role of the provider
		if($pat_role!='ALL' && $practics!='ALL'){
			$all_provid = array_intersect($practics_provid_key,$role_provid_key);
			$all_provid_impold=implode(",", $all_provid);
			$query = "SELECT * FROM prov_info where provid in ($all_provid_impold) $querysearchbuilder";
		
		}else if($pat_role=='ALL' && $practics!='ALL'){
		
		$practics_provid_key_impold=implode(",", $practics_provid_key);
		$query = "SELECT * FROM prov_info where provid in ($practics_provid_key_impold) $querysearchbuilder";
		
		
		}else if($pat_role!='ALL' && $practics=='ALL'){
		
		
		$role_provid_key_impold=implode(",", $role_provid_key);
		$query = "SELECT * FROM prov_info where provid in ($role_provid_key_impold) $querysearchbuilder";
		
		}else{
		
			$query = "SELECT * FROM prov_info where accountid='".$accountid."' $querysearchbuilder";
			
		}
		//end of the filter record by practics and role of the provider
		
		
		//uncomment thsi query if role and practics filter are not required
		/* if($accountid=='all'){
		$query = "SELECT * FROM prov_info where  (firstname LIKE '$queryString%' OR email LIKE '%".$queryStringMail."%' ) AND isactive = 'TRUE' AND email!='' LIMIT 15";
		}else{
		$query = "SELECT * FROM prov_info where accountid='".$accountid."' AND (firstname LIKE '$queryString%' OR email LIKE '%".$queryStringMail."%' ) AND isactive = 'TRUE' AND email!='' LIMIT 15";
		}
		 */
		$ncls1='"'.$ncls.'"';
		$result = pg_query($query);		
				
		echo '<ul style="padding-left: 10px;line-height: 15px;margin-top: 0px;" id="tocheck" class="'.$ncls.'">';
				while ($myrow = pg_fetch_object($result)) {
					if($myrow->firstname!='' && $selectall==1){
					$selectall=2;
					echo '<li style="list-style-type: none;float: left;width: 99%;margin-bottom: 5px;padding-bottom: 2px;border-bottom: solid 1px #f1f1f1;" ><input onClick="check_all_checkbox(\'.checkbox1\',\'#allcheckbox\',\'#tocheck\');" type="checkbox" id="allcheckbox" style="float: left;"/><b>Select All</b></li>';
					}
					$rkm=1;
	         			echo '<li style="list-style-type: none;float: left;width: 100%;" ><input onclick="flagcheck(\''.$ncls.'\')" class="checkbox1" value="'.strtolower($myrow->email).'"  type="checkbox" name="allemail[]" style="float: left;"/> <b>'.$myrow->lastname.','.$myrow->firstname.'</b><span> ('.strtolower($myrow->email).')</span></li>';
	         		}
					if($rkm==2){
					echo '<li>No record found !</li>';
					}
		echo '</ul>';
					
		
?>