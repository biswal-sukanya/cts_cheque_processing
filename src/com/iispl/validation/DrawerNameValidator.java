package com.iispl.validation;

import com.iispl.exception.InvalidDrawerNameException;
import com.iispl.model.Cheque;

public class DrawerNameValidator implements Validator {

	@Override
	public void validate(Cheque cheque) throws InvalidDrawerNameException {
		if(cheque.getDrawerName()==null || cheque.getDrawerName().trim().isEmpty()) {
			throw new InvalidDrawerNameException();
		}
		

	}

}
