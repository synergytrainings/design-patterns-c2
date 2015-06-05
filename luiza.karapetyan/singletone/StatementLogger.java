

/**
 * Objects of this type are used in DataAccessLayer to log executed sql statements
 *
 */
public interface StatementLogger {

	/**
	 * 
	 * @param sql query text
	 * @param parameters sql statement parameters value array
	 */
	void log(String sql, Object[][] parameters);

	/**
	 * 
	 * @param queryId
	 * @param sql
	 * @param parameters
	 */
	void log(String queryId, String sql, Object[][] parameters);

	/**
	 * Log query which is executed in a batch mode (with PreparedStatement.addBatch method)
	 * Implementations usually should iterate and print parameters
	 * @param query
	 * @param parameters
	 */
	void logBatch(String query, Object[][][] parameters);
	
	/**
	 * Log query which is executed in a batch mode (with PreparedStatement.addBatch method)
	 * Implementations usually should iterate and print parameters
	 * @param queryId
	 * @param query
	 * @param parameters
	 */
	void logBatch(String queryId, String query, Object[][][] parameters);

}
