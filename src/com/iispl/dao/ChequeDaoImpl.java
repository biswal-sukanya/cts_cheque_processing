package com.iispl.dao;

import java.util.List;

import com.iispl.model.Cheque;
import com.iispl.repository.ChequeRepository;
import com.iispl.repository.ChequeRepositoryImpl;

public class ChequeDaoImpl implements ChequeDao{

	static ChequeRepository chequeRepository = new ChequeRepositoryImpl();
	
	
	@Override
	public List<Cheque> sortByChequeAmountAscending() {

	    List<Cheque> cheques = chequeRepository.chequeRecords();

	    cheques.sort((c1, c2) ->
	        c1.getChequeAmount().compareTo(c2.getChequeAmount()));

	    return cheques;
	}

	@Override
	public List<Cheque> sortByChequeAmountDescending() {

	    List<Cheque> cheques = chequeRepository.chequeRecords();

	    cheques.sort((c1, c2) ->
	        c2.getChequeAmount().compareTo(c1.getChequeAmount()));

	    return cheques;
	}
}
