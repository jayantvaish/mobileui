package com.intalio.android.controller;

import java.util.List;

import org.apache.log4j.Logger;
import com.intalio.android.DAO.ContactsDAO;

/**
 * TODO :: what does this class do?
 * 
 * @author ankit
 * 
 */

public class ContactsBO {

	private Logger logger = Logger.getLogger(this.getClass());
	private ContactsDAO contactDAO;

	public ContactsDAO getContactsDAO() {
		return contactDAO;
	}

	public void setContactsDAO(ContactsDAO contactDAO1) {
		this.contactDAO = contactDAO1;
	}

	/**
	 * Returns All contacts
	 */
	public List getContacts(int from, int to) {
		try {
			return getContactsDAO().getContacts(from, to);
		} catch (Exception e) {
			logger.error("Error while getting contacts", e);
		}
		return null;
	}

	/**
	 * Returns Contact Details on its id
	 */
	public List getContactsByIDMain(String contactid) {
		try {
			return getContactsDAO().getContactsOnIDMain(contactid);
		} catch (Exception e) {
			logger.error("Error while getting Main contact on id", e);
		}
		return null;
	}

	public List getContactsByIDStandard(String contactid) {
		try {
			return getContactsDAO().getContactsOnIDStandard(contactid);
		} catch (Exception e) {
			logger.error("Error while getting Standard contact on id", e);
		}
		return null;
	}

	public List getContactsByIDSpecific(String contactid) {
		try {
			return getContactsDAO().getContactsOnIDSpecific(contactid);
		} catch (Exception e) {
			logger.error("Error while getting Specific contact on id", e);
		}
		return null;
	}

	/**
	 * Returns all contacts against an Account
	 */
	public List getContactsByAccount(long accountid, int from, int to) {
		try {
			return getContactsDAO().getContactsOnAccountID(accountid, from, to);
		} catch (Exception e) {
			logger.error("Error while getting contacts on account", e);
		}
		return null;
	}
}
