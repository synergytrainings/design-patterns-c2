package com.synisys.training.designpatterns.abstractfactory.impl.oracle;

import com.synisys.training.designpatterns.abstractfactory.api.QueryExecutor;
import com.synisys.training.designpatterns.abstractfactory.api.QuerySafeExecutorFactory;
import com.synisys.training.designpatterns.abstractfactory.api.QueryValidator;

public class OracleQuerySafeExecutorFactory implements QuerySafeExecutorFactory{

	@Override
	public QueryValidator createQueryValidator() {
		return new OracleQueryValidator();
	}

	@Override
	public QueryExecutor createQueryExecutor() {
		return new OracleQueryExecutor();
	}
	
}
