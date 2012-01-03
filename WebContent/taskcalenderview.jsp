<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
<jsp:include page="header.jsp" />
<style type='text/css'>
	body {
		margin-top: 40px;
		text-align: center;
		font-size: 14px;
		font-family: "Lucida Grande",Helvetica,Arial,Verdana,sans-serif;
		}
	#calendar {
		width: 100%;
		margin: 5 px auto;
		}
</style>

	
<body>
	<div data-role="page" data-theme="d">
		<div id='calendar' data-role="content" style="height: 80%; width: 90%; margin-top: 5px;
		margin-bottom: 5px; margin-left: 5px; margin-right: 5px;"></div>
		<jsp:include page="footer.jsp" />
	</div>
	<link rel='stylesheet' type='text/css' href='css/fullcalendar.css' />
	<link rel='stylesheet' type='text/css' href='css/fullcalendar.print.css' media='print' />	
	
	
	<script type='text/javascript' src='js/jquery-ui-1.8.11.custom.min.js'></script>
	<script type='text/javascript' src='js/fullcalendar.min.js'></script>
	<script type='text/javascript' src='js/fullcalendar.js'></script>
	<script type='text/javascript' src='js/gcal.js'></script>
	<script type='text/javascript' src='js/jquery-1.5.2.min.js'></script>
	
	<!-- Will be put in js file -->
	<script type='text/javascript'>
	$(document).ready(function() {
		
		var date = new Date();
		var d = date.getDate();
		var m = date.getMonth();
		var y = date.getFullYear();
		
		$('#calendar').fullCalendar({
			editable: true,
			events: [
				{
					title: 'All Day Event',
					start: new Date(y, m, 1)
				},
				{
					title: 'Long Event',
					start: new Date(y, m, d-5),
					end: new Date(y, m, d-2)
				},
				{
					id: 999,
					title: 'Repeating Event',
					start: new Date(y, m, d-3, 16, 0),
					allDay: false
				},
				{
					id: 999,
					title: 'Repeating Event',
					start: new Date(y, m, d+4, 16, 0),
					allDay: false
				},
				{
					title: 'Meeting',
					start: new Date(y, m, d, 10, 30),
					allDay: false
				},
				{
					title: 'Lunch',
					start: new Date(y, m, d, 12, 0),
					end: new Date(y, m, d, 14, 0),
					allDay: false
				},
				{
					title: 'Birthday Party',
					start: new Date(y, m, d+1, 19, 0),
					end: new Date(y, m, d+1, 22, 30),
					allDay: false
				},
				{
					title: 'Click for Google',
					start: new Date(y, m, 28),
					end: new Date(y, m, 29),
					url: 'http://google.com/'
				}
			]
		});
		
	});


</script>
</body>
</html>