package com.iispl.validation;

import com.iispl.model.Cheque;

public interface Validator {

	void validate(Cheque cheque) throws Exception;
}
