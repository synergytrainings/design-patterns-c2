package com.synisys.training.designpatterns.abstractfactory.impl.oracle;

import com.synisys.training.designpatterns.abstractfactory.api.AbstractQueryValidator;

public class OracleQueryValidator extends AbstractQueryValidator{
	private final static String[] unsafeStatements = { "DROP", "DELETE", "UPDATE", "ALTER", "MODIFY", "RENAME" };
	
	@Override
	public String[] getUnsafeStatements() {
		return unsafeStatements;
	};

}
