package com.intalio.android.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.intalio.android.DAO.EventsDAO;

public class EventsBO {
	
	private Logger logger = Logger.getLogger(this.getClass());
	private EventsDAO eventsDAO;
	
	public EventsDAO getEventsDAO() {
		return eventsDAO;
	}
	public void setEventsDAO(EventsDAO eventsDAO) {
		this.eventsDAO = eventsDAO;
	}
	
	/**
	 * Returns rows from offset to limit
	 */
	public List getEvents(int offset, int limit) {
		try {
			return getEventsDAO().getEvents(offset, limit);
		} catch (Exception e) {
			logger.error("Error while getting Tasks", e);
		}
		return null;
	}
	
	/**
	 * Returns details of a single event
	 */
	public List getEventByIDMain(String id) 
	{
		try 
		{
			return getEventsDAO().getEventByIDMain(id);
		} 
		catch (Exception e) 
		{
			logger.error("Error while getting Main-Event by id", e);
		}
		return null;
	}
	
	public List getEventByIDStandard(String id) 
	{
		try 
		{
			return getEventsDAO().getEventByIDStandard(id);
		} 
		catch (Exception e) 
		{
			logger.error("Error while getting Standard-Event by id", e);
		}
		return null;
	}
	
	public List getEventByIDSpecific(String id) 
	{
		try 
		{
			return getEventsDAO().getEventByIDSpecific(id);
		} 
		catch (Exception e) 
		{
			logger.error("Error while getting Specific-Event by id", e);
		}
		return null;
	}
	
	

}
