package com.iispl.service;

import java.util.List;

import com.iispl.model.Cheque;



public interface ChequeService {
	
	List<Cheque> sortByChequeNumber(List<Cheque> chequeList);
	
    List<Cheque> sortByPresentingBankAndAmount(List<Cheque> chequeList);
	
	List<Cheque> sortByPriorityAndStatus(List<Cheque> chequeList);
	
	List<Cheque> sortByChequeAmountAscending(List<Cheque> chequeList);
	
	List<Cheque> sortByChequeAmountDescending(List<Cheque> chequeList);
	
	List<Cheque> sortChequeByDate(List<Cheque> chequeList);
	
	void displayAllCheques(List<Cheque> chequeList);
	
	List<Cheque> getAllCheques();
	
	void validateCheques(List<Cheque> chequeList);
	
	List<Cheque> displayHighValueCheque(List<Cheque> chequeList);

	List<Cheque> sortByClearingZoneAndAmountDescending(List<Cheque> chequeList);
	
	
	
}
