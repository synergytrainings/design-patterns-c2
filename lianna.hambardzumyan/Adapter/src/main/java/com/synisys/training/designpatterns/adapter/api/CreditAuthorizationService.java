package com.synisys.training.designpatterns.adapter.api;

import java.util.Date;

public interface CreditAuthorizationService {
	int checkApproval(int creditNumber, Date expiryDate, String type, int storeId);
}
