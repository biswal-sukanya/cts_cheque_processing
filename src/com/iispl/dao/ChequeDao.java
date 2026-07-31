package com.iispl.dao;

import java.util.List;

import com.iispl.model.Cheque;
// feature/sort_prioritystatus

//  feature/short_chequeamount_Ascending&Decending


public interface ChequeDao {
//  feature/sortChequeByDate
	
	//sorting Cheque by date By sharan
	public List<Cheque> sortChequeByDate();
	List<Cheque> sortByPresentingBankAndAmount();

//  feature/sort_prioritystatus
	List<Cheque> sortByPriorityAndStatus();

public interface ChequeDao {
	
//	sortByChequeAmountAscending
	List<Cheque> sortByChequeAmountAscending();
//  sortByChequeAmountDescending
	List<Cheque> sortByChequeAmountDescending();

}
