

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;

/**
 * Default implementation of StatementLogger with only replaceParameters helper method
 
 *
 */
public abstract class StatementLoggerImpl implements StatementLogger {

	private DbType dbType;

	public StatementLoggerImpl(DbType dbType) {
		this.dbType = dbType;
	}

	/**
	 * 
	 * @param sql
	 * @param parameters
	 * @return sql query string with replaced parameters
	 */
	protected String replaceParameters(String sql, Object[][] parameters) {
		if (sql == null) {
			throw new IllegalArgumentException("sql can't be null");
		}
		if (parameters == null) {
			throw new IllegalArgumentException("parameters can't be null");
		}
		HashMap<String, Object> valueTable = new HashMap<String, Object>(parameters.length);

		for (int i = 0; i < parameters.length; i++) {
			valueTable.put((String) parameters[i][0], parameters[i][1]);
		}

		for (Object[] parameter : parameters) {
			StringBuilder value = new StringBuilder();
			if (parameter[1] == null) {
				value.append("NULL");
			}
			else if (parameter[1] instanceof SqlParsedParameter) {
				value.append(((SqlParsedParameter) parameter[1]).getValue());

			}
			else if (parameter[1] instanceof List<?>) {
				Iterator<?> it = ((List<?>) parameter[1]).iterator();
				boolean isFirst = true;
				while (it.hasNext()) {
					if (!isFirst) {
						value.append(",");
					}
					else {
						isFirst = false;
					}
					//TODO: optimize when not string
					value.append(replaceParameterValue(it.next().toString()));
				}
			}
			else if (parameter[1] instanceof String[]) {
				String[] values = ((String[]) parameter[1]);
				if (values.length > 0) {
					value.append(replaceParameterValue(values[0]));
					for (int ind = 1; ind < values.length; ind++) {
						value.append(",");
						value.append(replaceParameterValue(values[ind]));
					}
				}
			}
			else if (parameter[1] instanceof String) {
				value.append("'");
				value.append(((String) parameter[1]).replaceAll("'", "''"));
				value.append("'");

			}
			else if (parameter[1] instanceof Date) {
				value.append(convertDate((Date) parameter[1]));
			}
			else {
				value.append(parameter[1].toString());
			}
			sql = sql.replaceAll("\\Q@@" + parameter[0] + "\\E", Matcher.quoteReplacement(value.toString()));
		}
		return sql;
	}

	private String replaceParameterValue(String value) {
		if (value != null)
			return "'" + value.replaceAll("'", "''") + "'";
		else
			return "NULL";
	}

	protected String convertDate(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/DD hh:mm:ss");

		String dateStr = dateFormat.format(date);//"2009/07/16 08:28:01";
		switch (dbType) {
			case MSSQL:
				return "CONVERT(datetime, '" + dateStr + "', 120)";
			case Oracle:
				return "TO_DATE('" + dateStr + "', 'YYYY/MM/DD HH:MI:SS')";
			case MySQL:
				return "STR_TO_DATE('" + dateStr + "', '%Y/%m/%d %T')";
			default:
				throw new IllegalArgumentException("Unsupported dbType" + dbType);
		}

	}
	
	@Override
	public void logBatch(String query, Object[][][] parameters) {
		for(Object[][] parameter : parameters){
			log(query, parameter);
		}
		
	}
	
	@Override
	public void logBatch(String queryId, String query, Object[][][] parameters) {
		for(Object[][] parameter : parameters){
			log(queryId, query, parameter);
		}
		
	}

}
