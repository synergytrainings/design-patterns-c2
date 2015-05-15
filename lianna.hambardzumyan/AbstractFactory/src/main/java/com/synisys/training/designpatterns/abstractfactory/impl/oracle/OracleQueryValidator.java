package com.synisys.training.designpatterns.abstractfactory.impl.oracle;

import com.synisys.training.designpatterns.abstractfactory.api.QueryValidator;

public class OracleQueryValidator extends QueryValidator{
	private final static String[] unsafeStatements = { "DROP", "DELETE", "UPDATE", "ALTER", "MODIFY", "RENAME" };
	
	@Override
	public String[] getUnsafeStatements() {
		return unsafeStatements;
	};

}
