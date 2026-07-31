package com.iispl.validation;

import com.iispl.exception.InvalidPresentingBankException;
import com.iispl.model.Cheque;

public class PresentingBankValidator implements Validator {

	@Override
	public void validate(Cheque cheque) throws InvalidPresentingBankException {
		if(cheque.getPresentingBank()==null || cheque.getPresentingBank().trim().isEmpty()) {
			throw new InvalidPresentingBankException();
		}

	}

}
