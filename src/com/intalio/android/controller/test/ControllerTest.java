package com.intalio.android.controller.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.intalio.android.controller.AccountsBO;
import com.intalio.android.controller.ContactsBO;
import com.intalio.android.controller.ContractsBO;
import com.intalio.android.controller.InvoicesBO;
import com.intalio.android.controller.OpportunitiesBO;

 
public class ControllerTest 
{
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
		
		System.out.println("Fetching Accounts on first page");
 		//System.out.println(AccountsExec.getAccountsOnPageNumber(1));
 		
 		System.out.println("Fetching Accounts on Second Page");
 		//System.out.println(AccountsExec.getAccountsOnPageNumber(2));
 		/*
 		System.out.println("Fetching all the contacts associated to account");
 		System.out.println(ContactsExec.getAllContacts(acctid));
 		
 		System.out.println("Fetching all the Contracts associated to account");
 		System.out.println(ContractsExec.getContractsOnAccount(acctid));
 		
 		System.out.println("Fetching all the Invoices associated to account");
 		System.out.println(InvoicesExec.getAllInvoicesOnAccount(acctid));
 		 
 		System.out.println("Fetching all the Opportunities associated to account");
 		System.out.println(OpportunitiesExec.getOpportunitiesOnAccount(acctid));
		*/
	}
}
