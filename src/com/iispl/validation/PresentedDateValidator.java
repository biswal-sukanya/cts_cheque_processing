package com.iispl.validation;

import com.iispl.exception.InvalidChequePresentationDateException;
import com.iispl.model.Cheque;

public class PresentedDateValidator implements Validator{

	@Override
	public void validate(Cheque cheque) throws InvalidChequePresentationDateException {
		if(cheque.getPresentedDate().isBefore(cheque.getChequeDate())) {
			throw new InvalidChequePresentationDateException();
		}
		
	}
	
}
