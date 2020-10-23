package com.nttdata.Bank;

public class InvalidTransferAmount extends Exception{


	
	private static final long serialVersionUID = 1L;

	InvalidTransferAmount(String message) {
		super("Insufficient fund");
	}
}