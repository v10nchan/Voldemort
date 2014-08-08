<?php
/**
 * Autosuggest To Advanced Search
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
		$queryString=strtoupper($_POST['inputString']);
		$queryStringMail=strtolower($_POST['inputString']);
		$AllName=explode(",",$queryString);
		
		/* echo $firstname=trim($AllName[0]);
		echo $lastname=trim($AllName[1]);
		$stat=trim($_POST['stat']); */
		
		
		$query = "SELECT * FROM prov_info where accountid='".$accountid."' AND (firstname LIKE '$queryString%' OR email LIKE '%".$queryStringMail."%' ) AND isactive = 'TRUE' AND email!='' LIMIT 10";
		
		
        $result = pg_query($query); 
        if (!$result) { 
            echo "Problem with query " . $query . "<br/>"; 
            echo pg_last_error(); 
            exit(); 
        }
		//rsultcheck  is used for the result status check
		
		echo '<ul>';
			echo '<li class="patient-search-results-header">Search results 
</span></li>';
			while($myrow = pg_fetch_object($result)) {
			
			
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
			echo '<li onClick="fill2(\''.addslashes($myrow->email).'\',\''.$ConfigUrl.'\');">
								<span class="patient-name-text">'.$name.' <span style="font-weight:normal">('.strtolower($myrow->email).')</span></span> 
								 
					</li>';
	         	}
				
		echo '</ul>';		
?>