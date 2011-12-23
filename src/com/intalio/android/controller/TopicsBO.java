package com.intalio.android.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.intalio.android.DAO.TopicsDAO;

/**
 * TODO :: what does this class do?
 * 
 * @author ankit
 * 
 */

public class TopicsBO {

	private Logger logger = Logger.getLogger(this.getClass());
	private TopicsDAO topicDAO;

	public TopicsDAO getTopicsDAO() {
		return topicDAO;
	}

	public void setTopicsDAO(TopicsDAO topicDAO1) {
		this.topicDAO = topicDAO1;
	}

	/**
	 * Returns All Topics
	 */
	public List getTopics(int from, int to) {
		try {
			return getTopicsDAO().getTopics(from, to);
		} catch (Exception e) {
			logger.error("Error while getting Topics", e);
		}
		return null;
	}

	/**
	 * Returns Contact Details on its id
	 */
	public List getTopicsByIDMain(String contactid) {
		try {
			return getTopicsDAO().getTopicsOnIDMain(contactid);
		} catch (Exception e) {
			logger.error("Error while getting Main contact on id", e);
		}
		return null;
	}

	public List getTopicsByIDStandard(String contactid) {
		try {
			return getTopicsDAO().getTopicsOnIDStandard(contactid);
		} catch (Exception e) {
			logger.error("Error while getting Standard contact on id", e);
		}
		return null;
	}

	public List getTopicsByIDSpecific(String contactid) {
		try {
			return getTopicsDAO().getTopicsOnIDSpecific(contactid);
		} catch (Exception e) {
			logger.error("Error while getting Specific contact on id", e);
		}
		return null;
	}

	/**
	 * Returns all Topics against an Account
	 */
	public List getTopicsByAccount(long accountid, int from, int to) {
		try {
			return getTopicsDAO().getTopicsOnAccountID(accountid, from, to);
		} catch (Exception e) {
			logger.error("Error while getting Topics on account", e);
		}
		return null;
	}
}
