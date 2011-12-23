package com.intalio.android.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.intalio.android.DAO.QuotesDAO;

/**
 * @author ankit
 * 
 */

public class QuotesBO {

	private Logger logger = Logger.getLogger(this.getClass());
	private QuotesDAO quotesDAO;

	public QuotesDAO getQuotesDAO() {
		System.out.println("Third");
		return quotesDAO;
	}

	public void setQuotesDAO(QuotesDAO quotesDAO) {
		this.quotesDAO = quotesDAO;
	}

	/**
	 * Returns All quotes
	 */
	public List getQuotes(int from, int to) {
		try {
			return getQuotesDAO().getQuotes(from, to);
		} catch (Exception e) {
			logger.error("Error while getting quotes", e);
		}
		return null;
	}

	/**
	 * Returns quotes Details on its id
	 */
	public List getQuotesByIDMain(String quoteid) {
		try {
			return getQuotesDAO().getQuotesOnIDMain(quoteid);
		} catch (Exception e) {
			logger.error("Error while getting quotes on id", e);
		}
		return null;
	}

	public List getQuotesByIDStandard(String quoteid) {
		try {
			return getQuotesDAO().getQuotesOnIDStandard(quoteid);
		} catch (Exception e) {
			logger.error("Error while getting  Standard quotes on id", e);
		}
		return null;
	}

	public List getQuotesByIDSpecific(String quoteid) {
		try {
			return getQuotesDAO().getQuotesOnIDSpecific(quoteid);
		} catch (Exception e) {
			logger.error("Error while getting Specific quotes on id", e);
		}
		return null;
	}

	/**
	 * Returns all quotes against an Account
	 */
	public List getQuotesByAccount(long accountid, int from, int to) {
		try {
			return getQuotesDAO().getQuotesOnAccountID(accountid, from, to);
		} catch (Exception e) {
			logger.error("Error while getting quotes on account", e);
		}
		return null;
	}

}
