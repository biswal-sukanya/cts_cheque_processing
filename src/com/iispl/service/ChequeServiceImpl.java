package com.iispl.service;

import java.util.List;

import com.iispl.dao.ChequeDao;
import com.iispl.dao.ChequeDaoImpl;
import com.iispl.model.Cheque;

public class ChequeServiceImpl implements ChequeService {

	static ChequeDao chequeDao = new ChequeDaoImpl();

//  feature/sort_prioritystatus
	//added by Shair-Yaar-Khan
	@Override
	public List<Cheque> sortByPriorityAndStatus() {
		
		return chequeDao.sortByPriorityAndStatus();
	}
//  feature/sortChequeByDate
	//sorting Cheque by date By sharan
	@Override
	public List<Cheque> sortChequeByDate() {
		return chequeDao.sortChequeByDate();
	}

	@Override
	public List<Cheque> sortByPresentingBankAndAmount() {
		
			return chequeDao.sortByPresentingBankAndAmount();

	}
	
	@Override
	public List<Cheque> sortByChequeAmountAscending() {
	    return chequeDao.sortByChequeAmountAscending();
	}

	@Override
	public List<Cheque> sortByChequeAmountDescending() {
	    return chequeDao.sortByChequeAmountDescending();
	}
	
}
