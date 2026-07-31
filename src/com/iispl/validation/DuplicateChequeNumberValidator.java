package com.iispl.validation;

import java.util.List;

import com.iispl.exception.DuplicateChequeNumberException;
import com.iispl.model.Cheque;
import com.iispl.repository.ChequeRepository;
import com.iispl.repository.ChequeRepositoryImpl;

public class DuplicateChequeNumberValidator implements Validator {
	private ChequeRepository chequeRepository=new ChequeRepositoryImpl();

	@Override
	public void validate(Cheque cheque) throws DuplicateChequeNumberException {
		List<Cheque> cheques= chequeRepository.chequeRecords();
		for(Cheque c: cheques) {
			if(c.getChequeNumber()==cheque.getChequeNumber()) {
				throw new DuplicateChequeNumberException();
			}
		}
		

	}

}
