package com.synisys.db.connect.factories;

import com.synisys.db.connect.Connect;
import com.synisys.db.connect.MsSqlConnect;

/**
 * Created by Emil on 5/15/2015.
 */
public class MsSqlConnectionFactory extends ConnectionFactory {
    @Override
    public Connect getConnection() {
        return new MsSqlConnect();
    }
}