package com.intalio.android.Constants;

public class AndroidControllerConstants {
	// Action Items
	public static final String actionAccounts = "accounts";
	public static final String actionFolders = "folders";
	public static final String actionContacts = "contacts";
	public static final String actionDocuments = "documents";
	public static final String actionMaps = "maps";
	public static final String actionTopics = "topics";
	public static final String actionPages = "pages";
	public static final String actionSnippets = "snippets";
	public static final String actionContracts = "contracts";
	public static final String actionOpportunities = "opportunities";
	public static final String actionInvoices = "invoices";
	public static final String actionLeads = "leads";
	public static final String actionProducts = "products";
	public static final String actionCompetitors = "competitors";
	public static final String actionPriceList = "pricelists";
	public static final String actionQuotes = "quotes";
	public static final String actionBusinessProcess = "businessprocess";
	public static final String actionCount = "count";
	public static final String actionAssets = "assets";
	public static final String actionCases = "cases";
	public static final String actionSolutions = "solutions";
	public static final String actionReports = "reports";
	public static final String actionTrackings = "trackings";
	public static final String actionKPI = "keyperformanceindicators";
	public static final String actionSLA = "servicelevelagreements";
	public static final String actionML = "marketinglists";
	public static final String actionMC = "marketingcampaigns";
	public static final String actionEvents = "events";
	public static final String actionTasks = "tasks";
	public static final String actionProjects = "projects";
	public static final String actionProcessInstances = "processinstance";
	// Sub Action Items
	public static final String subActionRows = "getrows";
	public static final String subActionInfo = "getinfo";
	public static final String subActionCount = "getcount";
	// Variables
	public static final String varFrom = "startfrom";
	public static final String varUpto = "upto";
	public static final String varId = "id";

	// Entries to validate URL
	public static final String checkAction[] = { actionAccounts, actionFolders, actionContacts,
		actionDocuments, actionMaps, actionTopics, actionPages, actionSnippets, actionContracts,
		actionOpportunities, actionInvoices, actionLeads, actionProducts, actionCompetitors,
		actionPriceList, actionQuotes, actionBusinessProcess, actionCount, actionAssets,
		actionCases, actionSolutions, actionReports, actionTrackings, actionKPI, actionSLA,
		actionML, actionMC, actionEvents, actionTasks, actionProjects, actionProcessInstances};

	public static final String checkSubAction[] = { subActionRows, subActionInfo,
			"getbyaccounts", "getbyproducts", subActionCount };

}
