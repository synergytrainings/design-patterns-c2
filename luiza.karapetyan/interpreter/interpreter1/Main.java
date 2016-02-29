package com.synisys.de.rwandaIngo.interpreter1;

/**
 * Created by Luiza.Karapetyan on 2/25/2016.
 */
public class Main {
    public static void main(String[] args) {
        Expression select = new IsInExpression("Select");
        Expression from = new IsInExpression("From");
        Expression isSelectFrom = new AndExpression(select, from);

        Expression insert = new IsInExpression("Insert");
        Expression update = new IsInExpression("Update");
        Expression isInsertOrUpdate = new OrExpression(insert, update);

        System.out.println(isSelectFrom.evaluate("Select"));
        System.out.println(isInsertOrUpdate.evaluate("Insert"));

        System.out.println(isSelectFrom.evaluate("Select From"));
        System.out.println(isInsertOrUpdate.evaluate("Update"));
    }
}
