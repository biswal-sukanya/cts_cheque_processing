package com.iispl.main;

import java.util.List;
import java.util.Scanner;

import com.iispl.model.Cheque;
import com.iispl.service.ChequeService;
import com.iispl.service.ChequeServiceImpl;

public class CtsApplication {
	
	static ChequeService chequeService = new ChequeServiceImpl();
	static Scanner sc = new Scanner(System.in);
	
public static void main(String[] args) {
	
	ChequeService chequeService = new ChequeServiceImpl();

	List<Cheque> chequeList = chequeService.getChequeRecords();
	
	chequeService.validateCheques(chequeList);

	int choice;

	do {

	    System.out.println("1. Display All Cheques");
	    System.out.println("2. Sort By Cheque Amount Ascending");
	    System.out.println("3. Sort By Cheque Amount Descending");
	    System.out.println("4. Sort By Priority And Status");
	    System.out.println("5. Sort By Presenting Bank And Amount");
	    System.out.println("6. Sort By Cheque Date and Presented date");
	    System.out.println("7. Display High Value Cheques");
	    System.out.println("8. Exit");

	    choice = sc.nextInt();

	    switch (choice) {

	    case 1:
	        chequeService.displayAllCheques(chequeList);
	        break;

	    case 2:
	        chequeService.displayAllCheques(chequeService.sortByChequeAmountAscending(chequeList));
	        break;
	        
	    case 3:
	        chequeService.displayAllCheques(
	        		chequeService.sortByChequeAmountDescending(chequeList));
	        break;    

	    case 4:
	        chequeService.displayAllCheques(
	                chequeService.sortByPriorityAndStatus(chequeList));
	        break;

	    case 5:
	        chequeService.displayAllCheques(
	                chequeService.sortByPresentingBankAndAmount(chequeList));
	        break;

	    case 6:
	        chequeService.displayAllCheques(
	                chequeService.sortChequeByDate(chequeList));
	        break;

	    case 7:
	    	 chequeService.displayAllCheques(
	    	chequeService.displayHighValueCheque(chequeList));
	        break;
	        
	    case 8:
	    	System.out.println("Thank You..."); break;

	    default:
	        System.out.println("Invalid Choice");
	    }

	} while (choice != 8);
}
}
