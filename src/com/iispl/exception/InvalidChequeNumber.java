package com.iispl.exception;

public class InvalidChequeNumber extends Exception{
	
	
	@Override
	public String getMessage() {
		return "Invalid Cheque Number";
	}

}
