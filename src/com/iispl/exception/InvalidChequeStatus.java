package com.iispl.exception;

public class InvalidChequeStatus extends Exception {

	@Override
	public String getMessage() {
		return "Invalid Cheque Status";
	}
}
