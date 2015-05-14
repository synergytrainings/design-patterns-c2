package com.synisys.db.connect.factories;

import com.synisys.db.connect.Connect;
import com.synisys.db.enums.DbType;

/**
 * Created by Emil on 5/15/2015.
 */
public abstract class ConnectionFactory {
    public abstract Connect getConnection();

    public static ConnectionFactory getConnectionFactory(DbType  dbType) {
        switch (dbType) {
            case MSSQl:
                return new MsSqlConnectionFactory();
            case MYSQL:
                return new MySqlConnectionFactory();
            case ORACLE:
                return new OracleConnectionFactory();
            default:
                throw new IllegalArgumentException(String.format("Unknown DB Type %s", dbType));

        }
    }
}
