/**
 * method override to perform custom operation
 *
 * This is a Jquery file which have all custom method.
 * This file use to call onclick, load and trigeere method.
 *
 * handler:
 *   any method can direct override here.
 *
 * Author: Rajesh Mishra 
 * Date: 07-15-2014
 */
 
 
 
 
//this method used to check & uncheck all the checkbox whithin the specific class
function check_all_checkbox(classchebox,allcheckbox,tocheck){
 
        if($(tocheck+' '+allcheckbox).prop('checked')) { 
			// check select status
             $(tocheck+' '+classchebox).prop('checked', true);    
        }else{
            $(tocheck+' '+classchebox).prop('checked', false);         
        }
}


/*	get all checkbox value by id , join all the value by ; 
 *	this function used to append the more then 1 email in TO field of mail  
 *	auto add ; at the end of email.
 */
function getValueUsingClass(idd,cpopup){
	var chkArray = [];
	$(".checkbox1:checked").each(function() {
		chkArray.push($(this).val());
	});
	
	var selected;
	selected = chkArray.join(',') + ",";
	
	if(selected.length > 1){
		var val=document.getElementById(idd).value;
		val=val.trim();
		var lasrChar=val.slice(-1);
		//alert(lasrChar);
		if(lasrChar!=',' && val!=''){
		document.getElementById(idd).value=val+","+selected;
		}else {
		document.getElementById(idd).value=val+selected;
		}
		close_pop(cpopup);
		
	}else{
		close_pop(cpopup);	
	}
	 
}


var current_index = 0;


//show the suggestion list of provider on keyup event
function suggest(inputString,cls){
//alert(inputString+cls);

var pat_role=$(cls+" #p_role").val();
var practics=$(cls+" #p_all").val();
var inputStr=$(cls+" #searchp").val();
//alert(accountid);
		
		 $.post("ajax/autosuggest-to.php", {queryString: ""+inputStr+"",pat_role: ""+pat_role+"",practics: ""+practics+"",cls: ""+cls+""}, function(data){
				if(data.length >0) {
				 $(cls+' .searcharearkm').html(data);
				}
			});
		
	}
// fill the value on same textbox.
function fill(thisValue) {
		$('#searchp').val(thisValue);
		setTimeout("$('#suggestions').fadeOut();", 600);
	}
	
	
	
function suggest2(inputString){
var inputStr=$("#_to").val();
var substr = inputStr.split(',');
var len=substr.length-1;
inputStr=substr[len];
		if(inputStr.length == 0) {
			$('#suggestions2').fadeOut();
		} else {
		
		if (inputString == 40  || inputString == 38 || inputString == 13 || inputString == 27){
		
			globalKeyPressEventNodata(inputString,'#_to','#suggestions2','#suggestionsList2');
		
		}else {
		
			$('#compose-subject').addClass('load');
			$.post("ajax/autosuggest-to-quick.php", {inputString: ""+inputStr+""}, function(data){
				if(data.length >85) {
				//alert(data.length);
				//globalKeyPressEvent(inputString,'#_to','#suggestions2','#suggestionsList2',data);
				current_index = 0;
				$('#suggestions2').fadeIn();
				$('#suggestionsList2').html(data);
				$('#compose-subject').removeClass('load');	
				}else{
					setTimeout("$('#suggestions2').fadeOut();", 300);
				}
			});
		}
		}
	}

function fill2(thisValue) {
	current_index=0;
	var inputStr=$("#_to").val();
	var substr = inputStr.split(',');
	var len=substr.length-1;
	inputStr=substr[len];
	var mailAll='';
	for(var i=0;i<len;i++){
       mailAll=mailAll+substr[i]+',';
    }
	
		var val=mailAll+thisValue+',';
		$('#_to').val(val);
		setTimeout("$('#suggestions2').fadeOut();", 300);
}	

	
	
	
//ajax search used to show quick result of the _cc
function suggest3(inputString){
var inputStr=$("#_cc").val();
var substr = inputStr.split(',');
var len=substr.length-1;
inputStr=substr[len];
		if(inputStr.length == 0) {
			$('#suggestions3').fadeOut();
		} else {
		
		if (inputString == 40  || inputString == 38 || inputString == 13 || inputString == 27){
		
			globalKeyPressEventNodata(inputString,'#_cc','#suggestions3','#suggestionsList3');
		
		}else {
			$('#compose-subject').addClass('load');
			$.post("ajax/autosuggest-to-quick3.php", {inputString: ""+inputStr+""}, function(data){
				if(data.length >85) {
				//alert(data.length);
				//globalKeyPressEvent(inputString,'#_cc','#suggestions3','#suggestionsList3',data);
				current_index = 0;
				$('#suggestions3').fadeIn();
				$('#suggestionsList3').html(data);
				$('#compose-subject').removeClass('load');	
				}else{
					setTimeout("$('#suggestions3').fadeOut();", 300);
				}
			});
		}
		}
	}

function fill3(thisValue) {
	current_index=0;
	var inputStr=$("#_cc").val();
	var substr = inputStr.split(',');
	var len=substr.length-1;
	inputStr=substr[len];
	var mailAll='';
	for(var i=0;i<len;i++){
       mailAll=mailAll+substr[i]+',';
    }
	
		var val=mailAll+thisValue+',';
		$('#_cc').val(val);
		setTimeout("$('#suggestions3').fadeOut();", 300);
}	


//ajax search used to show quick result of the _bcc
function suggest4(inputString){

//alert(current_index_bcc+'    '+items_total+'    '+inputString);
	
var inputStr=$("#_bcc").val();
var substr = inputStr.split(',');
var len=substr.length-1;
inputStr=substr[len];
		if(inputStr.length == 0) {
			$('#suggestions4').fadeOut();
		} else {
		
		if (inputString == 40  || inputString == 38 || inputString == 13 || inputString == 27){
		
			globalKeyPressEventNodata(inputString,'#_bcc','#suggestions4','#suggestionsList4');
		
		}else{
			$('#compose-subject').addClass('load');
			$.post("ajax/autosuggest-to-quick4.php", {inputString: ""+inputStr+""}, function(data){
				if(data.length >85) {
				//alert(data.length);
				//globalKeyPressEvent(inputString,'#_bcc','#suggestions4','#suggestionsList4',data);
				current_index = 0;
				$('#suggestions4').fadeIn();
				$('#suggestionsList4').html(data);
				$('#compose-subject').removeClass('load');
	
				}else{
					setTimeout("$('#suggestions4').fadeOut();", 300);
				}
			});
		}
		}
}

function fill4(thisValue) {
	current_index=0;
	var inputStr=$("#_bcc").val();
	var substr = inputStr.split(',');
	var len=substr.length-1;
	inputStr=substr[len];
	var mailAll='';
	for(var i=0;i<len;i++){
       mailAll=mailAll+substr[i]+',';
    }
	
		var val=mailAll+thisValue+',';
		$('#_bcc').val(val);
		setTimeout("$('#suggestions4').fadeOut();", 300);
}


function globalKeyPressEvent(inputString,boxId,suggListId,SuggDataListId,data){
var $input = $(boxId),
	$number_list = $(suggListId+' ul'),
    $options = $number_list.find('li'),
    items_total = $options.length;



	if (inputString == 40) {
	
		if (current_index < items_total-1) {
			current_index++;
		} else {
			current_index=1;
		}
		
		$options.removeClass('selected');
		$options.eq(current_index).addClass('selected');
					
	} else if(inputString == 38){
		if (current_index > 1) {
			current_index--;
		}else {
			current_index=items_total-1;
		}
		$options.removeClass('selected');
		$options.eq(current_index).addClass('selected');
						
	} else if(inputString == 13){
		if($options.hasClass('selected')) {
			$number_list.find('.selected').click();
		}
		$(suggListId).fadeOut();
				
	} else if(inputString == 27){
		$(suggListId).fadeOut();
						
	}else{
		current_index = 0;
		$(suggListId).fadeIn();
		$(SuggDataListId).html(data);
		$('#compose-subject').removeClass('load');
	}
}
	

//without ajax call
function globalKeyPressEventNodata(inputString,boxId,suggListId,SuggDataListId){
var $input = $(boxId),
	$number_list = $(suggListId+' ul'),
    $options = $number_list.find('li'),
    items_total = $options.length;



	if (inputString == 40) {
	
		if (current_index < items_total-1) {
			current_index++;
		} else {
			current_index=1;
		}
		
		$options.removeClass('selected');
		$options.eq(current_index).addClass('selected');
					
	} else if(inputString == 38){
		if (current_index > 1) {
			current_index--;
		}else {
			current_index=items_total-1;
		}
		$options.removeClass('selected');
		$options.eq(current_index).addClass('selected');
						
	} else if(inputString == 13){
		if($options.hasClass('selected')) {
			$number_list.find('.selected').click();
		}
		$(suggListId).fadeOut();
				
	} else if(inputString == 27){
		$(suggListId).fadeOut();
						
	}
}
	
	
	
//this function show the patient details on keyup event	
var r=1;
function suggest1(inputString){ 

//alert(current_index);
var $input = $('#_sp'),
	$number_list = $('#suggestionsList1 ul'),
    $options = $number_list.find('li'),
    items_total = $options.length;
	
var stt=1;
r=1;
var inputStr=$("#_sp").val();
if($("#P_Status").prop('checked') == true){
    stt=0;
}
	//alert(inputStr.length);
		if(inputStr.length == 0) {
			$("#_patid").val('');
			/* var iframe = $('#composebody_ifr');
			var valSel=iframe.contents().find('body').text().length;
			iframe.contents().find('body').html('');  */ 
			$('#suggestions1').fadeOut();
			
		} else {

		if (inputString == 40  || inputString == 38 || inputString == 13 || inputString == 27){
		
			globalKeyPressEventNodata(inputString,'#_sp','#suggestions1','#suggestionsList1');
		
		}else{
			$('#compose-subject').addClass('load');
			$.post("ajax/autosuggest-subject.php", {queryString: ""+inputStr+"",stat: ""+stt+""}, function(data){
			
			if(data.length >321) {
				//globalKeyPressEvent(inputString,'#_sp','#suggestions1','#suggestionsList1',data);
				current_index = 0;
				$('#suggestions1').fadeIn();
				$('#suggestionsList1').html(data);
				$('#compose-subject').removeClass('load');
					
				}
			else{
				patlist();
			}
			});
		}
		}
	}
	
//fadeout Suggestion box on blur event	
function patlist(){
current_index = 0;

$('#suggestions1').fadeOut();
$('#suggestions2').fadeOut();
$('#suggestions3').fadeOut();
$('#suggestions4').fadeOut();

}
	
//append the predefined text to message body on patient selecation with same patient ID
function fill1(name,url) {
	current_index = 0;
	$('#_sp').val(name);
	$('#_patid').val(url);	
		
		//uncomment if you want to append the regarding patient text into mail body 
		
		/* var iframe = $('#composebody_ifr');
		var valSel=iframe.contents().find('body').text().length;
		 
		
		iframe.contents().find('body').html('<div id="selecator">Regarding Patient  <b><a href="'+url+'" >'+name+'</a></b>   [click to open patient chart]</div>');  
		setTimeout("$('#suggestions1').fadeOut();", 200); */
		
}

//Function used to closed the popup	
function close_pop(shoupopupclass)
	{	
		//alert($(shoupopupclass +' #searchp').val());
		$(shoupopupclass +' #searchp').val('');
		$(shoupopupclass +' select').prop('selectedIndex',0);
		$(shoupopupclass).fadeOut();
		$('.searcharearkm').empty();
		
}

//Function used to show popup.
var loader=1;
function show_pop(shoupopupclass)
{		
		if(loader==1){
		loader=2;
		$.post("ajax/autoload_practics.php", {queryString: "fghf"}, function(data){
				if(data.length >0) {
					$('.p_all').append(data);
				}
		});
		
		$.post("ajax/autoload_role.php", {queryString: "fghf"}, function(data){
				if(data.length >0) {
					 $('.p_role').append(data);
				}
		});
		}
		
		$('.searcharearkm').empty();
		$('.searchp').empty();
		$(shoupopupclass).fadeIn(); searchp
}

//close the send popup alert box.
function CloseSendPopup(){
$('.settings-header-top-right').fadeOut();
$('#validator').val('2');
}

	
function ShowPopupBox(){
$('.settings-header-top-right').fadeIn();
$('#validator').val('3');
} 


//load the practics by account id when page is loaded
/* $('.popup3 #p_all').ready(function() { 
$.post("ajax/autoload_role.php", {queryString: "fghf"}, function(data){
				if(data.length >0) {
					 $('.p_role').append(data);
				}
			});

});


$('.popup3 #p_all').ready(function() { 
$.post("ajax/autoload_practics.php", {queryString: "fghf"}, function(data){
				if(data.length >0) {
					$('.p_all').append(data);
				}
			});

}); */


   /* 
	* this method call by ajax request.
	* this method trigeer when any mail send
	* add same message details with attachment in database.
	*/
function AddnexiamailToPost(){

	var myParam = location.search.split('_id=')[1];
	var composed_id=myParam.split('&')[0];
	//alert(composed_id);
		
//IF PROVIDER SELECT THE PATIENT LIST THEN INSERT THE VALUE IN DATABASE.		
if($("#_patid").val()!=''){
var postData = $("#compose-content").serializeArray();
$.ajax(
    {
        url : "ajax/AddnexiamailToPost.php?composed_id="+composed_id,
        type: "POST",
        data : postData,
        success:function(data, textStatus, jqXHR) 
        {
             //alert(data);
			 //data: return data from server
        },
        error: function(jqXHR, textStatus, errorThrown) 
        {
            alert(data);	
			//if fails      
        }
    });

 }
}


//flag Checker
function flagcheck(pclass){
var a = $("."+pclass+" .checkbox1");
if(a.length == a.filter(":checked").length){
        $("."+pclass+' #allcheckbox').prop('checked', true);    
    }else{
		$("."+pclass+' #allcheckbox').prop('checked', false);    
	}

} 


//Global key event function for compose template list selecation 
$(function () {
	
	//keyup Events of regarding patient search
    $('#_sp').on('keyup', function (e) {
		suggest1(e.keyCode);
	});
	
	//keyup Events of TO provider
	$('#_to').on('keyup', function (e) {
		suggest2(e.keyCode);
	});
	
	//keyup Events of CC provider
	$('#_cc').on('keyup', function (e) {
		suggest3(e.keyCode);
	});
	
	//keyup Events of BCC provider
	$('#_bcc').on('keyup', function (e) {
		suggest4(e.keyCode);
	});
	
	$("#cc-link").click(function(){
		$("#_cc").focus();
	});
	
	$("#bcc-link").click(function(){
		$("#_bcc").focus();
	});

});

