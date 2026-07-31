package com.iispl.validation;

import com.iispl.exception.InvalidChequePriorityException;
import com.iispl.model.Cheque;

public class PriorityValidator implements Validator{

	@Override
	public void validate(Cheque cheque) throws InvalidChequePriorityException {
		
		if(cheque.getPriority() == null) {
			throw new InvalidChequePriorityException();
		}
	}

}
