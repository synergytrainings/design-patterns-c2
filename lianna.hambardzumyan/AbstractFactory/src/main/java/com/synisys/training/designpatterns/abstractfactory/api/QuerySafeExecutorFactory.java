package com.synisys.training.designpatterns.abstractfactory.api;

public interface QuerySafeExecutorFactory {
	public QueryValidator createQueryValidator(); 
	public QueryExecutor createQueryExecutor(); 
}
