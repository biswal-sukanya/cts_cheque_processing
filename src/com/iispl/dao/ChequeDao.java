package com.iispl.dao;

import java.util.List;

import com.iispl.model.Cheque;


public interface ChequeDao {
	
//	sortByChequeAmountAscending
	List<Cheque> sortByChequeAmountAscending();
//  sortByChequeAmountDescending
	List<Cheque> sortByChequeAmountDescending();
	
    List<Cheque> sortByPresentingBankAndAmount();
	
	List<Cheque> sortByPriorityAndStatus();
	
	List<Cheque> sortChequeByDate();

}
