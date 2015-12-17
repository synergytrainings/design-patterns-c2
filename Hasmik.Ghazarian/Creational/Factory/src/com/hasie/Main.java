package com.hasie;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Check check = Factory.getCheck("payment");
		System.out.println("Dear customer" + check);
		
	}
}

