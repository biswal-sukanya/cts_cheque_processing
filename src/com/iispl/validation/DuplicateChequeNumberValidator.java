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
		
		long count = chequeRepository.getAllCheques().stream().filter(c->c.getChequeNumber().equals(cheque.getChequeNumber())).count();
		
		if(count>1)
			throw new DuplicateChequeNumberException();	
	}

}
