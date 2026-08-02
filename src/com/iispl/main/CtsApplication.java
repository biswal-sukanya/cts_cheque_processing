package com.iispl.main;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.iispl.model.Cheque;
import com.iispl.service.ChequeService;
import com.iispl.service.ChequeServiceImpl;

public class CtsApplication {
	
	static Scanner sc = new Scanner(System.in);
	
public static void main(String[] args) {
	
	ChequeService chequeService = new ChequeServiceImpl();

	List<Cheque> chequeList = chequeService.getAllCheques();

	int choice=0;

	do {
        System.out.println("\n===============================================");
	    System.out.println("1. Display All Cheques");
	    System.out.println("2  Validate All Cheques");
	    System.out.println("3. sort By Cheque Number");
	    System.out.println("4. Sort By Cheque Amount Ascending");
	    System.out.println("5. Sort By Cheque Amount Descending");
	    System.out.println("6. Sort By Priority And Status");
	    System.out.println("7. Sort By Presenting Bank And Amount");
	    System.out.println("8. Sort By Cheque Date and Presented date");
	    System.out.println("9. Display High Value Cheques");
	    System.out.println("10. Exit");
        System.out.println("\nEnter Your Choice : ");
        try {
        	
	    choice = sc.nextInt();
	    
        }catch(InputMismatchException e) {
        	
        	System.out.println("\nInvalid input : Please Enter a valid choice.");
        	
        	sc.nextLine();
        	
        	continue;
        }
	    switch (choice) {

	    case 1:
	        chequeService.displayAllCheques(chequeList);
	        break;
	        
	    case 2: chequeService.validateCheques(chequeList); 
	        break;   
	    
	    case 3: chequeService.displayAllCheques(
	    		     chequeService.sortByChequeNumber(chequeList)); 
	        break;

	    case 4:
	        chequeService.displayAllCheques(
	        		chequeService.sortByChequeAmountAscending(chequeList));
	        break;
	        
	    case 5:
	        chequeService.displayAllCheques(
	        		chequeService.sortByChequeAmountDescending(chequeList));
	        break;    

	    case 6:
	        chequeService.displayAllCheques(
	                chequeService.sortByPriorityAndStatus(chequeList));
	        break;

	    case 7:
	        chequeService.displayAllCheques(
	                chequeService.sortByPresentingBankAndAmount(chequeList));
	        break;

	    case 8:
	        chequeService.displayAllCheques(
	                chequeService.sortChequeByDate(chequeList));
	        break;

	    case 9:
	    	 chequeService.displayAllCheques(
	    	       chequeService.displayHighValueCheque(chequeList));
	        break;
	        
	    case 10:
	    	System.out.println("Thank You..."); break;

	    default:
	        System.out.println("Invalid Choice");
	    }

	} while (choice != 10);
}
}
