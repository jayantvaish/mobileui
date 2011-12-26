function showRecordDetails(){
	//alert("Function showRecordDetails");
	var object = getUrlVars()['object'];
	var xid = getUrlVars()['xid'];
	//alert("Object is: " + object);
	//alert("XID is: " + xid);
	
	var url = './data.json';	
	url = url + '?action=' + object + '&subaction=getinfo&id=' + xid;
	$.ajax({
		  url: url,
		  cache:false,
		  async: true,
		  dataType: 'json',
		  error:function(e){
			  //alert("Error" + e);
		  },
		  success: function (data) {
			  //var id = 0;
			  if(data.data.main[0].Name != undefined) {
				  $("#recordName").append(data.data.main[0].Name);
			  } else if(data.data.main[0].Title != undefined){
				  $("#recordName").append(data.data.main[0].Title);
			  }
			  
			  
			  $.each(data.data.main[0], function(key, value) {
				  //alert(key, + " , " + value);
				  	if(key != 'XID'){
				  		$("#recordDetails").append('<tr><td align="right" style="font-size: 12pt; font-weight: normal; color: grey">' + key  + '</td><td style="font-size: 12pt; font-weight: normal; color: #333">' + value + '</td></tr>');		            
				  	}
			  });
			  $("#recordDetails").append('<tr><td align="right" style="font-size: 12pt; font-weight: normal; color: grey">XID</td><td style="font-size: 12pt; font-weight: normal; color: #333">' + xid + '</td></tr>');
		  
			  
			  $.each(data.data.standard[0], function(key, value) {
				  	$("#standardDetails").append('<tr><td align="right" style="font-size: 12pt; font-weight: normal; color: grey">' + key  + '</td><td style="font-size: 12pt; font-weight: normal; color: #333">' + value + '</td></tr>');		            
			  });
			  
			  $.each(data.data.specific[0], function(key, value) {
				   $("#specificDetails").append('<tr><td align="right" style="font-size: 12pt; font-weight: normal; color: grey">' + key  + '</td><td style="font-size: 12pt; font-weight: normal; color: #333">' + value + '</td></tr>');		            
				  	
				  /*$("#specificDetails").append('<li data-theme="d" data-icon="false"><a id="' + id + '" href="#"></a></li>');
				   
				  $("#" + id).append('<tr><td align="left" style="font-size: 12pt; font-weight: normal; color: grey">' + key  + '</td><td>&nbsp;&nbsp;</td><td style="font-size: 12pt; font-weight: normal; color: #333">' + value + '</td></tr>');
				  id++;*/
			  });
			  //$("#specificDetails").listview('refresh');
		  
		  }
		});

}


function getUrlVars(){
    var vars = [], hash;
    var hashes = window.location.href.slice(window.location.href.indexOf('?') + 1).split('&');
    for(var i = 0; i < hashes.length; i++){
        hash = hashes[i].split('=');
        vars.push(hash[0]);
        vars[hash[0]] = hash[1];
    }
    return vars;
}