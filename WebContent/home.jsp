<jsp:include page="header.jsp" />
<link rel='stylesheet' type='text/css' href='css/dashlet.css'/> 
<body>
	<div data-role="page"  data-theme="d" data-iscroll="enable">
		<div data-role="header"></div>
			
		<div data-role="content">
		<div data-iscroll="scroller">
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

			<div style="margin-top:5%">
				<ul data-role="listview" data-inset="false" data-filter="false">
					<li>
						<div style="height:80px">
							<div class="io-tracking-dashlet-name">
								<a href="#">Meta-Data Quality</a>
							</div>
							<div class="io-dashlet-tracking-health-green" >&nbsp;</div>
							<div class="io-dashlet-tracking-change">
							<div class="io-dashlet-tracking-change-good" >+18%</div>
							</div>
							<div class="io-dashlet-tracking-value" >
							72
							<span class="io-dashlet-tracking-suffix">%</span>
							</div>
							<div class="io-dashlet-tracking-target" >TARGET: 100%</div>									
						</div>					
					</li>
					<li>						
						<div style="height:80px">
							<div class="io-tracking-dashlet-name">
								<a href="#">Network Activity</a>
							</div>							
							<div class="io-dashlet-tracking-health-green" >&nbsp;</div>
							<div class="io-dashlet-tracking-change">
							<div class="io-dashlet-tracking-change-good" >+7%</div>
							</div>
							<div class="io-dashlet-tracking-value" >
							59
							</div>
							<div class="io-dashlet-tracking-target" >TARGET: 75</div>				
						</div>
					</li>
					<li>	
						<div style="height:80px">
							<div class="io-tracking-dashlet-name">
								<a href="#">Website Visits</a>
							</div>
							<div class="io-dashlet-tracking-health-yellow" >&nbsp;</div>
							<div class="io-dashlet-tracking-change">
							<div class="io-dashlet-tracking-change-good" >+13%</div>
							</div>
							<div class="io-dashlet-tracking-value" >
							354
							<span class="io-dashlet-tracking-suffix">K</span>							
							</div>
							<div class="io-dashlet-tracking-target" >TARGET: 500K</div>				
						</div>
					</li>
					<li>
						<div style="height:80px">
							<div class="io-tracking-dashlet-name">
								<a href="#">Quarterly Bookings</a>
							</div>
							<div class="io-dashlet-tracking-health-green" >&nbsp;</div>
							<div class="io-dashlet-tracking-change">
							<div class="io-dashlet-tracking-change-good" >+39%</div>
							</div>
							<div class="io-dashlet-tracking-value" >
							<span class="io-dashlet-tracking-prefix">$</span>
							1.7
							<span class="io-dashlet-tracking-suffix">M</span>
							</div>
							<div class="io-dashlet-tracking-target" >TARGET: $1.5M</div>				
						</div>
					</li>
					<li>
						<div style="height:80px">
							<div class="io-tracking-dashlet-name">
								<a href="#">NYSE:VMW</a>
							</div>
							<div class="io-dashlet-tracking-health-green" >&nbsp;</div>
							<div class="io-dashlet-tracking-change">
							<div class="io-dashlet-tracking-change-good" >++2.41%</div>
							</div>
							<div class="io-dashlet-tracking-value" >
							85
							<span class="io-dashlet-tracking-suffix">.00</span>
							</div>
							<div class="io-dashlet-tracking-target" >TARGET: 120	</div>				
						</div>
					</li>
					<li>
						<div style="height:80px">
							<div class="io-tracking-dashlet-name">
								<a href="#">Project Status</a>
							</div>
							<div class="io-dashlet-tracking-health-red" >&nbsp;</div>
							<div class="io-dashlet-tracking-change">
							<div class="io-dashlet-tracking-change-good" >  --</div>
							</div>
							<div class="io-dashlet-tracking-value" >
							0
							<span class="io-dashlet-tracking-suffix">	</span>
							</div>
							<div class="io-dashlet-tracking-target" >TARGET: 120	</div>				
						</div>
					</li>
				</ul> 
			</div>
		</div>
		</div>		
		
		<div data-role="footer" data-position="fixed" >
			<div data-role="navbar">
				<ul>
					<li><a id="home" class="ui-btn-active" href="#" onclick="javascript:window.location.href='home.jsp'"><img src ="images/home.png" style="height:32px; width:32px" /></a></li>
					<li><a id="applications" href="#" onclick="javascript:window.location.href='applications.jsp'"><img src ="images/application.png" style="height:32px; width:32px" /></a></li>
					<li><a id="tasks" href="#" onclick="listRecords('tasks')"><img src ="images/tasks.png" style="height:32px; width:32px" /><span id="taskCount"></span></a></li>
					<!-- <li><a href="#" onclick="listRecords('events')"><img src ="images/events.png" style="height:32px; width:32px" /><span id="eventCount"></span></a></li> -->
					<li><a id="applications" href="#" onclick="javascript:window.location.href='taskcalenderview.jsp'"><img src ="images/events.png" style="height:32px; width:32px" /></a></li>
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