import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 6/30/15 <br/>
 * <b>Time:</b> 1:25 PM <br/>
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        DBService service = new DBServiceImpl();
        List<String> cols = Arrays.asList("col1", "col2", "...", "colN");
        Map<String, Object> conditions = new HashMap<>();
        conditions.put("ID", 4);
        conditions.put("Name", "SomeName");

        System.out.println(service.getResultSetFor(cols, "dbo.TableName", conditions));
    }
}
