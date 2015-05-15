package com.synisys.training.designpatterns.abstractfactory;

import com.synisys.training.designpatterns.abstractfactory.api.DBType;
import com.synisys.training.designpatterns.abstractfactory.api.FactoryProducer;
import com.synisys.training.designpatterns.abstractfactory.api.QueryExecutor;
import com.synisys.training.designpatterns.abstractfactory.api.QuerySafeExecutorFactory;
import com.synisys.training.designpatterns.abstractfactory.api.QueryValidator;

public class TestQuerySafeExecutorFactory {
	private final static String UNSAFE_SQL_QUERY = "DROP TABLE Employees";
	private final static String SAFE_SQL_QUERY = "SELECT * FROM Employees";

	private final static String UNSAFE_ORACLE_QUERY = "ALTER TABLE customers MODIFY customer_name varchar2(100) not null;";
	private final static String SAFE_ORACLE_QUERY = "SELECT DISTINCT p FROM Player WHERE t.city = :city";
	
	public static void main(String[] args) {
		validateAndExecuteSqlQuery(SAFE_SQL_QUERY);
		validateAndExecuteSqlQuery(UNSAFE_SQL_QUERY);

		validateAndExecuteOracleQuery(SAFE_ORACLE_QUERY);
		validateAndExecuteOracleQuery(UNSAFE_ORACLE_QUERY);

	}


	public static void validateAndExecuteSqlQuery(String query) {
		QuerySafeExecutorFactory sqlQuerySafeExecutorFactory = FactoryProducer.getFactory(DBType.SQL);
		
		QueryValidator sqlQueryValidator = sqlQuerySafeExecutorFactory.createQueryValidator();
		QueryExecutor sqlQueryExecutor = sqlQuerySafeExecutorFactory.createQueryExecutor();
		
		boolean isValid = sqlQueryValidator.validate(query);
		if(isValid) {
			sqlQueryExecutor.execute(query);
			System.out.println(String.format("\" %s \" SQL query has been executed successfully.", query));
		} else {
			System.out.println(String.format("\" %s \" SQL query is unsafe.", query));
		}
		
	}
	
	
	private static void validateAndExecuteOracleQuery(String query) {
		QuerySafeExecutorFactory oracleQuerySafeExecutorFactory = FactoryProducer.getFactory(DBType.ORACLE);
		
		QueryValidator oracleQueryValidator = oracleQuerySafeExecutorFactory.createQueryValidator();
		QueryExecutor oracleQueryExecutor = oracleQuerySafeExecutorFactory.createQueryExecutor();
		
		boolean isValid = oracleQueryValidator.validate(query);
		if(isValid) {
			oracleQueryExecutor.execute(query);
			System.out.println(String.format("\" %s \" Oracle query has been executed successfully.", query));
		} else {
			System.out.println(String.format("\" %s \" Oracle query is unsafe.", query));
		}
		
	}

}
