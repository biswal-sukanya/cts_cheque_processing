package com.iispl.dao;

// feature/sort_prioritystatus

//  feature/short_chequeamount_Ascending&Decending
import java.util.Collections;
// feature/sortChequeByDate
import java.util.Comparator;


import java.util.List;

import com.iispl.model.Cheque;
import com.iispl.repository.ChequeRepository;
import com.iispl.repository.ChequeRepositoryImpl;

public class ChequeDaoImpl implements ChequeDao{

	static ChequeRepository chequeRepository = new ChequeRepositoryImpl();
//  feature/sort_prioritystatus

	
	//added by Shair-Yaar-Khan
	@Override
	public List<Cheque> sortByPriorityAndStatus(List<Cheque> chequeList) {
		
		chequeList.sort((c1,c2)->{
			
			if(c1.getPriority() == null && c2.getPriority() == null) return 0;
			
			if(c1.getPriority()==null) return 1;
			if(c2.getPriority()==null) return -1;
			
			int priorityCompare = c1.getPriority().compareTo(c2.getPriority());
			
			if(priorityCompare !=0) {
				return priorityCompare;
			}
			
			if(c1.getStatus() == null && c2.getStatus()==null) return 0;
			
			if(c1.getStatus()==null) return 1;
			if(c2.getStatus()==null) return -1;
			
			return c1.getStatus().compareTo(c2.getStatus());
		});
			
		return chequeList;
	}	

//  feature/sort_chequeamount_Ascending&Decending
	@Override
	public List<Cheque> sortByChequeAmountAscending(List<Cheque> chequeList) {

		chequeList.sort((c1, c2) ->
	        c1.getChequeAmount().compareTo(c2.getChequeAmount()));

	    return chequeList;
	}

	@Override
	public List<Cheque> sortByChequeAmountDescending(List<Cheque> chequeList) {

		chequeList.sort((c1, c2) ->
	        c2.getChequeAmount().compareTo(c1.getChequeAmount()));

	    return chequeList;
	}
	
	
//  feature/sortChequeByDate
	//sorting Cheque by date By sharan
	@Override
	public List<Cheque> sortChequeByDate(List<Cheque> chequeList) {
		
		chequeList.sort((c1,c2)->{
			int presentedDate=c1.getPresentedDate().compareTo(c2.getPresentedDate());
			if(presentedDate!=0) {
				return presentedDate;
			}
			return c1.getChequeDate().compareTo(c2.getChequeDate());
		});
		return chequeList;
	}
	//SORT BY BANK AND AMOUNT FUNCTIONALITY ADDED BY ABHIJITH
	@Override
	public List<Cheque> sortByPresentingBankAndAmount(List<Cheque> chequeList) {
		
		
		Collections.sort(chequeList,(c1,c2)->{
			
			if(c1.getPresentingBank() == null && c2.getPresentingBank()==null) return 0;
			
			if(c1.getPresentingBank()==null) return 1;
			
			if(c2.getPresentingBank()==null) return -1;
			
			int bank=c1.getPresentingBank().compareTo(c2.getPresentingBank());
			if(bank!=0) {
				return bank;
			}
			
			if(c1.getChequeAmount()==null && c2.getChequeAmount()==null) return 0;
			
			if(c1.getChequeAmount()==null) return 1;
			
			if(c2.getChequeAmount()==null) return -1;
			
			return c1.getChequeAmount().compareTo(c2.getChequeAmount());
		});	
		return chequeList;

	}

	@Override
	public List<Cheque> getAllCheques() {
		
		return chequeRepository.getAllCheques();
	}
	
	
	public List<Cheque> sortByClearingZoneAndAmount(List<Cheque> chequeList){
		Collections.sort(chequeList,(c1,c2)->{
			int zone=c1.getClearingZone().compareTo(c2.getClearingZone());
			if(zone!=0) {
				return zone;
			}
			return c2.getChequeAmount().compareTo(c1.getChequeAmount());
		});
		return chequeList;
	}
}



