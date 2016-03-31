package templateMethodAndVisitor.visitor;

/**
 * Created by Razmik.Mkrtchyan on 3/31/2016.
 */
public class IntegerMetaField  extends   MetaFieldImpl{
    public IntegerMetaField(MetaFieldId metaFieldId) {
        super(metaFieldId);
    }

    @Override
    public void accept(MetaFieldVisitor metaFieldVisitor) {
        metaFieldVisitor.visit(this);
    }


}
