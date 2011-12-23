<!DOCTYPE html>
<html>
<jsp:include page="header.jsp" />
<body>	 
	<div data-role="page" data-theme="d">
	
	
		<div data-role="header" data-theme='b'> 
			<a data-rel="back" data-icon="back">Back</a>
			<h1 id='recordName'></h1>
			<a href="#">Edit</a>
		</div>	
		
		<div data-role="content">
			<div id="main">
				<ul data-role="listview" data-inset=false data-filter="false">
					<li>
						<table id="recordDetails" align="center"></table>
					</li>
				</ul>				
			</div>	
			
			<div id="specific" style="display:none;">
				<ul data-role="listview" data-inset=false data-filter="false">
					<li>
						<table id="specificDetails" align="center"></table>
					</li>
				</ul>	
			</div>	
			
			<div id="standard" style="display:none;">
				<ul data-role="listview" data-inset=false data-filter="false">
					<li>
						<table id="standardDetails" align="center"></table>
					</li>
				</ul>	
			</div>	
			
			<div id="related" style="display:none;">
				<ul data-role="listview" data-inset=false data-filter="false">
					<li>	
						<table id="relatedDetails" align="center"></table>
					</li>
				</ul>	
			</div>	
			
		</div>	
			
		<div data-role="footer" data-position="fixed" >
			<div data-role="navbar">
				<ul>
					<li><a href="#" onclick="javascript:window.location.href='home.jsp'">Home</a></li>
					<li><a href="#" onclick="showDiv('specific')">Specific Fields</a></li>
					<li><a href="#" onclick="showDiv('standard')">Standard Fields</a></li>
					<li><a href="#" onclick="showDiv('related')">Related Lists</a></li>
					<li><a href="#">Options</a></li>
				</ul>
			</div>
		</div>	
		
		
		<script type="text/javascript" src="js/recordDetails.js"></script>
		<script type="text/javascript">
			$(document).bind("pagebeforechange", showRecordDetails());
			$.fixedToolbars.setTouchToggleEnabled(false);
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