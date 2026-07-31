package com.iispl.exception;

public class InvalidChequePriority extends Exception {

	@Override
	public String getMessage() {
		return "Invalid Cheque Priority";
	}
}
