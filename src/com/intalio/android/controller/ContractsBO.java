package com.intalio.android.controller;

import java.util.List;

import org.apache.log4j.Logger;
import com.intalio.android.DAO.ContractsDAO;

/**
 * TODO :: what does this class do?
 * 
 * @author ankit
 * 
 */

public class ContractsBO {

	private Logger logger = Logger.getLogger(this.getClass());
	private ContractsDAO contractDAO;

	public ContractsDAO getContractsDAO() {
		return contractDAO;
	}

	public void setContractsDAO(ContractsDAO contractDAO1) {
		this.contractDAO = contractDAO1;
	}

	/**
	 * Returns Contracts
	 */

	public List getContracts(int from, int to) {
		try {
			return getContractsDAO().getContracts(from, to);
		} catch (Exception e) {
			logger.error("Error while getting contracts", e);
		}
		return null;
	}

	/**
	 * Returns Contract Details on its id
	 */
	public List getContractsByIDMain(String contractid) {
		try {
			return getContractsDAO().getContractsOnIDMain(contractid);
		} catch (Exception e) {
			logger.error("Error while getting Main contract info on id", e);
		}
		return null;
	}

	public List getContractsByIDStandard(String contractid) {
		try {
			return getContractsDAO().getContractsOnIDStandard(contractid);
		} catch (Exception e) {
			logger.error("Error while getting Standard contract info on id", e);
		}
		return null;
	}

	public List getContractsByIDSpecific(String contractid) {
		try {
			return getContractsDAO().getContractsOnIDSpecific(contractid);
		} catch (Exception e) {
			logger.error("Error while getting Specific contract info on id", e);
		}
		return null;
	}

	/**
	 * Returns all Contract on an account id
	 */
	public List getContractsByAccountID(long contractid, int from, int to) {
		try {
			return getContractsDAO().getContractsOnAccountID(contractid, from,
					to);
		} catch (Exception e) {
			logger.error("Error while getting contract info on id", e);
		}
		return null;
	}
}
