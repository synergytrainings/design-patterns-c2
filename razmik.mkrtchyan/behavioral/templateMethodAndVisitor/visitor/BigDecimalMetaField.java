package templateMethodAndVisitor.visitor;

/**
 * Created by Razmik.Mkrtchyan on 3/31/2016.
 */
public class BigDecimalMetaField  extends MetaFieldImpl{


    public BigDecimalMetaField(MetaFieldId metaFieldId) {
        super(metaFieldId);
    }

    @Override
    public void accept(MetaFieldVisitor metaFieldVisitor) {
    metaFieldVisitor.visit(this);
    }
}
