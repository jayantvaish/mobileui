package com.intalio.android.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.intalio.android.DAO.CompetitorsDAO;
import com.intalio.android.DAO.ProductsDAO;

/**
 * Main Business Object class for competitors
 * 
 * @author ankit
 * 
 */

public class CompetitorsBO {

	private Logger logger = Logger.getLogger(this.getClass());
	private CompetitorsDAO competitorsDAO;

	public CompetitorsDAO getCompetitorsDAO() {
		return competitorsDAO;
	}

	public void setCompetitorsDAO(CompetitorsDAO competitorsDAO1) {
		this.competitorsDAO = competitorsDAO1;
	}

	/**
	 * Returns competitors
	 */
	public List getCompetitors(int offset, int limit) {
		try {
			return getCompetitorsDAO().getCompetitors(offset, limit);
		} catch (Exception e) {
			logger.error("Error while getting competitors", e);
		}
		return null;
	}

	/**
	 * Returns detail of competitors on id
	 */
	public List getCompetitorsByID(String competitorsid) {
		try {
			return getCompetitorsDAO().getCompetitorsByID(competitorsid);
		} catch (Exception e) {
			logger.error("Error while getting competitors by id", e);
		}
		return null;
	}

}
