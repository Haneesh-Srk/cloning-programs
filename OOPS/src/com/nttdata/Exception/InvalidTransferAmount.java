package com.nttdata.Exception;

public class InvalidTransferAmount extends Exception{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidTransferAmount(String message) {
		super("Insufficient fund");
	}
}
