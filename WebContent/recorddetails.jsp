<!DOCTYPE html>
<html>
<jsp:include page="header.jsp" />
<style type="text/css">
	td
	{
	border-bottom:1px solid #E6E6E6;
	padding: 5px;
	}
	h2 {
        text-align: center; 
    }
</style>
<body>	 
	<div data-role="page" data-theme="d" >
		<div data-role="header" data-position="fixed" data-theme='b'style="height:50px"> 
			<!-- <a data-rel="back" data-icon="back">Back</a> -->
			<div style='margin-top: -0.5em; margin-bottom: -0.5em;'>
				<h2 id='recordName'></h2>
			</div>
			<!-- <a href="#">Edit</a> -->
		</div>	
		
		<div data-role="content" data-position="fixed" style="top : 50px ; height: 600px;">
			<div id="main">
				<ul data-role="listview" data-inset=false data-filter="false">
					<li style="border-width: 0px;">
						<table id="recordDetails" align="center" ></table>
					</li>
				</ul>				
			</div>	
			
			<div id="specific" style="display:none;">
				<ul data-role="listview" data-inset=false data-filter="false">
					<li style="border-width: 0px;">
						<table id="specificDetails" align="center" ></table>
					</li>
				</ul>
				<!-- <ul id="specificDetails" data-role="listview" data-inset=false data-filter="false">
				</ul> -->
			</div>	
			
			<div id="standard" style="display:none;">
				<ul data-role="listview" data-inset=false data-filter="false">
					<li style="border-width: 0px;">
						<table id="standardDetails" align="center"></table>
					</li>
				</ul>	
			</div>	
			
			<div id="related" style="display:none;">
				<ul data-role="listview" data-inset=false data-filter="false">
					<li style="border-width: 0px;">	
						<table id="relatedDetails" align="center" ></table>
					</li>
				</ul>	
			</div>	
			"relative"
		</div>	
			
		<div data-role="footer" data-position="fixed"  style="top : 630px ; height: 50px;" >
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
			//$.fixedToolbars.setTouchToggleEnabled(false);
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