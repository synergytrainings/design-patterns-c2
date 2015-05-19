package main.java.com.synisys.designPatternsTraining.builder.builders;

import main.java.com.synisys.designPatternsTraining.builder.api.MetaField;
import main.java.com.synisys.designPatternsTraining.builder.impl.Entity;
import main.java.com.synisys.designPatternsTraining.builder.impl.IntegerMetaField;
import main.java.com.synisys.designPatternsTraining.builder.impl.StringMetaField;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Razmik on 5/19/2015.
 */
public class EntityBuilder {

    private final Map<MetaField, Object> data = new HashMap<>();

    public static EntityBuilder newBuilder() {
        return new EntityBuilder();
    }

    private EntityBuilder() {

    }

    public EntityBuilder with(IntegerMetaField metaField, Integer value) {
        data.put(metaField, value);
        return this;
    }

    public EntityBuilder with(StringMetaField metaField, String value) {
        data.put(metaField, value);
        return this;
    }

    public Entity build() {
        return new Entity(data);
    }
}
