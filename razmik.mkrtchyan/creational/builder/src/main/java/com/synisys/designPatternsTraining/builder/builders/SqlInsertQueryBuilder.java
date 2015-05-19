package main.java.com.synisys.designPatternsTraining.builder.builders;

import com.sun.istack.internal.NotNull;
import main.java.com.synisys.designPatternsTraining.builder.api.MetaField;
import main.java.com.synisys.designPatternsTraining.builder.impl.Entity;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by Razmik on 5/19/2015.
 */
public class SqlInsertQueryBuilder {
    private Entity entity;

    public SqlInsertQueryBuilder(@NotNull Entity entity) {
        //Precondition
        Objects.requireNonNull(entity);
        this.entity = entity;
    }


    private String getColumnsBySeparate() {
        return new ArrayList<>(entity.getMetaFields()).stream()
                .map(MetaField::getFieldName)
                .collect(Collectors.joining(", "));
    }

    private String getParamsBySeparate() {
        return new ArrayList<>(entity.getMetaFields()).stream()
                .map(e -> entity.get(e).toString())
                .collect(Collectors.joining(", "));
    }

    public String getQuery() {
        return "insert into (" + getColumnsBySeparate() + ")" + " values (" + getParamsBySeparate() + ");";

    }
}
