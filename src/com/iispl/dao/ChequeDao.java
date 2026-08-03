package com.iispl.dao;

import java.util.List;

import com.iispl.model.Cheque;


public interface ChequeDao {
	
//	sortByChequeAmountAscending
	List<Cheque> sortByChequeAmountAscending(List<Cheque> chequeList);
//  sortByChequeAmountDescending
	List<Cheque> sortByChequeAmountDescending(List<Cheque> chequeList);
	
    List<Cheque> sortByPresentingBankAndAmount(List<Cheque> chequeList);
	
	List<Cheque> sortByPriorityAndStatus(List<Cheque> chequeList);
	
	List<Cheque> sortChequeByDate(List<Cheque> chequeList);
	
	List<Cheque> getAllCheques();
//  feature/addsortbyclearingZoneandAmount
	List<Cheque> sortByClearingZoneAndAmountDescending(List<Cheque> chequeList);

// feature/sortByClearingZoneAndChequeAmountAscending
	
	List<Cheque> sortByClearingzoneAndChequeamountAscending(List<Cheque> chequeList);
	List<Cheque> sortByClearingZoneAndAmount(List<Cheque> chequeList);

}
