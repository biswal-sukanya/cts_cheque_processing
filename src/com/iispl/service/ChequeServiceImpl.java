package com.iispl.service;

import java.util.List;

import com.iispl.dao.ChequeDao;
import com.iispl.dao.ChequeDaoImpl;
import com.iispl.model.Cheque;

public class ChequeServiceImpl implements ChequeService {

	static ChequeDao chequeDao = new ChequeDaoImpl();

	//added by Shair-Yaar-Khan
	@Override
	public List<Cheque> sortByPriorityAndStatus() {
		
		return chequeDao.sortByPriorityAndStatus();
	}
	
}
