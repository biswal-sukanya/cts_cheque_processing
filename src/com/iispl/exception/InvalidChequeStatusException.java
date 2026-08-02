package com.iispl.exception;

public class InvalidChequeStatusException extends Exception {

	@Override
	public String getMessage() {
		return "\nInvalid Cheque Status : Cheque Status is mandatory cannot be null";
	}
}
