<?php 
session_start();
///http://192.168.13.21/mail/login.php?actionbynex=post&UserId=3&accountId=1004578

if($_REQUEST['UserId']==''){
 $UserNumId="3";
$accountId="1004578"; }else{
$UserNumId=$_GET['UserId'];
$accountId=$_GET['accountId'];

}

$accountId;

require_once('ajax/config.php');



$query="select * from nexia_email_users where accountid='".$accountId."' AND usernumid='".$UserNumId."' limit 1";
$queryrow  =pg_query($query);
$queryArray=pg_fetch_array($queryrow);
   $UserId=$queryArray['nexiaemailid'];
    $Password=$queryArray['nexiapassword'];  


$query1="select * from account_info where accountid='".$accountId."' limit 1";
$queryrow1  =pg_query($query1);
$queryArray1=pg_fetch_array($queryrow1);
  $imapInfo=$queryArray1['hostname'];
 //$imapInfo=$queryArray1['hostname'];

 if($_REQUEST['actionbynex']=='post'){
  $_SESSION['count']=1;
  $_SESSION['accountId']=$accountId;
  $_SESSION['UserId']   =$UserId;
   $_SESSION['Password']=base64_decode($Password);
 
  $_SESSION['imapInfo']=$imapInfo;

 }
  
/* echo  $_SESSION['Password'];
echo $_SESSION['accountId']; 
echo $_SESSION['UserId']; 
echo $_SESSION['imapInfo'];
die();  */
  
?>

<html>

<head>
<style>table{width: 100%;text-align: center;height:95%}
.but{width: 100px;margin: auto;font-size: 15px;border: solid 1px #f1f1f1;
padding: 10px;
background-color: #FCBB21;
color: #f1f1f1;
box-shadow: 0px 0px 4px #ccc;
text-decoration: none;}
</style>

<script>
function login(){

 document.location.reload();
 document.getElementById("roundmaillogin").submit();
}
</script>
</head>
<body>
</div>
<form name="form" id='roundmaillogin' method="post" action="./?_task=login">
<input type="hidden" name="_token" value="<?php echo md5(date("ymdhis")); ?>">
<input type="hidden" name="_task" value="login">
<input type="hidden" name="_action" value="login">
<input type="hidden" name="_url" id="rcmloginurl" value="">
<input type="hidden" name="_host" id="rcmloginhost" value="<?php echo $_SESSION['imapInfo'] ;?>">
<input name="_user" id="rcmloginuser" value="<?php echo $_SESSION['UserId'];?>"  type="hidden">
<input name="_pass" id="rcmloginpwd" value="<?php echo $_SESSION['Password'];?>" type="hidden">
<input type="hidden" name="_timezone" id="rcmlogintz" value="Asia/Kolkata">
<input type="hidden" name="accountid" id="accountid" value="<?php echo $_SESSION['accountId'] ;?>">
<input type="hidden" name="counter" id="counter" value="<?php echo $_SESSION['count']; ?>">
</form>
<?php if($_REQUEST['actionbynex']=='post' ||$_SESSION['count']<=3){ ?>
<table>
	<tr>
		<td>
			<img src="ajax/loading-logo.gif">
		</td>
	</tr>
</table>
<?php } else if($_REQUEST['action']=='failed'){ ?>
<table>
	<tr>
		<td style="font-family: sans-serif; font-size: 20px;">
			<img src="ajax/images.jpg" style="width: 35px; vertical-align: middle;">
			<?php echo $text_failed_login; ?>
			
						
		</td>
	</tr>
</table>
<?php } else {?>
<table>
	<tr>
		<td style="font-family: sans-serif; font-size: 20px;">
			<img src="ajax/images.jpg" style="width: 35px; vertical-align: middle;"><?php echo $text_exp_login_session; ?>
			
			
		</td>
	</tr>
</table>
<?php } ?>



</body>
</html>
<?php 
if($_REQUEST['actionbynex']=='post'){ 
$_SESSION['count']++; 

?>
<script>
	
	var count=1;
	function loader(){
	if(count==1){count=2;
	document.getElementById("roundmaillogin").submit();}
	};
	setInterval(function(){loader();},1000);
	
	//
</script>

<?php }else if($_SESSION['count']==2){ $_SESSION['count']++;   ?>

<script>document.getElementById("roundmaillogin").submit(); </script>

<?php }else if($_SESSION['count']==3){ $_SESSION['count']++; ?>

<script>window.location='./login.php?action=failed';</script>

<?php } ?>
