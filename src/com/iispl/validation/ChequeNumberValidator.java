package com.iispl.validation;

import com.iispl.model.Cheque;

public class ChequeNumberValidator implements Validator {

	@Override
	public void validate(Cheque cheque) throws Exception {
		
		 if (cheque.getChequeNumber() == null ||
			        cheque.getChequeNumber().trim().isEmpty()) {
			        throw new Exception("Cheque number cannot be empty");
			    }

			    if (cheque.getChequeNumber().length() != 6) {
			        throw new Exception("Cheque number must be 6 characters");
			    }

}
}