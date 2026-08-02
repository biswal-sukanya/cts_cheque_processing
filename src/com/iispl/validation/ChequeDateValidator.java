package com.iispl.validation;

import java.time.LocalDate;

import com.iispl.exception.InvalidChequeDateException;
import com.iispl.model.Cheque;

public class ChequeDateValidator implements Validator{

	@Override
	public void validate(Cheque cheque) throws InvalidChequeDateException {
		
		if(cheque.getChequeDate().plusMonths(3).isBefore(LocalDate.now())) {
			throw new InvalidChequeDateException();
		}
	}
	
}
