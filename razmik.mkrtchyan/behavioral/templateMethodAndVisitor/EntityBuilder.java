package templateMethodAndVisitor;

import templateMethodAndVisitor.visitor.BigDecimalMetaField;
import templateMethodAndVisitor.visitor.IntegerMetaField;
import templateMethodAndVisitor.visitor.MetaFieldId;
import templateMethodAndVisitor.visitor.StringMetaField;

import java.math.BigDecimal;
import java.util.HashMap;

/**
 * Created by Razmik on 4/3/2016.
 */
public class EntityBuilder {

    private final HashMap<MetaFieldId, Object> data;

    public static EntityBuilder newBuilder() {
        return new EntityBuilder();
    }


    EntityBuilder() {
        data = new HashMap<>();
    }


    public EntityBuilder with(IntegerMetaField metaField, Integer value) {
        data.put(metaField.getMetaFieldId(), value);
        return this;
    }


    public EntityBuilder with(StringMetaField metaField, String value) {
        data.put(metaField.getMetaFieldId(), value);
        return this;
    }


    public EntityBuilder with(BigDecimalMetaField metaField, BigDecimal value) {
        data.put(metaField.getMetaFieldId(), value);
        return this;

    }

    public EditableEntityImpl build() {
        return new EditableEntityImpl(data);
    }

}
