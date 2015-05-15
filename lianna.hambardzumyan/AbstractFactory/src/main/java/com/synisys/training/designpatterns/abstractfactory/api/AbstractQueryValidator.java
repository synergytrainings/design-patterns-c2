package com.synisys.training.designpatterns.abstractfactory.api;

public abstract class AbstractQueryValidator implements QueryValidator{

	public boolean validate(String query) {
		String[] unsafeStatements = getUnsafeStatements();
		for(int i = 0; i < unsafeStatements.length; i++) {
			if(query.toLowerCase().contains(unsafeStatements[i].toLowerCase())) {
				return false;
			}
		}
		return true; 
	}
	
	public abstract String[] getUnsafeStatements();

}
