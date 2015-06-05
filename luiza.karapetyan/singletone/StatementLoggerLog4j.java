

import org.apache.log4j.Logger;

import com.synisys.utility.dac.DbType;
import com.synisys.utility.dac.StatementLoggerImpl;

/**
 * Class extends StatementLoggerImpl in order to log sql queries via log4j
 *
 * @version 1.0
 */
public class StatementLoggerLog4j extends StatementLoggerImpl {
    private static final Logger logger = Logger.getLogger(StatementLoggerLog4j.class);

    public StatementLoggerLog4j(DbType dbType) {
        super(dbType);
    }

    /**
     * Logs SQL query with injected parameters values
     */
    @Override
    public void log(String sqlString, Object[][] params) {
        log(null, sqlString, params);
    }

    /**
     * Logs queryId and  SQL query with injected parameters values
     */
    @Override
    public void log(String queryId, String sqlString, Object[][] params) {
        StringBuilder sb = new StringBuilder();
        if (queryId != null) {
            sb.append("SQL queryId : ").append(queryId);
        }
        sb.append("\n\t\t\t\t");
        sb.append(params == null ? sqlString : replaceParameters(sqlString, params));
        logger.debug(sb.toString());
        sb.append("\n\n\n");
    }
}
