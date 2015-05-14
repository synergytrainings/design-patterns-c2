import com.synisys.db.connect.Connect;
import com.synisys.db.connect.factories.ConnectionFactory;
import com.synisys.db.connect.factories.MsSqlConnectionFactory;
import com.synisys.db.enums.DbType;

public class Main {


    public static void main(String[] args){

        ConnectionFactory connectionFactory  = ConnectionFactory.getConnectionFactory(DbType.MSSQl);
        Connect connect = connectionFactory.getConnection();
        connect.connect();
    }
}
