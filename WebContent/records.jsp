<!DOCTYPE html> 
<html> 
<jsp:include page="header.jsp" />
<body> 

<div data-role="page" data-theme="d">

	<div id="list" data-role="content">
		<ul id="listRecords" data-role="listview" data-inset="false" data-filter="true">
		</ul>
	</div>	
	
	<jsp:include page="footer.jsp" />
	
	<script type="text/javascript" src="js/record.js"></script>
	<script type="text/javascript" src="js/recordDetails.js"></script>
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