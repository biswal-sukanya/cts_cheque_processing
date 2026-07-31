package com.iispl.validation;

import java.math.BigDecimal;

import com.iispl.exception.InvalidChequeAmountException;
import com.iispl.model.Cheque;

public class ChequeAmountValidator implements Validator{

	@Override
	public void validate(Cheque cheque) throws InvalidChequeAmountException {
		if (cheque.getChequeAmount() == null) {
	        throw new InvalidChequeAmountException();
	    }

	    if (cheque.getChequeAmount().compareTo(BigDecimal.ZERO) <= 0) {
	        throw new InvalidChequeAmountException();
	    }
		
	}

}
