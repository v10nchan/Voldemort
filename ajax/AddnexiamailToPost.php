<?php
/**
 * Add Send Mail To DataBase
 *
 * This is a ajax call file .
 * this file trigeer when email send with regarding patient option.
 * file save the all destils into database
 * also save the attachment file details before cleaning the catche table
 * attachments to disk for inline display in current html compositions.
 *
 * handler:
 *   mathod name AddnexiamailToPost() defined in ajax/ajaxJs.js
 * 
 * Author: Rajesh Mishra 
 * Date: 07-22-2014
 */
	
	
	
	//include config file to get the nexia user details
	require_once('config.php');
	
	//Configure file of database and static variable.
	require_once('../config/config.inc.php');
	
	
	//retrieve the database connection attributes.
	$connctionStr=substr($config['db_dsnw'],8);
	$ConnectionArray=explode("@",$connctionStr);
	//print_r($ConnectionArray);
	
	$ConnectionArrayUP=explode(":",$ConnectionArray[0]);
	$ConnectionArrayDB=explode("/",$ConnectionArray[1]);
	
	 $userName=urldecode($ConnectionArrayUP[0]);
	 $userPass=urldecode($ConnectionArrayUP[1]);
	 $host=urldecode($ConnectionArrayDB[0]);
	 $dbName=urldecode($ConnectionArrayDB[1]);
	
	//stablish connection with database.
	$link = mysql_connect($host, $userName, $userPass);
	if (!$link) {
		die('Not connected : ' . mysql_error());
	}
	$db_selected = mysql_select_db($dbName, $link);
	if (!$db_selected) {
		die ('Error on selecting database : ' . mysql_error());
	}
	
?>

<!-- Configuration End Here  -->


<?php
		//print_r($_POST);
		//echo $_SESSION['group_file_identifier'];
		
		
		/* insert the mail details in database if user id exit.	*/
		$attachment_id=$_GET['composed_id']."_".date("ymdhis");
		$catcheKey="db_attach.".$_GET['composed_id'];
		
		
		$query = "insert into nexia_email (accountid,from_email,to_email,cc_email,bcc_email,subject_email,message,attachment,pat_name,pat_id,datentime) 
		VALUES('".$accountid."','".$_POST['from_email']."','".$_POST['_to']."','".$_POST['_cc']."','".$_POST['_bcc']."','".$_POST['_subject']."',
		'".$_POST['_message']."','".$attachment_id."','".$_POST['_sp']."','".$_POST['_patid']."','".date("Y/m/d h:i:s")."')         ";
		$result = mysql_query($query);		
		
		//save the images to nexia_attachment table from catche 
		$query_att="select * from cache where cache_key like '%".$catcheKey."%' ";
		$result_att=mysql_query($query_att);
		while($result_att_val=mysql_fetch_array($result_att)){
			$attachmentName=$result_att_val['img'];
			mysql_query("insert into nexia_attach (key_id,attachment_name) values('".$attachment_id."','".$attachmentName."')");
		}
		
		// NOTE: Do not return anything to protect rouncubemail.
		
?>