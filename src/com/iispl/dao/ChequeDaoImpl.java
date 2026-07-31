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
			
			int priorityCompare = c1.getPriority().compareTo(c2.getPriority());
			
			if(priorityCompare !=0) {
				return priorityCompare;
			}
			return c1.getStatus().compareTo(c2.getStatus());
		});
			
		return chequeList;
	}	

//  feature/short_chequeamount_Ascending&Decending
	
	
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
		
		Collections.sort(chequeList,(c1,c2)->c1.getChequeDate().compareTo(c2.getChequeDate()));
		return chequeList;
	}
	//SORT BY BANK AND AMOUNT FUNCTIONALITY ADDED BY ABHIJITH
	@Override
	public List<Cheque> sortByPresentingBankAndAmount(List<Cheque> chequeList) {
		
		
		Collections.sort(chequeList,(c1,c2)->{
			int bank=c1.getPresentingBank().compareTo(c2.getPresentingBank());
			if(bank!=0) {
				return bank;
			}
			return c1.getChequeAmount().compareTo(c2.getChequeAmount());
		});	
		return chequeList;

	}

	@Override
	public List<Cheque> getChequeRecords() {
		
		return chequeRepository.chequeRecords();
	}
}

