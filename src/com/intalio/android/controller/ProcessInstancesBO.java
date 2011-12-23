package com.intalio.android.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.intalio.android.DAO.ProcessInstancesDAO;

public class ProcessInstancesBO {
	
	private Logger logger = Logger.getLogger(this.getClass());
	private ProcessInstancesDAO processInstancesDAO;
	
	public ProcessInstancesDAO getProcessInstancesDAO() {
		return processInstancesDAO;
	}
	
	public void setProcessInstancesDAO(ProcessInstancesDAO processInstancesDAO) {
		this.processInstancesDAO = processInstancesDAO;
	}
	
	
	/**
	 * Returns rows from offset to limit
	 */
	public List getProcessInstances(int offset, int limit) {
		try {
			return getProcessInstancesDAO().getProcessInstances(offset, limit);
		} catch (Exception e) {
			logger.error("Error while getting Tasks", e);
		}
		return null;
	}
	
	/**
	 * Returns details of a single process instance
	 */
	public List getProcessInstanceByIDMain(String id) 
	{
		try 
		{
			return getProcessInstancesDAO().getProcessInstanceByIDMain(id);
		} 
		catch (Exception e) 
		{
			logger.error("Error while getting Main-ProcessInstance by id", e);
		}
		return null;
	}
	
	public List getProcessInstanceByIDStandard(String id) 
	{
		try 
		{
			return getProcessInstancesDAO().getProcessInstanceByIDStandard(id);
		} 
		catch (Exception e) 
		{
			logger.error("Error while getting Standard-ProcessInstance by id", e);
		}
		return null;
	}
	
	public List getProcessInstanceByIDSpecific(String id) 
	{
		try 
		{
			return getProcessInstancesDAO().getProcessInstanceByIDSpecific(id);
		} 
		catch (Exception e) 
		{
			logger.error("Error while getting Specific-ProcessInstance by id", e);
		}
		return null;
	}
	

}
