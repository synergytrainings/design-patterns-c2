package com.synisys.db.connect.factories;

import com.sun.jndi.ldap.Connection;
import com.synisys.db.connect.Connect;
import com.synisys.db.connect.OracleConnect;

/**
 * Created by Emil on 5/15/2015.
 */
public class OracleConnectionFactory extends ConnectionFactory {
    @Override
    public Connect getConnection() {
        return new OracleConnect();
    }
}
