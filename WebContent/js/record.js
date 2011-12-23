/*function getRecords(){
	//var url='http://192.168.2.102:7070/android/data.json?action=accounts&subaction=getrows&startfrom=1&upto=2';
	$.getJSON('examples/test.json',function(jsonData){
		alert("Inside function");
		$.each(jsonData.accounts,function(i,json){
			$("#listRecords").append('<li data-theme="d"><a href="#">'+json.name+'</a></li>');
		});
		$('ul').listview('refresh');
	});
}*/

var length = 20;  //Number of rows to be fetched.
var limit = 0;
var objectTask = "tasks";
var objectEvent = "events";


function getRecords(object, offset){
	//alert("getRecords");
	var count = 0;
	limit = offset + length - 1;
	var url = './data.json';	
	url = url + '?action=' + object + '&subaction=getrows&startfrom=' + offset + '&upto=' + limit;
	
	$.ajax({
		  url: url,
		  cache:false,
		  async: true,
		  dataType: 'json',
		  error:function(e){
			  //alert("Error" + e);
		  },
		  success: function (data) {	
			  $.each(data.data,function(i,json){				
				   $("#listRecords").append('<li data-theme="d" data-icon="false"><a id="' + json.xid + '" href="#" onclick="postObjectAndXid(\''+ object +'\',\''+ json.xid +'\')">'+json.name+'</a></li>');
				   if(object == objectTask || object == objectEvent){
					   $.each(data.data[i], function(key, value) {
						  	//alert(key + " , " + value);
						  	if(key != 'xid' && key != 'name'){
						  		$("#" + json.xid).append('<tr><td align="right" style="font-size: 10pt; font-weight: normal; color: grey">' + key  + '&nbsp;&nbsp;</td><td style="font-size: 10pt; font-weight: normal; color: #333">' + value + '</td></tr>');		            
						  	}
					  });
				   }
				   count++;
			  });
			  
			  if(count >= length){
				  $("#listRecords").append('<li id="loadMoreRecords" data-theme="b" data-icon="false"><a href="#" onclick="getMoreRecords(\''+ object +'\')" align="center" data-role="button">More...</a></li>');				  
			  }
			  $('#listRecords').listview('refresh');
		  }
		});
}


function getMoreRecords(object){
	$("#loadMoreRecords").remove();
	if(limit != 0){
		getRecords(object, limit+1);
	}
}


function postObjectAndXid(object, xid){
	var urlToPost = 'recorddetails.jsp';
	document.location=urlToPost + '?' + 'object=' + object + '&'  + 'xid=' + xid;
}
