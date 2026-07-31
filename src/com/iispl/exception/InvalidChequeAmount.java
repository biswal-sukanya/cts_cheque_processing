package com.iispl.exception;

public class InvalidChequeAmount extends Exception {
	
	
	
	@Override
	public String getMessage() {
		return "Invalid Cheque Amount";
	}

}
