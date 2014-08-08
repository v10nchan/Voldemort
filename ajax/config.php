<?php
/**
 * Custom Config File
 *
 * This file is configuration file of the mail server.
 * This file use to call onclick, load and trigeere method.
 *
 * handler:
 *   any method can direct override here.
 *
 * Author: Rajesh Mishra 
 * Date: 07-15-2014
 */
 
 
session_start();
   
   
   //Configure the DataBase Connection
   $host        = "host=192.168.12.127";
   $port        = "port=5432";
   $dbname      = "dbname=nexia";
   $credentials = "user=postgres password=aka1198";
   
   $_SESSION['group_file_identifier'];
     
  
  
  //Login Screen Configuration 
  $text_failed_login='Your email account is not setup for Nexia EMR enterprise use.
					  <div style="color: #666;font-size: 15px;">Please work with System Team to have an account setup.</div>';
  
  $text_exp_login_session=' your email session has expired ! ';
   
   
   
   
   //Configure the Static value
   $accountid	=$_SESSION['accountId'];
   if($accountid==''){
	$accountid	='1004578';
   }
   $ConfigUrl	='https://192.168.12.127:8443/#!chartrightsummary;patientID=';
   $queryString = strtoupper(trim($_POST['queryString']));
   //$queryString='A';

   $db = pg_connect("$host $port $dbname $credentials");
   if(!$db){
      echo "Error : Unable to open database\n";
   } else {
      //echo "Opened database successfully\n";
   }
?>
