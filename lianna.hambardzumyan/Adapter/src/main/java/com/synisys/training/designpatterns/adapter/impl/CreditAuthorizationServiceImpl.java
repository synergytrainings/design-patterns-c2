package com.synisys.training.designpatterns.adapter.impl;

import java.util.Date;

import com.synisys.training.designpatterns.adapter.api.CreditAuthorizationService;

public class CreditAuthorizationServiceImpl implements CreditAuthorizationService{

	@Override
	public int checkApproval(int creditNumber, Date expiryDate, String type, int storeId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
