package com.iispl.service;

import com.iispl.dao.ChequeDao;
import com.iispl.dao.ChequeDaoImpl;

public class ChequeServiceImpl implements ChequeService {

	static ChequeDao chequeDao = new ChequeDaoImpl();
	
}
