<!DOCTYPE html> 
<%@ page language="java"%>
<%
   String username =(String) session.getAttribute("username");
   if(username==null){
   	response.sendRedirect("login.jsp");
   }
%>
<html> 
<jsp:include page="header.jsp" />
<body> 
<div data-role="page">
	<div id="listObjects" data-role="content">	
		
		<div id="objectList" data-role="collapsible-set">    
		               
	    	<div id="resultsContainer" data-role="collapsible" data-collapsed="true">
	         <h3>Activities</h3>		
				<ul data-role="listview" data-inset="false">			                
				
					<!-- <li data-theme="c">Activities</li> -->
					
					<li data-theme="d">
						<a href="#" onclick="listRecords('events')">
							<img class="ui-li-icon" src="images/events.png" width="16px" height="11px" >Events<span id="events" class="ui-li-count">0</span>
						</a></li>
						
					<li data-theme="d">
						<a href="#" onclick="listRecords('tasks')">
							<img class="ui-li-icon" src="images/tasks.png" width="16px" height="11px" >Tasks<span id="tasks" class="ui-li-count">0</span>
						</a></li>
		
					<li data-theme="d">
						<a href="#" onclick="listRecords('projects')">
							<img class="ui-li-icon" src="images/projects.png" width="16px" height="11px" >Projects<span id="projects" class="ui-li-count">0</span>
						</a></li>
				</ul>
			</div>
			
			<div id="resultsContainer" data-role="collapsible" data-collapsed="true">
	         <h3>Processes</h3>		
				<ul data-role="listview" data-inset="false">						
					<!-- <li data-theme="c">Processes</li> -->
					<li data-theme="d">
						<a href="#" onclick="listRecords('businessprocess')">
							<img class="ui-li-icon" src="images/business_processes.png" width="16px" height="11px" >Business Processes<span id="businessprocess" class="ui-li-count">0</span>
						</a></li>
					<li data-theme="d">
						<a href="#" onclick="listRecords('processinstance')">
							<img class="ui-li-icon" src="images/process_instances.png" width="16px" height="11px" >Process Instances<span id="processinstance" class="ui-li-count">0</span>
						</a></li>
				</ul>
			</div>
			
			<div id="resultsContainer" data-role="collapsible" data-collapsed="true">
	         <h3>Contents</h3>		
				<ul data-role="listview" data-inset="false">		
					<!-- <li data-theme="c">Contents</li> -->
					<li data-theme="d">
						<a href="#" onclick="listRecords('folders')">
							<img class="ui-li-icon" src="images/folders.png" width="16px" height="11px" >Folders<span id="folders" class="ui-li-count">0</span>
						</a></li>
					<li data-theme="d">
						<a href="#" onclick="listRecords('documents')">
							<img class="ui-li-icon" src="images/documents.png" width="16px" height="11px" >Documents<span id="documents" class="ui-li-count">0</span>
						</a></li>
					<li data-theme="d">
						<a href="#" onclick="listRecords('maps')">
							<img class="ui-li-icon" src="images/maps.png" width="16px" height="11px" >Maps<span id="maps" class="ui-li-count">0</span>
						</a></li>
					<li data-theme="d">
						<a href="#" onclick="listRecords('topics')">
							<img class="ui-li-icon" src="images/topics.png" width="16px" height="11px" >Topics<span id="topics" class="ui-li-count">0</span>
						</a></li>
					<li data-theme="d">
						<a href="#" onclick="listRecords('pages')">
							<img class="ui-li-icon" src="images/pages.png" width="16px" height="11px" >Pages<span id="pages" class="ui-li-count">0</span>
						</a></li>
					<!-- <li data-theme="d">
						<a href="#" onclick="listRecords('layouts')">
							<img class="ui-li-icon" src="images/layouts.png" width="16px" height="11px" >Layouts<span id="layouts" class="ui-li-count">0</span>
						</a></li> -->
				</ul>
			</div>
			
			<div id="resultsContainer" data-role="collapsible" data-collapsed="true">
	         <h3>Marketing</h3>		
				<ul data-role="listview" data-inset="false">			
					<!-- <li data-theme="c">Marketing</li> -->
					<li data-theme="d">
						<a href="#" onclick="listRecords('marketinglists')">
							<img class="ui-li-icon" src="images/marketing_lists.png" width="16px" height="11px" >Marketing Lists<span id="marketinglists" class="ui-li-count">0</span>
						</a></li>
					<li data-theme="d">
						<a href="#" onclick="listRecords('marketingcampaigns')">
							<img class="ui-li-icon" src="images/marketing_campaigns.png" width="16px" height="11px" >Marketing Campaigns<span id="marketingcampaigns" class="ui-li-count">0</span>
						</a></li>
				</ul>
			</div>
			
			<div id="resultsContainer" data-role="collapsible" data-collapsed="true">
	         <h3>Sales</h3>		
				<ul data-role="listview" data-inset="false">			
					<!-- <li data-theme="c">Sales</li> -->
					<li data-theme="d">
						<a href="#" onclick="listRecords('leads')">
							<img class="ui-li-icon" src="images/leads.png" width="16px" height="11px" >Leads<span id="leads" class="ui-li-count">0</span>
						</a></li>
					<li data-theme="d">
						<a href="#" onclick="listRecords('opportunities')">
							<img class="ui-li-icon" src="images/opportunities.png" width="16px" height="11px" >Opportunities<span id="opportunities" class="ui-li-count">0</span>
						</a></li>
					<li data-theme="d">
						<a href="#" onclick="listRecords('accounts')">
							<img class="ui-li-icon" src="images/accounts.png" width="16px" height="11px" >Accounts<span id="accounts" class="ui-li-count">0</span>
						</a></li>
					<li data-theme="d">
						<a href="#" onclick="listRecords('contacts')">
							<img class="ui-li-icon" src="images/contacts.png" width="16px" height="11px" >Contacts<span id="contacts" class="ui-li-count">0</span>
						</a></li>
					<li data-theme="d">
						<a href="#" onclick="listRecords('products')">
							<img class="ui-li-icon" src="images/products.png" width="16px" height="11px" >Products<span id="products" class="ui-li-count">0</span>
						</a></li>
					<li data-theme="d">
						<a href="#" onclick="listRecords('quotes')">
							<img class="ui-li-icon" src="images/quotes.png" width="16px" height="11px" >Quotes<span id="quotes" class="ui-li-count">0</span>
						</a></li>
					<li data-theme="d">
						<a href="#" onclick="listRecords('contracts')">
							<img class="ui-li-icon" src="images/contracts.png" width="16px" height="11px" >Contracts<span id="contracts" class="ui-li-count">0</span>
						</a></li>
					<li data-theme="d">
						<a href="#" onclick="listRecords('invoices')">
							<img class="ui-li-icon" src="images/invoices.png" width="16px" height="11px" >Invoices<span id="invoices" class="ui-li-count">0</span>
						</a></li>
				</ul>
			</div>
			
			<div id="resultsContainer" data-role="collapsible" data-collapsed="true">
	         <h3>Support</h3>		
				<ul data-role="listview" data-inset="false">			
					<!-- <li data-theme="c">Support</li> -->
					<li data-theme="d">
						<a href="#" onclick="listRecords('assets')">
							<img class="ui-li-icon" src="images/assets.png" width="16px" height="11px" >Assets<span id="assets" class="ui-li-count">0</span>
						</a></li>
					<li data-theme="d">
						<a href="#" onclick="listRecords('cases')">
							<img class="ui-li-icon" src="images/cases.png" width="16px" height="11px" >Cases<span id="cases" class="ui-li-count">0</span>
						</a></li>
					<li data-theme="d">
						<a href="#" onclick="listRecords('solutions')">
							<img class="ui-li-icon" src="images/solutions.png" width="16px" height="11px" >Solutions<span id="solutions" class="ui-li-count">0</span>
						</a></li>
				</ul>
			</div>
			
			<div id="resultsContainer" data-role="collapsible" data-collapsed="true">
	         <h3>Performance</h3>		
				<ul data-role="listview" data-inset="false">			
					<!-- <li data-theme="c">Performance</li> -->
					<li data-theme="d">
						<a href="#" onclick="listRecords('reports')">
							<img class="ui-li-icon" src="images/reports.png" width="16px" height="11px" >Reports<span id="reports" class="ui-li-count">0</span>
						</a></li>
					<!-- <li data-theme="d">
						<a href="#" onclick="listRecords('charts')">
							<img class="ui-li-icon" src="images/charts.png" width="16px" height="11px" >Charts<span id="charts" class="ui-li-count">0</span>
						</a></li>
					<li data-theme="d">
						<a href="#" onclick="listRecords('charttypes')">
							<img class="ui-li-icon" src="images/chart_types.png" width="16px" height="11px" >Chart Types<span id="charttypes" class="ui-li-count">0</span>
						</a></li> -->
					<li data-theme="d">
						<a href="#" onclick="listRecords('trackings')">
							<img class="ui-li-icon" src="images/trackings.png" width="16px" height="11px" >Trackings<span id="trackings" class="ui-li-count">0</span>
						</a></li>
					<!-- <li data-theme="d">
						<a href="#" onclick="listRecords('trackingvalue')">
							<img class="ui-li-icon" src="images/tracking_value.png" width="16px" height="11px" >Tracking Value<span id="trackingvalue" class="ui-li-count">0</span>
						</a></li>
					<li data-theme="d">
						<a href="#" onclick="listRecords('trackingfields')">
							<img class="ui-li-icon" src="images/tracking_fields.png" width="16px" height="11px" >Tracking Fields<span id="trackingfields" class="ui-li-count">0</span>
						</a></li>
					<li data-theme="d">
						<a href="#" onclick="listRecords('trackinggroups')">
							<img class="ui-li-icon" src="images/tracking_groups.png" width="16px" height="11px" >Tracking Groups<span id="trackinggroups" class="ui-li-count">0</span>
						</a></li>
					<li data-theme="d">
						<a href="#" onclick="listRecords('trackingpoints')">
							<img class="ui-li-icon" src="images/tracking_points.png" width="16px" height="11px" >Tracking Points<span id="trackingpoints" class="ui-li-count">0</span>
						</a></li>
					<li data-theme="d">
						<a href="#" onclick="listRecords('trackingscheduler')">
							<img class="ui-li-icon" src="images/tracking_scheduler.png" width="16px" height="11px" >Tracking Scheduler<span id="trackingscheduler" class="ui-li-count">0</span>
						</a></li>
					<li data-theme="d">
						<a href="#" onclick="listRecords('timingintervals')">
							<img class="ui-li-icon" src="images/timing_intervals.png" width="16px" height="11px" >Timing Intervals<span id="timingintervals" class="ui-li-count">0</span>
						</a></li> -->
					<li data-theme="d">
						<a href="#" onclick="listRecords('keyperformanceindicators')">
							<img class="ui-li-icon" src="images/key_performance_indicators.png" width="16px" height="11px" >Key Performance Indicators<span id="keyperformanceindicators" class="ui-li-count">0</span>
						</a></li>
					<li data-theme="d">
						<a href="#" onclick="listRecords('servicelevelagreements')">
							<img class="ui-li-icon" src="images/service_level_agreements.png" width="16px" height="11px" >Service Level Agreements<span id="servicelevelagreements" class="ui-li-count">0</span>
						</a></li>
					<!-- <li data-theme="d">
						<a href="#" onclick="listRecords('simulationdistributions')">
							<img class="ui-li-icon" src="images/simulation_distributions.png" width="16px" height="11px" >Simulation Distributions<span id="simulationdistributions" class="ui-li-count">0</span>
						</a></li>
					<li data-theme="d">
						<a href="#" onclick="listRecords('simulationsamples')">
							<img class="ui-li-icon" src="images/simulation_samples.png" width="16px" height="11px" >Simulation Samples<span id="simulationsamples" class="ui-li-count">0</span>
						</a></li>
					<li data-theme="d">
						<a href="#" onclick="listRecords('simulationscenarios')">
							<img class="ui-li-icon" src="images/simulation_scenarios.png" width="16px" height="11px" >Simulation Scenarios<span id="simulationscenarios" class="ui-li-count">0</span>
						</a></li> -->
				</ul>
						
			</div>
			
		</div>
	</div>
	
	<jsp:include page="footer.jsp" />
	
	<script type="text/javascript" src="js/applications.js"></script>
	<!-- <script type="text/javascript" src="js/footer.js"></script> -->
	<script type="text/javascript">
		$(document).bind("pagebeforechange", processPage());
		
		function processPage(){
			showCounts();
			//processFooter('applications');
		}
	</script>
</div>

</body>
</html>
