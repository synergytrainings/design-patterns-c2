package main.java.com.synisys.designPatternsTraining.builder.impl;

import com.sun.istack.internal.NotNull;

/**
 * Created by Razmik on 5/19/2015.
 */
public class IntegerMetaField extends MetaFieldImpl<Integer> {
    public IntegerMetaField(@NotNull String fieldName) {
        super(fieldName);
    }

    @Override
    public Integer visit(Entity entity) {
        return entity.get(this);
    }
}
