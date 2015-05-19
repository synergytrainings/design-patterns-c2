package main.java.com.synisys.designPatternsTraining.builder.impl;

import com.sun.istack.internal.NotNull;

/**
 * Created by Razmik on 5/19/2015.
 */
public class StringMetaField extends MetaFieldImpl<String> {
    public StringMetaField(@NotNull String fieldName) {
        super(fieldName);
    }

    @Override
    public String visit(Entity entity) {
        return entity.get(this);
    }

}
