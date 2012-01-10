<!DOCTYPE html>
<html>
<jsp:include page="header.jsp" />
<link rel='stylesheet' type='text/css' href='css/recorddetails.css'/> 
<body>
	<div data-role="page" data-theme="d" data-iscroll="enable">
		
		<div data-role="header" data-theme='b'> 
			<!-- <a data-rel="back" data-icon="back">Back</a> -->
			<!-- <div style='margin-top: -0.5em; margin-left: 0.5em; margin-right: 0.5em; margin-bottom: -0.5em;'>
				<h2 id='recordName'></h2>
			</div> -->
			<h1 id='recordName'></h1>
			<!-- <a href="#">Edit</a> -->
		</div>	
		
		<div data-role="content">
		<div data-iscroll="scroller">
			<div id="main">
				<ul data-role="listview" data-inset=false data-filter="false">
					<li style="border-width: 0px;">
						<table id="recordDetails"></table>
					</li>
				</ul>				
			</div>	
			
			<div id="specific" style="display:none;">
				<ul data-role="listview" data-inset=false data-filter="false">
					<li style="border-width: 0px;">
						<table id="specificDetails"></table>
					</li>
				</ul>
			</div>	
			
			<div id="standard" style="display:none;">
				<ul data-role="listview" data-inset=false data-filter="false">
					<li style="border-width: 0px;">
						<table id="standardDetails"></table>
					</li>
				</ul>	
			</div>	
			
			<div id="related" style="display:none;">
				<ul data-role="listview" data-inset=false data-filter="false">
					<li style="border-width: 0px;">	
						<table id="relatedDetails"></table>
					</li>
				</ul>	
			</div>
		</div>
		</div>	
			
		<div data-role="footer" data-position="fixed" >
			<div data-role="navbar">
				<ul>
					<li><a href="#" onclick="javascript:window.location.href='home.jsp'"><img src ="images/home.png" style="height:32px; width:32px" /></a></a></li>
					<li><a href="#" onclick="showDiv('specific')">Specific Fields</a></li>
					<li><a href="#" onclick="showDiv('standard')">Standard Fields</a></li>
					<li><a href="#" onclick="showDiv('related')">Related Lists</a></li>
					<li><a href="#"><img src ="images/option.png" style="height:32px; width:32px" /></a></a></li>
				</ul>
			</div>
		</div>		
		
		<script type="text/javascript" src="js/recordDetails.js"></script>
		<script type="text/javascript">
		$(document).bind("pagebeforechange", showRecordDetails()); 
		
		function showDiv(div){
			//alert(div);
			hideDiv();
			$('#' + div).show();
		}
		
		function hideDiv(){
			$('#main').hide();
			$('#specific').hide();
			$('#standard').hide();
			$('#related').hide();
		}
		</script>		
	</div>


</body>
</html>