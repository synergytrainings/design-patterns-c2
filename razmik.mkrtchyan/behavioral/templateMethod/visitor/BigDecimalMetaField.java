package TemplateMethod.visitor;

/**
 * Created by Razmik.Mkrtchyan on 3/31/2016.
 */
public class BigDecimalMetaField  extends MetaFieldImpl{
    public BigDecimalMetaField(String systemName) {
        super(systemName);
    }

    @Override
    public void accept(MetaFieldVisitor metaFieldVisitor) {
    metaFieldVisitor.visit(this);
    }
}
