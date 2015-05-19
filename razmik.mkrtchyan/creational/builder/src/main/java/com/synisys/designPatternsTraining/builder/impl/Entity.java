package main.java.com.synisys.designPatternsTraining.builder.impl;

import com.sun.istack.internal.NotNull;
import main.java.com.synisys.designPatternsTraining.builder.api.MetaField;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Razmik on 5/19/2015.
 */
public class Entity {
    private final Map<MetaField, Object> data;

    public Entity(Map<MetaField, Object> data) {
        this.data = new HashMap<>(data);
    }

    @SuppressWarnings("unchecked")
    public <T> T get(@NotNull MetaField<T> metaField) {
        if (metaField instanceof StringMetaField || metaField instanceof IntegerMetaField) {
            return (T) this.data.get(metaField);
        }
        throw new IllegalStateException("Not supported type");
    }

    public Set<MetaField> getMetaFields() {
        return this.data.keySet();
    }

}
