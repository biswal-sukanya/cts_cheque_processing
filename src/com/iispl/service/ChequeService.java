package com.iispl.service;

import java.util.List;

import com.iispl.dao.ChequeDao;
import com.iispl.dao.ChequeDaoImpl;
import com.iispl.model.Cheque;

public interface ChequeService {
	
	public List<Cheque> sortByPresentingBankAndAmount();
	
	

}
