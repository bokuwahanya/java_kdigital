package com.ruby.java.ch11;

public class NagativeNumberException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NagativeNumberException() {
		super("음수는 허용되지않습니다.");
		// TODO Auto-generated constructor stub
	}
	public NagativeNumberException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	

}
