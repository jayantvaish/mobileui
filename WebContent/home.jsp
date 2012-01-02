<!DOCTYPE html>
<html>
<jsp:include page="header.jsp" />
<style type="text/css">
	td	{
	padding: 5px;
	}
</style>
<link rel='stylesheet' type='text/css' href='css/dashlet.css'/> 
<body>
	<div data-role="page"  data-theme="d">
		<div data-role="content">
			<table>
				<tr>
					<td><img src="images/stream.png" style="height:32px; width:32px;" /></td><td>Notification1</td><td style="color:grey;">by Ismael Ghalimi</td>
				</tr>
				<tr>
					<td><img src="images/stream.png" style="height:32px; width:32px" /></td><td>Notification2</td><td style="color:grey;">by Ismael Ghalimi</td>
				</tr>
				<tr>
					<td><img src="images/stream.png" style="height:32px; width:32px" /></td><td>Notification3</td><td style="color:grey;">by Ismael Ghalimi</td>
				</tr>
				<tr>
					<td><img src="images/stream.png" style="height:32px; width:32px" /></td><td>Notification4</td><td style="color:grey;">by Ismael Ghalimi</td>
				</tr>
			</table>
			<!-- <ul data-role="listview" data-inset="false" data-filter="false">
				<li style="border-width: 0px;"><td><img src="images/stream.png" style="height:32px; width:32px" /></td><td>Notification1</td><td>by Ismael Ghalimi</td></li>
				<li style="border-width: 0px;"><td><img src="images/stream.png" style="height:32px; width:32px" /></td>Notification2</li>
				<li style="border-width: 0px;"><td><img src="images/stream.png" style="height:32px; width:32px" /></td>Notification3</li>
			</ul> -->
		</div>
	 	<div data-role="content" style="margin-top:5%">				
			<div>
				<ul data-role="listview" data-inset="false" data-filter="false">
					<li>
						<div style="height:80px">
							<div class="io-tracking-dashlet-name">
								<a title="View Tracking’s Details and Edit Configuration" href="#">Meta-Data Quality</a>
							</div>
							<div class="io-dashlet-tracking-health-green" title="Meta-Data Quality above 60%">&nbsp;</div>
							<div class="io-dashlet-tracking-change">
							<div class="io-dashlet-tracking-change-good" title="Change since Yesterday">+18%</div>
							</div>
							<div class="io-dashlet-tracking-value" title="View Tracking’s Details and Edit Configuration">
							72
							<span class="io-dashlet-tracking-suffix">%</span>
							</div>
							<div class="io-dashlet-tracking-target" title="Change Target">TARGET: 100%</div>									
						</div>					
					</li>
					<li>						
						<div style="height:80px">
							<div class="io-tracking-dashlet-name">
								<a title="View Tracking’s Details and Edit Configuration" href="#">Network Activity</a>
							</div>							
							<div class="io-dashlet-tracking-health-green" title="Network Activity above 50">&nbsp;</div>
							<div class="io-dashlet-tracking-change">
							<div class="io-dashlet-tracking-change-good" title="Change since Yesterday">+7%</div>
							</div>
							<div class="io-dashlet-tracking-value" title="View Tracking’s Details and Edit Configuration">
							59
							</div>
							<div class="io-dashlet-tracking-target" title="Change Target">TARGET: 75</div>				
						</div>
					</li>
					<li>	
						<div style="height:80px">
							<div class="io-tracking-dashlet-name">
								<a title="View Tracking’s Details and Edit Configuration" href="#">Website Visits</a>
							</div>
							<div class="io-dashlet-tracking-health-yellow" title="WebSite traffic below target">&nbsp;</div>
							<div class="io-dashlet-tracking-change">
							<div class="io-dashlet-tracking-change-good" title="Change since Yesterday">+13%</div>
							</div>
							<div class="io-dashlet-tracking-value" title="View Tracking’s Details and Edit Configuration">
							354
							<span class="io-dashlet-tracking-suffix">K</span>							
							</div>
							<div class="io-dashlet-tracking-target" title="Change Target">TARGET: 500K</div>				
						</div>
					</li>
					<li>
						<div style="height:80px">
							<div class="io-tracking-dashlet-name">
								<a title="View Tracking’s Details and Edit Configuration" href="#">Quarterly Bookings</a>
							</div>
							<div class="io-dashlet-tracking-health-green" title="Quarterly bookings above target">&nbsp;</div>
							<div class="io-dashlet-tracking-change">
							<div class="io-dashlet-tracking-change-good" title="Change since Yesterday">+39%</div>
							</div>
							<div class="io-dashlet-tracking-value" title="View Tracking’s Details and Edit Configuration">
							<span class="io-dashlet-tracking-prefix">$</span>
							1.7
							<span class="io-dashlet-tracking-suffix">M</span>
							</div>
							<div class="io-dashlet-tracking-target" title="Change Target">TARGET: $1.5M</div>				
						</div>
					</li>
					<li>
						<div style="height:80px">
							<div class="io-tracking-dashlet-name">
								<a title="View Tracking’s Details and Edit Configuration" href="#">NYSE:VMW</a>
							</div>
							<div class="io-dashlet-tracking-health-green" title="NYSE:VMW">&nbsp;</div>
							<div class="io-dashlet-tracking-change">
							<div class="io-dashlet-tracking-change-good" title="Change since Yesterday">++2.41%</div>
							</div>
							<div class="io-dashlet-tracking-value" title="View Tracking’s Details and Edit Configuration">
							85
							<span class="io-dashlet-tracking-suffix">.00</span>
							</div>
							<div class="io-dashlet-tracking-target" title="Change Target">TARGET: 120	</div>				
						</div>
					</li>
					<li>
						<div style="height:80px">
							<div class="io-tracking-dashlet-name">
								<a title="View Tracking’s Details and Edit Configuration" href="#">Project Status</a>
							</div>
							<div class="io-dashlet-tracking-health-red" title="Project status under warning(80%	)">&nbsp;</div>
							<div class="io-dashlet-tracking-change">
							<div class="io-dashlet-tracking-change-good" title="Change since Yesterday">  --</div>
							</div>
							<div class="io-dashlet-tracking-value" title="View Tracking’s Details and Edit Configuration">
							0
							<span class="io-dashlet-tracking-suffix">	</span>
							</div>
							<div class="io-dashlet-tracking-target" title="Change Target">TARGET: 120	</div>				
						</div>
					</li>
				</ul> 
			</div>
			
		</div>		
		
		<div data-role="footer" data-position="fixed" >
			<div data-role="navbar">
				<ul>
					<li><a id="home" class="ui-btn-active" href="#" onclick="javascript:window.location.href='home.jsp'"><img src ="images/home.png" style="height:32px; width:32px" /></a></li>
					<li><a id="applications" href="#" onclick="javascript:window.location.href='applications.jsp'"><img src ="images/application.png" style="height:32px; width:32px" /></a></li>
					<li><a id="tasks" href="#" onclick="listRecords('tasks')"><img src ="images/tasks.png" style="height:32px; width:32px" /><span id="taskCount"></span></a></li>
					<li><a href="#" onclick="listRecords('events')"><img src ="images/events.png" style="height:32px; width:32px" /><span id="eventCount"></span></a></li>
					<li><a href="#"><img src ="images/option.png" style="height:32px; width:32px" /></a></li>
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