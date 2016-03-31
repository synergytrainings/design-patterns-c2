package templateMethodAndVisitor;


import templateMethodAndVisitor.visitor.*;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Razmik.Mkrtchyan on 3/31/2016.
 */
public class EditableEntityImpl
        implements EditableEntity {

    private final HashMap<MetaFieldId, Object> data;
    private final Collection<MetaFieldId> metaFieldIds;

    public EditableEntityImpl(HashMap<MetaFieldId, Object> data) {
        this.data = data;
        this.metaFieldIds = Collections.unmodifiableCollection(data.keySet().stream().collect(Collectors.toList()));
    }

    public String get(StringMetaField stringMetaField) {
        return (String) data.get(stringMetaField);
    }

    public Integer get(IntegerMetaField integerMetaField) {
        return (Integer) data.get(integerMetaField);
    }

    public BigDecimal get(BigDecimalMetaField bigDecimalMetaField) {
        return (BigDecimal) data.get(bigDecimalMetaField);
    }

    @Override
    public boolean isSame(EditableEntity editableEntity) {
        CustomMetaFieldVisitor metaFieldVisitor = new CustomMetaFieldVisitor(editableEntity, this);
        final boolean result[] = {false};
        metaFieldIds.forEach(metaFieldId -> {
            Engine.getMetaField(metaFieldId).accept(metaFieldVisitor);
            result[0] = result[0] || metaFieldVisitor.result;
        });
        return result[0];
    }

    @Override
    public EditableEntity clone() {
        return new EditableEntityImpl((HashMap<MetaFieldId, Object>) data.clone());
    }

    private static class CustomMetaFieldVisitor implements MetaFieldVisitor {
        public boolean result = true;
        private EditableEntity source;
        private EditableEntity target;

        public CustomMetaFieldVisitor(EditableEntity source, EditableEntity target) {
            this.source = source;
            this.target = target;
        }

        @Override
        public void visit(IntegerMetaField metaField) {
            this.result = !source.get(metaField).equals(target.get(metaField));
        }

        @Override
        public void visit(BigDecimalMetaField metaField) {
            this.result = source.get(metaField).equals(target.get(metaField));
        }

        @Override
        public void visit(StringMetaField metaField) {
            this.result = source.get(metaField).equals(target.get(metaField));
        }
    }

}
