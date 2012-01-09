<!DOCTYPE html> 
<html> 
<jsp:include page="header.jsp" />
<body> 

<div data-role="page" data-theme="d" data-iscroll="enable">
	<div data-role="header"></div>
	<div id="list" data-role="content">
		<div data-iscroll="scroller">
			<ul id="listRecords" data-role="listview" data-inset="false" data-filter="true">
			</ul>
		</div>
	</div>	
	
	<jsp:include page="footer.jsp" />
	
	<script type="text/javascript" src="js/records.js"></script>
	<!-- <script type="text/javascript" src="js/footer.js"></script> -->
	<script type="text/javascript">
		$(document).bind("pagebeforechange", processPage());
		
		function processPage(){
			getRecords(getUrlVars()['object'], 1);
			//processFooter('');
		}
	</script>
	
	
	
	
	
</div>
</body>
</html>