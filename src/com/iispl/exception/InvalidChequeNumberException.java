package com.iispl.exception;

public class InvalidChequeNumberException extends Exception{
	
	
	@Override
	public String getMessage() {
		return "Invalid Cheque Number";
	}

}
