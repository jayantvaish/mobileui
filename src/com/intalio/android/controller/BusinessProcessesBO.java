package com.intalio.android.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.intalio.android.DAO.BusinessProcessesDAO;

/**
 * TODO :: what does this class do?
 * 
 * @author ankit
 * 
 */

public class BusinessProcessesBO 
{
	
	private Logger logger = Logger.getLogger(this.getClass());
	private BusinessProcessesDAO businessProcessDAO;
	
	

	public BusinessProcessesDAO getBusinessProcessDAO() {
		return businessProcessDAO;
	}

	public void setBusinessProcessDAO(BusinessProcessesDAO businessProcessDAO) {
		this.businessProcessDAO = businessProcessDAO;
	}

	/**
	 * Returns processes details
	*/
	public List getBusinessProcesses(int offset,int limit) 
	{
		try 
		{
			return getBusinessProcessDAO().getBusinessProcesses(offset,limit);
		} 
		catch (Exception e) 
		{
			logger.error("Error while getting Processes", e);
		}
		return null;
	}
	
	/**
	 * Returns details of a single business process
	 */
	public List getProcessByIDMain(String id) 
	{
		try 
		{
			return getBusinessProcessDAO().getProcessByIDMain(id);
		} 
		catch (Exception e) 
		{
			logger.error("Error while getting Main-Task by id", e);
		}
		return null;
	}
	
	public List getProcessByIDStandard(String id) 
	{
		try 
		{
			return getBusinessProcessDAO().getProcessByIDStandard(id);
		} 
		catch (Exception e) 
		{
			logger.error("Error while getting Standard-Process by id", e);
		}
		return null;
	}
	
	public List getProcessByIDSpecific(String id) 
	{
		try 
		{
			return getBusinessProcessDAO().getProcessByIDSpecific(id);
		} 
		catch (Exception e) 
		{
			logger.error("Error while getting Specific-Process by id", e);
		}
		return null;
	}
	
	
}

