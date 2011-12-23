function listRecords(object){
	document.location='records.jsp' + '?' + 'object=' + object;
}


function showCounts(){
	var url = './data.json';	
	url = url + '?action=' + 'count' + '&subaction=getcount';
	$.ajax({
		  url: url,
		  cache:false,
		  async: true,
		  dataType: 'json',
		  error:function(e){
			  //alert("Error" + e);
		  },
		  success: function (data) {
			  $.each(data.count[0], function(key, value) {
				  //alert(key + " , " + value);
				  $("#" + key).empty();
				  $("#" + key).append(value);
			  });			  
		  }
		});
}