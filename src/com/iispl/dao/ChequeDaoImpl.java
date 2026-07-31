package com.iispl.dao;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.iispl.model.Cheque;
import com.iispl.repository.ChequeRepository;
import com.iispl.repository.ChequeRepositoryImpl;

public class ChequeDaoImpl implements ChequeDao{

	static ChequeRepository chequeRepository = new ChequeRepositoryImpl();
	
	//SORT BY BANK AND AMOUNT FUNCTIONALITY ADDED BY ABHIJITH
	@Override
	public List<Cheque> sortByPresentingBankAndAmount() {
		
		List<Cheque> cheques=chequeRepository.chequeRecords();
		Collections.sort(cheques,(c1,c2)->{
			int bank=c1.getPresentingBank().compareTo(c2.getPresentingBank());
			if(bank!=0) {
				return bank;
			}
			return c1.getChequeAmount().compareTo(c2.getChequeAmount());
		});	
		return cheques;
	}
}

