package com.iispl.exception;

public class InvalidChequeAmountException extends Exception {
	
	
	
	@Override
	public String getMessage() {
		return "Invalid Cheque Amount";
	}

}
