package com.iispl.service;

import java.util.List;

import com.iispl.model.Cheque;



public interface ChequeService {
	
    List<Cheque> sortByPresentingBankAndAmount();
	
	List<Cheque> sortByPriorityAndStatus();
	
	List<Cheque> sortByChequeAmountAscending();
	
	List<Cheque> sortByChequeAmountDescending();
	
	List<Cheque> sortChequeByDate();
	
	
}
