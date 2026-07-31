package com.iispl.exception;

public class InvalidChequeDateException extends Exception{
	@Override
	public String getMessage() {
		return "Invalid Cheque Date";
	}
}
