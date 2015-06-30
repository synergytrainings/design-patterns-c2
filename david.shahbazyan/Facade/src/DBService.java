import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 6/30/15 <br/>
 * <b>Time:</b> 1:29 PM <br/>
 */
public interface DBService {
    ResultSet getResultSetFor(List<String> cols, String tableName, Map<String, Object> conditions) throws SQLException;
}
