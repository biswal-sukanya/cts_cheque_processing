package com.iispl.exception;

public class InvalidChequePriorityException extends Exception {

	@Override
	public String getMessage() {
		return "Invalid Cheque Priority";
	}
}
