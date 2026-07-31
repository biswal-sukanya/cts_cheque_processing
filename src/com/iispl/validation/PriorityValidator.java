package com.iispl.validation;

import com.iispl.exception.InvalidChequePriority;
import com.iispl.model.Cheque;

public class PriorityValidator implements Validator{

	@Override
	public void validate(Cheque cheque) throws InvalidChequePriority {
		
		if(cheque.getPriority() == null) {
			throw new InvalidChequePriority();
		}
	}

}
