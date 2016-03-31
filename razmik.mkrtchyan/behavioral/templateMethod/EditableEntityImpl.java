package TemplateMethod;

import TemplateMethod.visitor.BigDecimalMetaField;
import TemplateMethod.visitor.IntegerMetaField;
import TemplateMethod.visitor.MetaField;
import TemplateMethod.visitor.MetaFieldVisitor;
import TemplateMethod.visitor.StringMetaField;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Razmik.Mkrtchyan on 3/31/2016.
 */
public class EditableEntityImpl
        implements EditableEntity {

    private final HashMap<String, Object> data;
    private final String category;
    private final List<MetaField> metaFields;

    public EditableEntityImpl(String category, HashMap<String, Object> data, List<MetaField> metaFields) {
        this.category = category;
        this.data = data;
        this.metaFields = metaFields;
    }

    public String get(StringMetaField stringMetaField) {
        return (String) data.get(stringMetaField.getSystemName());
    }

    public Integer get(IntegerMetaField stringMetaField) {
        return (Integer) data.get(stringMetaField.getSystemName());
    }

    public BigDecimal get(BigDecimalMetaField stringMetaField) {
        return (BigDecimal) data.get(stringMetaField.getSystemName());
    }

    @Override
    public boolean isSame(EditableEntity editableEntity) {
        CustomMetaFieldVisitor metaFieldVisitor = new CustomMetaFieldVisitor(editableEntity, this);
        final boolean result[] = {false};
        metaFields.forEach(metaField -> {
            metaField.accept(metaFieldVisitor);
            result[0] = result[0] || metaFieldVisitor.result;
        });
        return result[0];
    }

    @Override
    public EditableEntity clone() {
        return new EditableEntityImpl(this.category, (HashMap<String, Object>) data.clone(), metaFields);
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
