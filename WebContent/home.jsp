<!DOCTYPE html>
<html>
<jsp:include page="header.jsp" />
<body>
	<div data-role="page">
	
		<div data-role="content">	
			<ul data-role="listview" data-inset="false" data-filter="true">
				<li data-theme="d">
					<div id="notification" style="height:250px">
					TODO Put Notifications
					</div>
				</li>
				<li data-theme="d">
					<div id="tracking" style="height:250px">
					TODO Put Tracking
					</div>
				</li>
			</ul>
		</div>

		<div data-role="footer" data-position="fixed" >
			<div data-role="navbar">
				<ul>
					<li><a id="home" class="ui-btn-active" href="#" onclick="javascript:window.location.href='home.jsp'">Home</a></li>
					<li><a id="applications" href="#" onclick="javascript:window.location.href='applications.jsp'">Applications</a></li>
					<li><a id="tasks" href="#" onclick="listRecords('tasks')">Tasks<span id="taskCount"></span></a></li>
					<li><a href="#" onclick="listRecords('events')">Events<span id="eventCount"></span></a></li>
					<li><a href="#">Options</a></li>
				</ul>
			</div>
		</div>
		
		<script type="text/javascript" src="js/applications.js"></script>
		<script type="text/javascript" src="js/footer.js"></script>
		<script type="text/javascript">
			$(document).bind("pagebeforechange", appendCount()); 
		</script>
	</div>
</body>
</html>