package templateMethodAndVisitor;

import templateMethodAndVisitor.visitor.IntegerMetaField;
import templateMethodAndVisitor.visitor.MetaFieldId;

/**
 * Created by Razmik.Mkrtchyan on 3/31/2016.
 */
public class UserForm
        extends AbstractEditableEntityForm {

    @Override
    protected void loadFormData(Integer id) {
        setEntity(EntityBuilder.newBuilder().with(new IntegerMetaField(new MetaFieldId("s")), id).build());
    }

    @Override
    public void save() {
        getEntity(); //insert to DB
    }

    @Override
    public void beforeSave() {

    }

}
