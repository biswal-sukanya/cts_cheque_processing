package com.iispl.validation;

import com.iispl.exception.InvalidChequeStatusException;
import com.iispl.model.Cheque;

public class StatusValidator implements Validator{

	@Override
	public void validate(Cheque cheque) throws InvalidChequeStatusException {
		
		if(cheque.getStatus() == null) {
			throw new InvalidChequeStatusException();
		}
	}

}
