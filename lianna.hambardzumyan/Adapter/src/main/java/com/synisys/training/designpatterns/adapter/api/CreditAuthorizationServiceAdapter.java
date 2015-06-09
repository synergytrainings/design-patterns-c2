package com.synisys.training.designpatterns.adapter.api;

import java.util.Date;

import com.synisys.training.designpatterns.adapter.impl.StatusCode;

public interface CreditAuthorizationServiceAdapter {
	public StatusCode requestApproval(int creditNumber, Date expiryDate);
}
