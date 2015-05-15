package com.synisys.training.designpatterns.abstractfactory.impl.sql;

import com.synisys.training.designpatterns.abstractfactory.api.AbstractQueryValidator;

public class SqlQueryValidator extends AbstractQueryValidator {
	private final static String[] unsafeStatements = { "DROP", "DELETE", "UPDATE", "ALTER" };
	
	@Override
	public String[] getUnsafeStatements() {
		return unsafeStatements;
	};

	

}
