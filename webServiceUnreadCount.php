<?php
 
//$stream = imap_open("{mail.nexiaemail.com:143/novalidate-cert}INBOX.Drafts", "chetu1", "Chetu@123");

/* connect to gmail */
$hostname = '{mail.nexiaemr.com:993/imap/ssl/novalidate-cert}INBOX';
$username = $_REQUEST['username'];
$password = base64_decode($_REQUEST['password']); 
 
 
 if($hostname!='' && $username!='' && $password!=''){
/* $hostname = '{mail.nexiaemail.com:143/imap/novalidate-cert}INBOX';
$username = 'chetu1';
$password = 'Chetu@123'; */


/* try to connect */
$inbox = imap_open($hostname,$username,$password) or die('Cannot connect to your server: ' .    imap_last_error());
$check = imap_mailboxmsginfo($inbox);

//print_r($check);
if ($check)
    echo $check->Unread;
else
	echo ''; 
imap_close($inbox);

}else{  echo "wrong";}