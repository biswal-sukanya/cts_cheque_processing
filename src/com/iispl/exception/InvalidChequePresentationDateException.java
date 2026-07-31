package com.iispl.exception;

public class InvalidChequePresentationDateException extends Exception{
	@Override
	public String getMessage() {
		return "Invalid Cheque presented Date";
	}
}
