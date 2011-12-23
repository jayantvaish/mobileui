package com.intalio.android.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.intalio.android.DAO.PagesDAO;

/**
 * TODO :: what does this class do?
 * 
 * @author ankit
 * 
 */

public class PagesBO {

	private Logger logger = Logger.getLogger(this.getClass());
	private PagesDAO pageDAO;

	public PagesDAO getPagesDAO() {
		return pageDAO;
	}

	public void setPagesDAO(PagesDAO pageDAO1) {
		this.pageDAO = pageDAO1;
	}

	/**
	 * Returns All Pages
	 */
	public List getPages(int from, int to) {
		try {
			return getPagesDAO().getPages(from, to);
		} catch (Exception e) {
			logger.error("Error while getting Pages", e);
		}
		return null;
	}

	/**
	 * Returns Contact Details on its id
	 */
	public List getPagesByIDMain(String contactid) {
		try {
			return getPagesDAO().getPagesOnIDMain(contactid);
		} catch (Exception e) {
			logger.error("Error while getting Main contact on id", e);
		}
		return null;
	}

	public List getPagesByIDStandard(String contactid) {
		try {
			return getPagesDAO().getPagesOnIDStandard(contactid);
		} catch (Exception e) {
			logger.error("Error while getting Standard contact on id", e);
		}
		return null;
	}

	public List getPagesByIDSpecific(String contactid) {
		try {
			return getPagesDAO().getPagesOnIDSpecific(contactid);
		} catch (Exception e) {
			logger.error("Error while getting Specific contact on id", e);
		}
		return null;
	}

	/**
	 * Returns all Pages against an Account
	 */
	public List getPagesByAccount(long accountid, int from, int to) {
		try {
			return getPagesDAO().getPagesOnAccountID(accountid, from, to);
		} catch (Exception e) {
			logger.error("Error while getting Pages on account", e);
		}
		return null;
	}
}
