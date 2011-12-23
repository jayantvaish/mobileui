package com.intalio.android.controller;

import java.util.List;

import org.apache.log4j.Logger;
import com.intalio.android.DAO.SolutionsDAO;

/**
 * TODO :: what does this class do?
 * 
 * @author ankit
 * 
 */

public class SolutionsBO {

	private Logger logger = Logger.getLogger(this.getClass());
	private SolutionsDAO solutionDAO;

	public SolutionsDAO getSolutionsDAO() {
		return solutionDAO;
	}

	public void setSolutionsDAO(SolutionsDAO solutionDAO1) {
		this.solutionDAO = solutionDAO1;
	}

	/**
	 * Returns Solutions
	 */
	public List getSolutions(int from, int to) {
		try {
			return getSolutionsDAO().getSolutions(from, to);
		} catch (Exception e) {
			logger.error("Error while getting Solutions", e);
		}
		return null;
	}

	/**
	 * Returns invoice Details on its id
	 */
	public List getSolutionsByIDMain(String invoiceid) {
		try {
			return getSolutionsDAO().getSolutionsOnIDMain(invoiceid);
		} catch (Exception e) {
			logger.error("Error while getting Main Solutions by id", e);
		}
		return null;
	}

	public List getSolutionsByIDStandard(String invoiceid) {
		try {
			return getSolutionsDAO().getSolutionsOnIDStandard(invoiceid);
		} catch (Exception e) {
			logger.error("Error while getting Standard Solutions by id", e);
		}
		return null;
	}

	public List getSolutionsByIDSpecific(String invoiceid) {
		try {
			return getSolutionsDAO().getSolutionsOnIDSpecific(invoiceid);
		} catch (Exception e) {
			logger.error("Error while getting Specific Solutions by id", e);
		}
		return null;
	}

	/**
	 * Returns invoice Details on its id
	 */
	public List getSolutionsByAccountID(long accountid, int from, int to) {
		try {
			return getSolutionsDAO().getSolutionsOnAccountID(accountid, from,
					to);
		} catch (Exception e) {
			logger.error("Error while getting Solutions by id", e);
		}
		return null;
	}
}
