<!DOCTYPE html>
<html>
<jsp:include page="header.jsp" />
<link rel='stylesheet' type='text/css' href='css/dashlet.css'/> 
<body>
	<div data-role="page"  data-theme="d">
	
	 	<div data-role="content">	
	 		
	 		<div style="height:50%;">
				<ul data-role="listview" data-inset="false" data-filter="true">
					
				</ul>
			</div>
			
			<div style="height:50%;">
				<ul data-role="listview" data-inset="false" data-filter="false">
					<li>
						<div id="notification" style="height:80px">
							<div class="io-tracking-dashlet-name">
								<a title="View Tracking’s Details and Edit Configuration" href="#">Meta-Data Quality</a>
							</div>
							
							
							<div class="io-dashlet-tracking-health-green" title="Meta-Data Quality above 60%">&nbsp;</div>
							
							
							<div class="io-dashlet-tracking-change">
							<div class="io-dashlet-tracking-change-good" title="Change since Yesterday">+18%</div>
							</div>
	
							
							<div class="io-dashlet-tracking-value" title="View Tracking’s Details and Edit Configuration">
							72
							<span >%</span>
							</div>
							<div class="io-dashlet-tracking-value1" title="Change Target">TARGET: 100%</div>				
						</div>
						
						
					</li>
					<li>
						
							<div id="notification" style="height:80px">
							<div class="io-tracking-dashlet-name">
								<a title="View Tracking’s Details and Edit Configuration" href="#">Network Activity</a>
							</div>
							
							
							<div class="io-dashlet-tracking-health-green" title="Network Activity above 50">&nbsp;</div>
							
							
							<div class="io-dashlet-tracking-change">
							<div class="io-dashlet-tracking-change-good" title="Change since Yesterday">+7%</div>
							</div>
	
							
							<div class="io-dashlet-tracking-value" title="View Tracking’s Details and Edit Configuration">
							354
							<span >K		</span>
							</div>
							<div class="io-dashlet-tracking-value1" title="Change Target">TARGET: 100%</div>				
						</div>
						
					
						
					</li>
					<li>
							
							<div id="notification" style="height:80px">
							<div class="io-tracking-dashlet-name">
								<a title="View Tracking’s Details and Edit Configuration" href="#">Website Visits</a>
							</div>
							
							
							<div class="io-dashlet-tracking-health-yellow" title="WebSite traffic below target">&nbsp;</div>
							
							
							<div class="io-dashlet-tracking-change">
							<div class="io-dashlet-tracking-change-good" title="Change since Yesterday">+7%</div>
							</div>
	
							
							<div class="io-dashlet-tracking-value" title="View Tracking’s Details and Edit Configuration">
							59
							
							</div>
							<div class="io-dashlet-tracking-value1" title="Change Target">TARGET: 500K</div>				
						</div>
	
	
					</li>
					<li>
						
							<div id="notification" style="height:80px">
							<div class="io-tracking-dashlet-name">
								<a title="View Tracking’s Details and Edit Configuration" href="#">Quarterly Bookings</a>
							</div>
							
							
							<div class="io-dashlet-tracking-health-green" title="Quarterly bookings above target">&nbsp;</div>
							
							
							<div class="io-dashlet-tracking-change">
							<div class="io-dashlet-tracking-change-good" title="Change since Yesterday">+39%</div>
							</div>
	
							
							<div class="io-dashlet-tracking-value" title="View Tracking’s Details and Edit Configuration">
							1.7
							<span >M</span>
							</div>
							
							<div class="io-dashlet-tracking-value1" title="Change Target">TARGET: $1.5M</div>				
						</div>
						
					
						
					</li>
					<li>
						
							<div id="notification" style="height:80px">
							<div class="io-tracking-dashlet-name">
								<a title="View Tracking’s Details and Edit Configuration" href="#">NYSE:VMW</a>
							</div>
							
							
							<div class="io-dashlet-tracking-health-green" title="NYSE:VMW">&nbsp;</div>
							
							
							<div class="io-dashlet-tracking-change">
							<div class="io-dashlet-tracking-change-good" title="Change since Yesterday">--</div>
							</div>
	
							
							<div class="io-dashlet-tracking-value" title="View Tracking’s Details and Edit Configuration">
							83.0
							<span >	</span>
							</div>
							
							<div class="io-dashlet-tracking-value1" title="Change Target">TARGET: 120	</div>				
						</div>
					</li>
					<li>
						
							<div id="notification" style="height:80px">
							<div class="io-tracking-dashlet-name">
								<a title="View Tracking’s Details and Edit Configuration" href="#">Project Status</a>
							</div>
							
							
							<div class="io-dashlet-tracking-health-red" title="Project status under warning(80%	)">&nbsp;</div>
							
							
							<div class="io-dashlet-tracking-change">
							<div class="io-dashlet-tracking-change-good" title="Change since Yesterday">--</div>
							</div>
	
							
							<div class="io-dashlet-tracking-value" title="View Tracking’s Details and Edit Configuration">
							0
							<span >	</span>
							</div>
							
							<div class="io-dashlet-tracking-value1" title="Change Target">TARGET: 120	</div>				
						</div>
					</li>
				</ul> 
			</div>
		</div>
		
		
	
		
		
		<div data-role="footer" data-position="fixed" >
			<div data-role="navbar">
				<ul>
					<li><a id="home" class="ui-btn-active" href="#" onclick="javascript:window.location.href='home.jsp'"><img src ="images/home.png" /></a></li>
					<li><a id="applications" href="#" onclick="javascript:window.location.href='applications.jsp'"><img src ="images/application.png" /></a></li>
					<li><a id="tasks" href="#" onclick="listRecords('tasks')"><img src ="images/tasks.png" /><span id="taskCount"></span></a></li>
					<li><a href="#" onclick="listRecords('events')"><img src ="images/events.png" /><span id="eventCount"></span></a></li>
					<li><a href="#"><img src ="images/option.png" /></a></li>
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