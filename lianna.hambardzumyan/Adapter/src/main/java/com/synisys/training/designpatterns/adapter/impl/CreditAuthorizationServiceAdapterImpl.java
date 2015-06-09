package com.synisys.training.designpatterns.adapter.impl;

import java.util.Date;

import com.synisys.training.designpatterns.adapter.api.CreditAuthorizationService;
import com.synisys.training.designpatterns.adapter.api.CreditAuthorizationServiceAdapter;

public class CreditAuthorizationServiceAdapterImpl implements CreditAuthorizationServiceAdapter{
	private CreditAuthorizationService authorizationService  = new CreditAuthorizationServiceImpl();
	
	@Override
	public StatusCode requestApproval(int creditNumber, Date expiryDate) {
		String type = getCreditTypeByNumber(creditNumber);
		int storeId = Store.getId(); 
		int reply = authorizationService.checkApproval(creditNumber, expiryDate, type, storeId);
		StatusCode transformedReply;
		if(reply == 1) {
			transformedReply = StatusCode.SUCCESS;
		} else {
			transformedReply = StatusCode.ERROR;
		}
		return transformedReply;
	}

	private String getCreditTypeByNumber(int creditNumber) {
		if(String.valueOf(creditNumber).length() < 12) {
			return "VISA";
		} else {
			return "MasterCard";
		}
	}

}
