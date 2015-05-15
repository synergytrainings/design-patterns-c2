package com.synisys.training.designpatterns.abstractfactory.impl.sql;

import com.synisys.training.designpatterns.abstractfactory.api.QueryValidator;

public class SqlQueryValidator extends QueryValidator {
	private final static String[] unsafeStatements = { "DROP", "DELETE", "UPDATE", "ALTER" };
	
	@Override
	public String[] getUnsafeStatements() {
		return unsafeStatements;
	};

	

}
