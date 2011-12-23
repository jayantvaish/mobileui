package com.intalio.android.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.intalio.android.DAO.SnippetsDAO;

/**
 * TODO :: what does this class do?
 * 
 * @author ankit
 * 
 */

public class SnippetsBO {

	private Logger logger = Logger.getLogger(this.getClass());
	private SnippetsDAO snippetDAO;

	public SnippetsDAO getSnippetsDAO() {
		return snippetDAO;
	}

	public void setSnippetsDAO(SnippetsDAO snippetDAO1) {
		this.snippetDAO = snippetDAO1;
	}

	/**
	 * Returns All Snippets
	 */
	public List getSnippets(int from, int to) {
		try {
			return getSnippetsDAO().getSnippets(from, to);
		} catch (Exception e) {
			logger.error("Error while getting Snippets", e);
		}
		return null;
	}

	/**
	 * Returns Contact Details on its id
	 */
	public List getSnippetsByIDMain(String contactid) {
		try {
			return getSnippetsDAO().getSnippetsOnIDMain(contactid);
		} catch (Exception e) {
			logger.error("Error while getting Main contact on id", e);
		}
		return null;
	}

	public List getSnippetsByIDStandard(String contactid) {
		try {
			return getSnippetsDAO().getSnippetsOnIDStandard(contactid);
		} catch (Exception e) {
			logger.error("Error while getting Standard contact on id", e);
		}
		return null;
	}

	public List getSnippetsByIDSpecific(String contactid) {
		try {
			return getSnippetsDAO().getSnippetsOnIDSpecific(contactid);
		} catch (Exception e) {
			logger.error("Error while getting Specific contact on id", e);
		}
		return null;
	}

	/**
	 * Returns all Snippets against an Account
	 */
	public List getSnippetsByAccount(long accountid, int from, int to) {
		try {
			return getSnippetsDAO().getSnippetsOnAccountID(accountid, from, to);
		} catch (Exception e) {
			logger.error("Error while getting Snippets on account", e);
		}
		return null;
	}
}
