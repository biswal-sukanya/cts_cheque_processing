package com.iispl.validation;

import java.math.BigDecimal;

import com.iispl.model.Cheque;

public class ChequeAmountValidator implements Validator{

	@Override
	public void validate(Cheque cheque) throws Exception {
		if (cheque.getChequeAmount() == null) {
	        throw new Exception("Cheque amount cannot be null");
	    }

	    if (cheque.getChequeAmount().compareTo(BigDecimal.ZERO) <= 0) {
	        throw new Exception("Cheque amount must be greater than zero");
	    }
		
	}

}
