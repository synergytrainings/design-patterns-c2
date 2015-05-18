package com.synisys.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Emil on 5/18/2015.
 */
public class Query {
    private List<String> columns;
    private List<String> tableNames;
    private List<String> wheres;
    private StringBuilder query;

    private Query(QueryBuilder queryBuilder) {
        this.columns = queryBuilder.columns;
        this.tableNames = queryBuilder.tableNames;
        this.wheres = queryBuilder.wheres;
        this.query = queryBuilder.query;
    }

    public List<String> getColumns() {
        return columns;
    }

    public List<String> getTableNames() {
        return tableNames;
    }

    public List<String> getWheres() {
        return wheres;
    }

    public StringBuilder getQuery() {
        return query;
    }

    public static class QueryBuilder {
        private final String SELECT = "select ";
        private final String FROM = " from ";
        private final String WHERE = " where ";
        private final String SEMICOLON = ", ";
        private final String AND = " and ";
        private List<String> columns = new ArrayList<>();
        private List<String> tableNames = new ArrayList<>();
        private List<String> wheres = new ArrayList<>();
        private StringBuilder query = new StringBuilder();

        public QueryBuilder() {
        }

        public QueryBuilder select(String s) {
            this.columns.add(s);
            return this;
        }

        public QueryBuilder from(String table) {
            this.tableNames.add(table);
            return this;
        }

        public QueryBuilder where(String where) {
            this.wheres.add(where);
            return this;
        }


        public Query build() {

            //add selected columns
            if (this.columns.size() == 0) {
                this.query.append(SELECT).append("*");
            } else {
                this.appendQuery(this.columns, SELECT, SEMICOLON);
            }
            //add table names
            this.appendQuery(this.tableNames, FROM, SEMICOLON);
            //add where conditions
            this.appendQuery(this.wheres, WHERE, AND);
            return new Query(this);

        }

        private void appendQuery(List<String> items, String opName, String sep) {
            this.query.append(opName);
            for (String item : items) {
                this.query.append(item).append(sep);
            }
            this.query.setLength(this.query.length() - sep.length());
        }
    }


}
