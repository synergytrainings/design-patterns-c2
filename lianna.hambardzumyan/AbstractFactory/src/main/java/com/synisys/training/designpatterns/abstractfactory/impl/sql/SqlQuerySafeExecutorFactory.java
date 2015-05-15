package com.synisys.training.designpatterns.abstractfactory.impl.sql;

import com.synisys.training.designpatterns.abstractfactory.api.*;


public class SqlQuerySafeExecutorFactory implements QuerySafeExecutorFactory{

	@Override
	public QueryValidator createQueryValidator() {
		return new SqlQueryValidator();
	}

	@Override
	public QueryExecutor createQueryExecutor() {
		return new SqlQueryExecutor();
	}
	
}
