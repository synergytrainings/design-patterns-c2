package com.synisys.training.designpatterns.adapter.impl;

import java.util.Date;

import com.synisys.training.designpatterns.adapter.api.CreditAuthorizationServiceAdapter;
import com.synisys.training.designpatterns.adapter.api.Sale;

public class PaymentSystem {
	private CreditAuthorizationServiceAdapter authorizationAdapter = new CreditAuthorizationServiceAdapterImpl();
	
	public void makeCreditPayment(int creditNumber, Date expiryDate, Sale sale) {
		StatusCode reply = authorizationAdapter.requestApproval(creditNumber, expiryDate);
		if(reply == StatusCode.SUCCESS) {
			// make successful payment
		} else {
			// show message
		}
	}
}
