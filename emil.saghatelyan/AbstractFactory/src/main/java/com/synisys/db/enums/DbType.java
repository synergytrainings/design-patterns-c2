package com.synisys.db.enums;

/**
 * Created by Emil on 5/15/2015.
 */
public enum DbType {
    MSSQl(1),
    ORACLE(2),
    MYSQL(3);

    private DbType(int id) {
        this.id = id;
    }
    public final int id;
}
