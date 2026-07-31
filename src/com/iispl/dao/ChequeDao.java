package com.iispl.dao;

import java.util.List;

import com.iispl.model.Cheque;

public interface ChequeDao {
//  feature/sortChequeByDate
	
	//sorting Cheque by date By sharan
	public List<Cheque> sortChequeByDate();
	List<Cheque> sortByPresentingBankAndAmount();

}
