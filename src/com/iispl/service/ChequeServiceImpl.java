package com.iispl.service;

import java.util.List;

import com.iispl.dao.ChequeDao;
import com.iispl.dao.ChequeDaoImpl;
import com.iispl.model.Cheque;

public class ChequeServiceImpl implements ChequeService {

	static ChequeDao chequeDao = new ChequeDaoImpl();

//  feature/sort_prioritystatus
	//added by Shair-Yaar-Khan
	@Override
	public List<Cheque> sortByPriorityAndStatus(List<Cheque> chequeList) {
		
		return chequeDao.sortByPriorityAndStatus(chequeList);
	}
//  feature/sortChequeByDate
	//sorting Cheque by date By sharan
	@Override
	public List<Cheque> sortChequeByDate(List<Cheque> chequeList) {
		return chequeDao.sortChequeByDate(chequeList);
	}

	@Override
	public List<Cheque> sortByPresentingBankAndAmount(List<Cheque> chequeList) {
		
			return chequeDao.sortByPresentingBankAndAmount(chequeList);

	}
	
	@Override
	public List<Cheque> sortByChequeAmountAscending(List<Cheque> chequeList) {
	    return chequeDao.sortByChequeAmountAscending(chequeList);
	}

	@Override
	public List<Cheque> sortByChequeAmountDescending(List<Cheque> chequeList) {
	    return chequeDao.sortByChequeAmountDescending(chequeList);
	}
	
	
	
	//added by Shair-Yaar-Khan
	@Override
	public void displayAllCheques(List<Cheque> chequeList) {
		
		 if (chequeList == null || chequeList.isEmpty()) {
		        System.out.println("No Cheques Available.");
		        return;
		    }

		    System.out.println("========================================================================================================================================");
		    System.out.printf("%-10s %-20s %-20s %-12s %-15s %-15s %-15s %-15ss%n",
		            "Cheque No",
		            "Drawer Name",
		            "Presenting Bank",
		            "Amount",
		            "Cheque Date",
		            "Presented Date",
		            "Priority",
		            "Status");

		    System.out.println("========================================================================================================================================");

		    chequeList.forEach(System.out::println);

		    System.out.println("========================================================================================================================================");
	}
	
	
	@Override
	public List<Cheque> getChequeRecords() {
		
		return chequeDao.getChequeRecords();
	}
	
}
