import com.sun.deploy.util.StringUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 6/30/15 <br/>
 * <b>Time:</b> 1:29 PM <br/>
 */
public class DBServiceImpl implements DBService {
    @Override
    public ResultSet getResultSetFor(List<String> cols, String tableName, Map<String, Object> conditions) throws SQLException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setTestConnectionOnCheckout(true);
        dataSource.setDriverClass("net.sourceforge.jtds.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:jtds:sqlserver://sis2s093:1433");
        dataSource.setUser("idmdaduser");
        dataSource.setPassword("idmdaduser");

        dataSource.setMaxPoolSize(10);
        dataSource.setMinPoolSize(5);
        dataSource.setInitialPoolSize(5);

        Connection connection = dataSource.getConnection();

        StringBuilder conditionsBuilder = new StringBuilder();
        Iterator<Map.Entry<String, Object>> iterator = conditions.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Object> next = iterator.next();
            conditionsBuilder.append(next.getKey() + " = " + next.getValue());
            if (iterator.hasNext()) {
                conditionsBuilder.append(" AND ");
            }
        }

        String query = "SELECT " + StringUtils.join(cols, ", ") + tableName + conditionsBuilder.toString();
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.executeQuery();
        return preparedStatement.getResultSet();
    }
}
