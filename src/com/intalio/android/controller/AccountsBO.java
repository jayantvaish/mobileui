package com.intalio.android.controller;

import java.util.List;
import org.apache.log4j.Logger;
import com.intalio.android.DAO.AccountsDAO;

/**
 * TODO :: what does this class do?
 * 
 * @author ankit
 * 
 */

public class AccountsBO {

	private Logger logger = Logger.getLogger(this.getClass());
	private AccountsDAO accountDAO;

	public AccountsDAO getAccountDAO() {
		return accountDAO;
	}

	public void setAccountDAO(AccountsDAO accountDAO1) {
		this.accountDAO = accountDAO1;
	}

	/**
	 * Returns rows from offset to limit
	 */
	public List getAccounts(int offset, int limit) {
		try {
			return getAccountDAO().getAccounts(offset, limit);
		} catch (Exception e) {
			logger.error("Error while getting Accounts", e);
		}
		return null;
	}

	/**
	 * Returns details of a single account
	 */
	public List getAccountsByIDMain(String acctid) {
		try {
			return getAccountDAO().getAccountsByIDMain(acctid);
		} catch (Exception e) {
			logger.error("Error while getting Main-Accounts by id", e);
		}
		return null;
	}

	public List getAccountsByIDStandard(String acctid) {
		try {
			return getAccountDAO().getAccountsByIDStandard(acctid);
		} catch (Exception e) {
			logger.error("Error while getting Standard-Accounts by id", e);
		}
		return null;
	}

	public List getAccountsByIDSpecific(String acctid) {
		try {
			return getAccountDAO().getAccountsByIDSpecific(acctid);
		} catch (Exception e) {
			logger.error("Error while getting Specific-Accounts by id", e);
		}
		return null;
	}
}
