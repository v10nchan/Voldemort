<?php
/**
 * Autoload Practics
 *
 * This file call when provider click on advanced search.
 * get prcatics value on run time based on accountID.
 *
 *
 * Author: Rajesh Mishra 
 * Date: 07-15-2014
 */
 
 
	//Configure file of database and static variable.
	require_once('config.php');
?>



<?php

		/* dynamic append the practice on advanced search form	*/

		$accountid;
				
		$query = "SELECT * FROM practice where accountid='".$accountid."' ";
				
		$result = pg_query($query);		
		
		 
					echo '<option value="all">All Practices</option>';
				while ($myrow = pg_fetch_object($result)) {
					echo '<option value="'.$myrow->practiceid.'">'.$myrow->name.'</option>';
				}	 
		
					
		
?>