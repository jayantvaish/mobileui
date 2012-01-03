package com.intalio.android.controller.test;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.intalio.android.controller.AccountsBO;
import com.intalio.android.controller.ContactsBO;
import com.intalio.android.controller.ContractsBO;
import com.intalio.android.controller.InvoicesBO;
import com.intalio.android.controller.OpportunitiesBO;

 
public class ControllerTest 
{
	private static Logger log = Logger.getLogger(ControllerTest.class.getSimpleName());
	
	public static void main(String[] args) 
	{
		// creating JDBC template
		ApplicationContext context = new ClassPathXmlApplicationContext("androidConfig.xml");
		long acctid = Long.parseLong("979167594235911083");
		AccountsBO AccountsExec = (AccountsBO) context.getBean("AccountsSqlMap");
		ContactsBO ContactsExec = (ContactsBO) context.getBean("ContactsSqlMap");
		ContractsBO ContractsExec = (ContractsBO) context.getBean("ContractsSqlMap");
		InvoicesBO InvoicesExec = (InvoicesBO) context.getBean("InvoicesSqlMap");
		OpportunitiesBO OpportunitiesExec = (OpportunitiesBO) context.getBean("OpportunitiesSqlMap");
		
		// fetching all accounts (on a page number)
		
		log.debug("Fetching Accounts on first page");
 		//log.debug(AccountsExec.getAccountsOnPageNumber(1));
 		
 		log.debug("Fetching Accounts on Second Page");
 		//log.debug(AccountsExec.getAccountsOnPageNumber(2));
 		/*
 		log.debug("Fetching all the contacts associated to account");
 		log.debug(ContactsExec.getAllContacts(acctid));
 		
 		log.debug("Fetching all the Contracts associated to account");
 		log.debug(ContractsExec.getContractsOnAccount(acctid));
 		
 		log.debug("Fetching all the Invoices associated to account");
 		log.debug(InvoicesExec.getAllInvoicesOnAccount(acctid));
 		 
 		log.debug("Fetching all the Opportunities associated to account");
 		log.debug(OpportunitiesExec.getOpportunitiesOnAccount(acctid));
		*/
	}
}
