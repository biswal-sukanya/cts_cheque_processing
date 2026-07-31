package com.iispl.exception;

public class InvalidChequeStatusException extends Exception {

	@Override
	public String getMessage() {
		return "Invalid Cheque Status";
	}
}
