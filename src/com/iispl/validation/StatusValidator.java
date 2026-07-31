package com.iispl.validation;

import com.iispl.exception.InvalidChequeStatus;
import com.iispl.model.Cheque;

public class StatusValidator implements Validator{

	@Override
	public void validate(Cheque cheque) throws InvalidChequeStatus {
		
		if(cheque.getStatus() == null) {
			throw new InvalidChequeStatus();
		}
	}

}
