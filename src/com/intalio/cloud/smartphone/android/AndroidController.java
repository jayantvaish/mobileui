package com.intalio.cloud.smartphone.android;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.intalio.android.Constants.AndroidControllerConstants;

/**
 * Main controller. Checks the authenticity of the Request. It calls the method
 * from the BO classes as per the request parameters. Sends the result-set in
 * JSON format.
 * 
 * @author ankit
 */
public class AndroidController extends ObjectGenerator implements Controller {

	private AndroidControllerConstants constant;

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Logger log = Logger.getLogger(this.getClass());
		Map model = new LinkedHashMap();
		Map inner = new HashMap();

		// Following code checks the authenticity of the request URL
		boolean proceed = true;
		String ErrorMessage = "";
		String action = "";
		String subaction = "";
		String id = "";
		int startfrom = 0;
		int upto = 0;
		;

		try {
			// Checking the Action
			if (request.getParameter("action") != null) {
				String action1 = request.getParameter("action");
				for (int i = 0; i < constant.checkAction.length; i++) {
					if (action1.equals(constant.checkAction[i])) {
						proceed = true;
						break;
					} else // action is not correct
					{
						proceed = false;
						ErrorMessage = "No such action is defined";
					}
				}
			} else {
				proceed = false;
				ErrorMessage = "No action is defined";
			}

			// Checking the SubAction
			if (proceed) {
				if (request.getParameter("subaction") != null) {
					String subaction1 = request.getParameter("subaction");
					for (int i = 0; i < constant.checkSubAction.length; i++) {
						if (subaction1.equals(constant.checkSubAction[i])) {
							proceed = true;
							break;
						} else // sub action is not correct
						{
							proceed = false;
							ErrorMessage = "No such sub action is defined";
						}
					}
				} else {
					proceed = false;
					ErrorMessage = "No sub action is defined";
				}
			}
			// Checking and Fetching the parameters
			if (proceed) {

				action = request.getParameter("action");
				subaction = request.getParameter("subaction");

				if (subaction.equals(constant.subActionRows)) {
					startfrom = Integer.parseInt(request
							.getParameter(constant.varFrom));
					upto = Integer.parseInt(request
							.getParameter(constant.varUpto));
					if ((startfrom == 0) || (upto == 0) || (startfrom > upto)) {
						proceed = false;
						ErrorMessage = "Range is not proper";
					}
				} else if (subaction.equals(constant.subActionInfo)) {
					id = request.getParameter(constant.varId);
				}

			}
			// if the URL is correct then only this block will get executed
			if (proceed) {

				if (action.equals(constant.actionCount)) {
					if (subaction.equals(constant.subActionCount)) {
						model.put("count", genericBO.getObjectCount());
					}
				} 
				else if (action.equals(constant.actionEvents)) 
				{	
					if (subaction.equals(constant.subActionRows)) 
					{
					
						model.put("data", eventsBO.getEvents(startfrom, upto));
					} 
					else if (subaction.equals(constant.subActionInfo)) 
					{
						inner.put("main", eventsBO.getEventByIDMain(id));
						inner.put("standard", eventsBO.getEventByIDStandard(id));
						inner.put("specific", eventsBO.getEventByIDSpecific(id));
						model.put("data", inner);
					}
				
				} else if (action.equals(constant.actionTasks)) 
				{
					if (subaction.equals(constant.subActionRows)) 
					{
					
						model.put("data", tasksBO.getTasks(startfrom, upto));
					} 
					else if (subaction.equals(constant.subActionInfo)) 
					{
						inner.put("main", tasksBO.getTaskByIDMain(id));
						inner.put("standard", tasksBO.getTaskByIDStandard(id));
						inner.put("specific", tasksBO.getTaskByIDSpecific(id));
						model.put("data", inner);
					}
				
				} else if (action.equals(constant.actionProjects)) 
				{
					if (subaction.equals(constant.subActionRows)) 
					{
					
						model.put("data", projectsBO.getProjects(startfrom, upto));
					} 
					else if (subaction.equals(constant.subActionInfo)) 
					{
						inner.put("main", projectsBO.getProjectByIDMain(id));
						inner.put("standard", projectsBO.getProjectByIDStandard(id));
						inner.put("specific", projectsBO.getProjectByIDSpecific(id));
						model.put("data", inner);
					}
				
				} else if (action.equals(constant.actionProcessInstances)) 
				{						
					if (subaction.equals(constant.subActionRows)) 
					{
					
						model.put("data", processInstancesBO.getProcessInstances(startfrom, upto));
					} 
					else if (subaction.equals(constant.subActionInfo)) 
					{
						inner.put("main", processInstancesBO.getProcessInstanceByIDMain(id));
						inner.put("standard", processInstancesBO.getProcessInstanceByIDStandard(id));
						inner.put("specific", processInstancesBO.getProcessInstanceByIDSpecific(id));
						model.put("data", inner);
					}
				
				} 
				else if (action.equals(constant.actionAccounts)) {
					if (subaction.equals(constant.subActionRows)) {

						model.put("data",
								accountBO.getAccounts(startfrom, upto));
					} else if (subaction.equals(constant.subActionInfo)) {
						inner.put("main", accountBO.getAccountsByIDMain(id));
						inner.put("standard",
								accountBO.getAccountsByIDStandard(id));
						inner.put("specific",
								accountBO.getAccountsByIDSpecific(id));
						model.put("data", inner);
						// model.put("data1", specific);
					}

				} else if (action.equals(constant.actionContacts)) {
					if (subaction.equals(constant.subActionRows)) {
						model.put("data",
								contactsBO.getContacts(startfrom, upto));
					} else if (subaction.equals(constant.subActionInfo)) {
						inner.put("main", contactsBO.getContactsByIDMain(id));
						inner.put("standard",
								contactsBO.getContactsByIDStandard(id));
						inner.put("specific",
								contactsBO.getContactsByIDSpecific(id));
						model.put("data", inner);
					}

				} else if (action.equals(constant.actionContracts)) {
					if (subaction.equals(constant.subActionRows)) {
						model.put("data",
								contractsBO.getContracts(startfrom, upto));
					} else if (subaction.equals(constant.subActionInfo)) {
						inner.put("main", contractsBO.getContractsByIDMain(id));
						inner.put("standard",
								contractsBO.getContractsByIDStandard(id));
						inner.put("specific",
								contractsBO.getContractsByIDSpecific(id));
						model.put("data", inner);

					}

				} else if (action.equals(constant.actionOpportunities)) {
					if (subaction.equals(constant.subActionRows)) {

						model.put("data", opportunitiesBO.getOpportunities(
								startfrom, upto));
					} else if (subaction.equals(constant.subActionInfo)) {
						inner.put("main",
								opportunitiesBO.getOpportunitiesByIDMain(id));
						inner.put("standard", opportunitiesBO
								.getOpportunitiesByIDStandard(id));
						inner.put("specific", opportunitiesBO
								.getOpportunitiesByIDSpecific(id));
						model.put("data", inner);

					}
				} else if (action.equals(constant.actionInvoices)) {
					if (subaction.equals(constant.subActionRows)) {
						model.put("data",
								invoicesBO.getInvoices(startfrom, upto));
					} else if (subaction.equals(constant.subActionInfo)) {
						inner.put("main", invoicesBO.getInvoicesByIDMain(id));
						inner.put("standard",
								invoicesBO.getInvoicesByIDStandard(id));
						inner.put("specific",
								invoicesBO.getInvoicesByIDSpecific(id));
						model.put("data", inner);
					}
				} else if (action.equals(constant.actionLeads)) {
					if (subaction.equals(constant.subActionRows)) {

						model.put("data", leadsBO.getLeads(startfrom, upto));
					} else if (subaction.equals(constant.subActionInfo)) {
						inner.put("main", leadsBO.getLeadsByIDMain(id));
						inner.put("standard", leadsBO.getLeadsByIDStandard(id));
						inner.put("specific", leadsBO.getLeadsByIDSpecific(id));
						model.put("data", inner);

					}
				} else if (action.equals(constant.actionProducts)) {
					if (subaction.equals(constant.subActionRows)) {

						model.put("data",
								productsBO.getProducts(startfrom, upto));
					} else if (subaction.equals(constant.subActionInfo)) {

						inner.put("main", productsBO.getProductsByIDMain(id));
						inner.put("standard",
								productsBO.getProductsByIDStandard(id));
						inner.put("specific",
								productsBO.getProductsByIDSpecific(id));
						model.put("data", inner);
					}
				} else if (action.equals(constant.actionCompetitors)) {
					if (subaction.equals(constant.subActionRows)) {
						model.put("data",
								competitorsBO.getCompetitors(startfrom, upto));
					} else if (subaction.equals(constant.subActionInfo)) {
						model.put("data", competitorsBO.getCompetitorsByID(id));
					}
				} else if (action.equals(constant.actionPriceList)) {
					if (subaction.equals(constant.subActionRows)) {
						model.put("data",
								pricelistsBO.getPriceLists(startfrom, upto));
					} else if (subaction.equals(constant.subActionInfo)) {
						model.put("data", pricelistsBO.getPriceListsByID(id));
					}

				} else if (action.equals(constant.actionQuotes)) {
					if (subaction.equals(constant.subActionRows)) {

						model.put("data", quotesBO.getQuotes(startfrom, upto));
					} else if (subaction.equals(constant.subActionInfo)) {
						inner.put("main", quotesBO.getQuotesByIDMain(id));
						inner.put("standard",
								quotesBO.getQuotesByIDStandard(id));
						inner.put("specific",
								quotesBO.getQuotesByIDSpecific(id));
						model.put("data", inner);
					}

				} else if (action.equals(constant.actionBusinessProcess)) 
				{
					if (subaction.equals(constant.subActionRows)) 
					{
						model.put("data", businessProcessBO.getBusinessProcesses(startfrom, upto));
					} 
					else if (subaction.equals(constant.subActionInfo)) 
					{	
						inner.put("main", businessProcessBO.getProcessByIDMain(id));
						inner.put("standard", businessProcessBO.getProcessByIDStandard(id));
						inner.put("specific", businessProcessBO.getProcessByIDSpecific(id));
						model.put("data", inner);
					}
				} else if (action.equals(constant.actionAssets)) {
					if (subaction.equals(constant.subActionRows)) {
						model.put("data", assetsBO.getAssets(startfrom, upto));
					} else if (subaction.equals(constant.subActionInfo)) {
						inner.put("main", assetsBO.getAssetsByIDMain(id));
						inner.put("standard",
								assetsBO.getAssetsByIDStandard(id));
						inner.put("specific",
								assetsBO.getAssetsByIDSpecific(id));
						model.put("data", inner);
					}
				} else if (action.equals(constant.actionCases)) {
					if (subaction.equals(constant.subActionRows)) {
						model.put("data", casesBO.getCases(startfrom, upto));
					} else if (subaction.equals(constant.subActionInfo)) {
						inner.put("main", casesBO.getCasesByIDMain(id));
						inner.put("standard", casesBO.getCasesByIDStandard(id));
						inner.put("specific", casesBO.getCasesByIDSpecific(id));
						model.put("data", inner);
					}
				} else if (action.equals(constant.actionSolutions)) {
					if (subaction.equals(constant.subActionRows)) {
						model.put("data",
								solutionsBO.getSolutions(startfrom, upto));
					} else if (subaction.equals(constant.subActionInfo)) {
						inner.put("main", solutionsBO.getSolutionsByIDMain(id));
						inner.put("standard",
								solutionsBO.getSolutionsByIDStandard(id));
						inner.put("specific",
								solutionsBO.getSolutionsByIDSpecific(id));
						model.put("data", inner);
					}
				} else if (action.equals(constant.actionReports)) {
					if (subaction.equals(constant.subActionRows)) {
						model.put("data", reportsBO.getReports(startfrom, upto));
					} else if (subaction.equals(constant.subActionInfo)) {

						inner.put("main", reportsBO.getReportsByIDMain(id));
						inner.put("standard",
								reportsBO.getReportsByIDStandard(id));
						inner.put("specific",
								reportsBO.getReportsByIDSpecific(id));
						model.put("data", inner);
					}
				} else if (action.equals(constant.actionTrackings)) {
					if (subaction.equals(constant.subActionRows)) {
						model.put("data",
								trackingsBO.getTrackings(startfrom, upto));
					} else if (subaction.equals(constant.subActionInfo)) {

						inner.put("main", trackingsBO.getTrackingsByIDMain(id));
						inner.put("standard",
								trackingsBO.getTrackingsByIDStandard(id));
						inner.put("specific",
								trackingsBO.getTrackingsByIDSpecific(id));
						model.put("data", inner);
					}
				} else if (action.equals(constant.actionKPI)) {
					if (subaction.equals(constant.subActionRows)) {
						model.put("data", kpiBO.getKPI(startfrom, upto));
					} else if (subaction.equals(constant.subActionInfo)) {

						inner.put("main", kpiBO.getKPIByIDMain(id));
						inner.put("standard", kpiBO.getKPIByIDStandard(id));
						inner.put("specific", kpiBO.getKPIByIDSpecific(id));
						model.put("data", inner);
					}
				} else if (action.equals(constant.actionSLA)) {
					if (subaction.equals(constant.subActionRows)) {
						model.put("data", slaBO.getSLA(startfrom, upto));
					} else if (subaction.equals(constant.subActionInfo)) {

						inner.put("main", slaBO.getSLAByIDMain(id));
						inner.put("standard", slaBO.getSLAByIDStandard(id));
						inner.put("specific", slaBO.getSLAByIDSpecific(id));
						model.put("data", inner);
					}
				} else if (action.equals(constant.actionML)) {
					if (subaction.equals(constant.subActionRows)) {
						model.put("data", marketingListsBO.getMarketingLists(
								startfrom, upto));
					} else if (subaction.equals(constant.subActionInfo)) {

						inner.put("main",
								marketingListsBO.getMarketingListsByIDMain(id));
						inner.put("standard", marketingListsBO
								.getMarketingListsByIDStandard(id));
						inner.put("specific", marketingListsBO
								.getMarketingListsByIDSpecific(id));
						model.put("data", inner);
					}
				} else if (action.equals(constant.actionMC)) {
					if (subaction.equals(constant.subActionRows)) {
						model.put("data", marketingCampaignsBO
								.getMarketingCampaigns(startfrom, upto));
					} else if (subaction.equals(constant.subActionInfo)) {

						inner.put("main", marketingCampaignsBO
								.getMarketingCampaignsByIDMain(id));
						inner.put("standard", marketingCampaignsBO
								.getMarketingCampaignsByIDStandard(id));
						inner.put("specific", marketingCampaignsBO
								.getMarketingCampaignsByIDSpecific(id));
						model.put("data", inner);
					}
				} else if (action.equals(constant.actionFolders)) {
					if (subaction.equals(constant.subActionRows)) {
						model.put("data", foldersBO.getFolders(startfrom, upto));
					} else if (subaction.equals(constant.subActionInfo)) {

						inner.put("main", foldersBO.getFoldersByIDMain(id));
						inner.put("standard",
								foldersBO.getFoldersByIDStandard(id));
						inner.put("specific",
								foldersBO.getFoldersByIDSpecific(id));
						model.put("data", inner);
					}
				} else if (action.equals(constant.actionDocuments)) {
					if (subaction.equals(constant.subActionRows)) {
						model.put("data",
								documentsBO.getDocuments(startfrom, upto));
					} else if (subaction.equals(constant.subActionInfo)) {

						inner.put("main", documentsBO.getDocumentsByIDMain(id));
						inner.put("standard",
								documentsBO.getDocumentsByIDStandard(id));
						inner.put("specific",
								documentsBO.getDocumentsByIDSpecific(id));
						model.put("data", inner);
					}
				} else if (action.equals(constant.actionMaps)) {
					if (subaction.equals(constant.subActionRows)) {
						model.put("data", mapBO.getMaps(startfrom, upto));
					} else if (subaction.equals(constant.subActionInfo)) {

						inner.put("main", mapBO.getMapsByIDMain(id));
						inner.put("standard", mapBO.getMapsByIDStandard(id));
						inner.put("specific", mapBO.getMapsByIDSpecific(id));
						model.put("data", inner);
					}
				} else if (action.equals(constant.actionTopics)) {
					if (subaction.equals(constant.subActionRows)) {
						model.put("data", topicBO.getTopics(startfrom, upto));
					} else if (subaction.equals(constant.subActionInfo)) {

						inner.put("main", topicBO.getTopicsByIDMain(id));
						inner.put("standard", topicBO.getTopicsByIDStandard(id));
						inner.put("specific", topicBO.getTopicsByIDSpecific(id));
						model.put("data", inner);
					}
				} else if (action.equals(constant.actionPages)) {
					if (subaction.equals(constant.subActionRows)) {
						model.put("data", pageBO.getPages(startfrom, upto));
					} else if (subaction.equals(constant.subActionInfo)) {

						inner.put("main", pageBO.getPagesByIDMain(id));
						inner.put("standard", pageBO.getPagesByIDStandard(id));
						inner.put("specific", pageBO.getPagesByIDSpecific(id));
						model.put("data", inner);
					}
				} else if (action.equals(constant.actionSnippets)) {
					if (subaction.equals(constant.subActionRows)) {
						model.put("data",
								snippetBO.getSnippets(startfrom, upto));
					} else if (subaction.equals(constant.subActionInfo)) {

						inner.put("main", snippetBO.getSnippetsByIDMain(id));
						inner.put("standard",
								snippetBO.getSnippetsByIDStandard(id));
						inner.put("specific",
								snippetBO.getSnippetsByIDSpecific(id));
						model.put("data", inner);
					} 
				}

			} else {
				model.put("Error", ErrorMessage);
			}
			ModelAndView modelAndView = new ModelAndView("jsonView", model);
			return modelAndView;
		} catch (Exception e) {
			e.printStackTrace();
		}

		ModelAndView modelAndView = new ModelAndView("jsonView", model);
		return modelAndView;

	}

}
