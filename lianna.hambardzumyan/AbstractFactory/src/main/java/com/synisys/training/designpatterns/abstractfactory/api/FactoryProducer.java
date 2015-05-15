package com.synisys.training.designpatterns.abstractfactory.api;

import com.synisys.training.designpatterns.abstractfactory.impl.oracle.OracleQuerySafeExecutorFactory;
import com.synisys.training.designpatterns.abstractfactory.impl.sql.SqlQuerySafeExecutorFactory;

public class FactoryProducer {

	public static QuerySafeExecutorFactory getFactory(DBType dbType) {
		switch (dbType) {
		case SQL:
			return new SqlQuerySafeExecutorFactory();
		case ORACLE:
			return new OracleQuerySafeExecutorFactory();
		default:
			throw new IllegalArgumentException("Unsupported dbType " + dbType);
		}
	}

}
