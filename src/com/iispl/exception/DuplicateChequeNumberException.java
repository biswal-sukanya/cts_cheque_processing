package com.iispl.exception;

public class DuplicateChequeNumberException extends Exception{

	@Override
	public String getMessage() {
		return "Duplicate Cheque Number Found.";
	}
}
