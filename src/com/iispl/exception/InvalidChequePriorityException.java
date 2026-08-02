package com.iispl.exception;

public class InvalidChequePriorityException extends Exception {

	@Override
	public String getMessage() {
		return "\nInvalid Cheque Priority : Cheque Priority is mandatory cannot be null";
	}
}
