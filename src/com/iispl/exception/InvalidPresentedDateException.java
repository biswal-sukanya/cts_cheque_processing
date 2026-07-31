package com.iispl.exception;

public class InvalidPresentedDateException extends Exception{
	@Override
	public String getMessage() {
		return "Invalid Cheque Presented Date";
	}
}
