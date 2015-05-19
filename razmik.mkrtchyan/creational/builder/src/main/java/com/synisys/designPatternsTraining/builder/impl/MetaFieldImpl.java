package main.java.com.synisys.designPatternsTraining.builder.impl;

import com.sun.istack.internal.NotNull;
import main.java.com.synisys.designPatternsTraining.builder.api.MetaField;

import java.util.Objects;

/**
 * Created by Razmik on 5/19/2015.
 */
public abstract class MetaFieldImpl<T> implements MetaField<T> {
    @NotNull
    private String fieldName;

    public MetaFieldImpl(@NotNull String fieldName) {
        Objects.requireNonNull(fieldName);//Precondition
        this.fieldName = fieldName;
    }

    public String getFieldName() {
        return fieldName;
    }

    @Override
    public abstract T visit(Entity entity);
}
