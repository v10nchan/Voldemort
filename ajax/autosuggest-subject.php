<?php
/**
 * Autosuggest Subject
 *
 * This file call when provider press any key on subject textbox.
 *
 *
 * Author: Rajesh Mishra 
 * Date: 07-15-2014
 */
 
	//Configure file of database and static variable.
	require_once('config.php');
?>
<?php 
		/*search query to find the patient on keyup event
			user search behavior is similar to the existing application
			its search user by first and last name based on comma separated.
		
		*/
		
		$AllName=array();
		$AllName=explode(",",$queryString);
		$firstname=trim($AllName[0]);
		$lastname=trim($AllName[1]);
		$stat=trim($_POST['stat']);
		
		
		if($stat==1){
		if($firstname!='' && $lastname!=''){
			$query = "SELECT * FROM pat_info where accountid='".$accountid."' AND firstname LIKE '".$firstname."%' AND lastname LIKE '".$lastname."%' AND status='1' limit 5"; 
		}else if($firstname!=''  && $lastname==''){
			$query = "SELECT * FROM pat_info where accountid='".$accountid."' AND ( firstname LIKE '".$firstname."%' OR lastname LIKE '".$firstname."%' OR CAST(patientid AS TEXT) LIKE '".$firstname."%' ) AND status='1' limit 5";
		}else{
			$query = "SELECT * FROM pat_info where accountid='".$accountid."' AND lastname LIKE '".$lastname."%' AND status='1' limit 5";	
		}
		}else{
		if($firstname!='' && $lastname!=''){
			$query = "SELECT * FROM pat_info where accountid='".$accountid."' AND firstname LIKE '".$firstname."%' AND lastname LIKE '".$lastname."%'   limit 5"; 
		}else if($firstname!=''  && $lastname==''){
			$query = "SELECT * FROM pat_info where accountid='".$accountid."' AND ( firstname LIKE '".$firstname."%' OR lastname LIKE '".$firstname."%' OR CAST(patientid AS TEXT) LIKE '".$firstname."%' )  limit 5";
		}else{
			$query = "SELECT * FROM pat_info where accountid='".$accountid."' AND lastname LIKE '".$lastname."%'   limit 5";	
		}
		
		$checkbox_stat='checked="checked"';
		
		}
		
		
        $result = pg_query($query); 
        if (!$result) { 
            echo "Problem with query " . $query . "<br/>"; 
            echo pg_last_error(); 
            exit(); 
        }
		//rsultcheck  is used for the result status check
		$rsultcheck=2;
		 
		echo '<ul>';
			echo '<li class="patient-search-results-header">Search results    <span style="float: right;line-height: 14px;font-size: 12px;"><input '.$checkbox_stat.' onclick="suggest1(\'load\');" style="width: 12px;float: left;margin-top: 0px;" type="checkbox" name="P_Status" id="P_Status">Include inactives  
</span></li>';
			while($myrow = pg_fetch_object($result)) {
			$rsultcheck=1;
			
				//validate Sex from data base to show full string
				$sex=($myrow->sex == 'M' ? 'Male' : 'Female');
			
				//calculate user Age by user dob
				$dob=date("m/d/Y",strtotime($myrow->dob));
				$datediff = abs(strtotime($dob) - strtotime(date("m/d/Y")));
				$years = floor($datediff / (365*60*60*24));
				
				//firstname and last name format
				$name=$myrow->lastname.', '.$myrow->firstname;
				
				//Reconfigure URL for Patient Chart
				$ConfigUrl=$ConfigUrl.$myrow->patientid;
				
				
			/*
			  Show in-line row with result ,
			  Add or removed the css to change the design 
			  css file style.min.css locate in /skin/css
			*/
			echo '<li onClick="fill1(\''.addslashes($name).'\',\''.$myrow->patientid.'\');">
								<span class="patient-name-text">'.$name.' '.$myrow->mi.'</span> 
								<span class="inline-block">  '.$sex.' '. $years.' years ('.$dob.')</span><br/>
								<span class="gwt-InlineHTML">ID:'.$myrow->patientid.'</span>
								
					</li>';
	         	}
				//show message if result not found
				if($rsultcheck==2){
					echo '<li>No record found !</li>';
				}
		echo '</ul>';		
?>