package com.iispl.service;

import java.util.List;

import com.iispl.dao.ChequeDao;
import com.iispl.dao.ChequeDaoImpl;
import com.iispl.model.Cheque;

public class ChequeServiceImpl implements ChequeService {

	static ChequeDao chequeDao = new ChequeDaoImpl();

	//sorting Cheque by date By sharan
	@Override
	public List<Cheque> sortChequeByDate() {
		return chequeDao.sortChequeByDate();
	}
	
}
