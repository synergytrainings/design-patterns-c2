package com.hasie;

public class Factory {
	
	public static Check getCheck(String type){
        if("payment".equalsIgnoreCase(type)){
        	return new PaymentCheck();
        }
        else if("queue".equalsIgnoreCase(type)){
        	return new QueueCheck();
        }
        return null;
    }


}
