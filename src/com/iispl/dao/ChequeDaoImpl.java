package com.iispl.dao;

import java.util.Collections;
import java.util.List;

import com.iispl.model.Cheque;
import com.iispl.repository.ChequeRepository;
import com.iispl.repository.ChequeRepositoryImpl;

public class ChequeDaoImpl implements ChequeDao{

	static ChequeRepository chequeRepository = new ChequeRepositoryImpl();
	//sorting Cheque by date By sharan
	@Override
	public List<Cheque> sortChequeByDate() {
		List<Cheque> cheques=chequeRepository.chequeRecords();
		Collections.sort(cheques,(c1,c2)->c1.getChequeDate().compareTo(c2.getChequeDate()));
		return cheques;
	}
}
