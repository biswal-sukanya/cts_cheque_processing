package com.iispl.service;

import java.util.List;

//  feature/sort_prioritystatus
//  feature/short_chequeamount_Ascending&Decending
import com.iispl.model.Cheque;

public interface ChequeService {
//  sortByChequeAmountAscending
	List<Cheque> sortByChequeAmountAscending();
//  sortByChequeAmountDescending
	List<Cheque> sortByChequeAmountDescending();
// feature/sortChequeByDate

import com.iispl.model.Cheque;

public interface ChequeService {
	
	//sorting Cheque by date By sharan
	public List<Cheque> sortChequeByDate();
import com.iispl.dao.ChequeDao;
import com.iispl.dao.ChequeDaoImpl;
import com.iispl.model.Cheque;

//  feature/sort_prioritystatus
	List<Cheque> sortByPriorityAndStatus();
public interface ChequeService {
	
	public List<Cheque> sortByPresentingBankAndAmount();
	
	
}
