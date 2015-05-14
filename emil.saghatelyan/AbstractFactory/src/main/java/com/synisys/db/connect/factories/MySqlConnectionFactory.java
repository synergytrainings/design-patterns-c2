package com.synisys.db.connect.factories;

import com.synisys.db.connect.Connect;
import com.synisys.db.connect.MySqlConnect;

/**
 * Created by Emil on 5/15/2015.
 */
public class MySqlConnectionFactory extends ConnectionFactory {
    @Override
    public Connect getConnection() {
        return new MySqlConnect();
    }
}