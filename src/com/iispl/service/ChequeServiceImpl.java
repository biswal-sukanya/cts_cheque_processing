package com.iispl.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.iispl.dao.ChequeDao;
import com.iispl.dao.ChequeDaoImpl;
import com.iispl.enums.ChequeStatus;
import com.iispl.model.Cheque;
import com.iispl.validation.ChequeAmountValidator;
import com.iispl.validation.ChequeDateValidator;
import com.iispl.validation.ChequeNumberValidator;
import com.iispl.validation.DrawerNameValidator;
import com.iispl.validation.DuplicateChequeNumberValidator;
import com.iispl.validation.PresentedDateValidator;
import com.iispl.validation.PresentingBankValidator;
import com.iispl.validation.PriorityValidator;
import com.iispl.validation.StatusValidator;
import com.iispl.validation.Validator;

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
		    System.out.printf("%-10s %-20s %-20s %-12s %-15s %-15s %-15s %-15s%n",
		            "Cheque No",
		            "Drawer Name",
		            "Presenting Bank",
		            "Amount",
		            "Cheque Date",
		            "Presented Date",
		            "Priority",
		            "Status");

		    System.out.println();

		    for (Cheque cheque : chequeList) {

		        if (cheque.getChequeNumber() == null
		                || cheque.getDrawerName() == null
		                || cheque.getPresentingBank() == null
		                || cheque.getChequeAmount() == null
		                || cheque.getChequeDate() == null
		                || cheque.getPresentedDate() == null
		                || cheque.getPriority() == null
		                || cheque.getStatus() == null) {

		            continue;   // Skip this cheque
		        }
		    

		        System.out.println(cheque);
		    }
		    System.out.println("========================================================================================================================================");
	}
	
	
	@Override
	public List<Cheque> getAllCheques() {
		
		return chequeDao.getAllCheques();
	}
	@Override
	public void validateCheques(List<Cheque> chequeList) {
		
		List<Validator> validators = new ArrayList<>();
		
		validators.add(new ChequeNumberValidator());
		validators.add(new DuplicateChequeNumberValidator());
		validators.add(new DrawerNameValidator());
		validators.add(new PresentingBankValidator());
		validators.add(new ChequeAmountValidator());
		validators.add(new ChequeDateValidator());
		validators.add(new PresentedDateValidator());
		validators.add(new PriorityValidator());
		validators.add(new StatusValidator());
		
		for(Cheque cheque : chequeList){
			
			System.out.println("\n-------------------------------------------------------------");
			System.out.println();
			System.out.println("Cheque Number : "+ cheque.getChequeNumber()+"\n");
			
			boolean valid = true;
			
			for(Validator validator : validators){
				
				try {
					
					validator.validate(cheque);
					
				}catch(Exception e) {
					
					valid = false;
					
					cheque.setStatus(ChequeStatus.REJECTED);
					System.out.println(validator.getClass().getSimpleName()+" : "+e.getMessage());
					System.out.println();
				}
			}
			if(valid) {
				cheque.setStatus(ChequeStatus.VALIDATED);
				
			}else {
				cheque.setStatus(ChequeStatus.REJECTED);
				
			}
			
			System.out.println("Cheque Date       : " + cheque.getChequeDate());
			System.out.println("Drawer Name       : " + cheque.getDrawerName());
			System.out.println("Cheque Amount     : " + cheque.getChequeAmount());
			System.out.println("Presenting Bank   : " + cheque.getPresentingBank());
			System.out.println("Presented Date    : " + cheque.getPresentedDate());
			System.out.println("Status            : " + cheque.getStatus());
			
			System.out.println("-------------------------------------------------------------");
			System.out.println();
		}
		
	}
	
	
	@Override
	public List<Cheque> displayHighValueCheque(List<Cheque> chequeList) {
		
	  return chequeList.stream().filter(cheque->cheque.getChequeAmount().compareTo(new BigDecimal("200000"))>0)
			  .sorted((c1,c2)->c2.getChequeAmount().compareTo(c1.getChequeAmount())).toList();
	}
	@Override
	public List<Cheque> sortByChequeNumber(List<Cheque> chequeList) {
		
		return chequeList.stream().sorted().toList();
	}
	
}
