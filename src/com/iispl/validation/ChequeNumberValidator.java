package com.iispl.validation;

import com.iispl.exception.InvalidChequeNumberException;
import com.iispl.model.Cheque;

public class ChequeNumberValidator implements Validator {

	@Override
	public void validate(Cheque cheque) throws InvalidChequeNumberException {
		
		 if (cheque.getChequeNumber() == null ||
			        cheque.getChequeNumber().trim().isEmpty()) {
			        throw new InvalidChequeNumberException();
			    }

			    if (cheque.getChequeNumber().length() != 6) {
			        throw new InvalidChequeNumberException();
			    }

}
}