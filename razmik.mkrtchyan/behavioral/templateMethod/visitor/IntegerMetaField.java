package TemplateMethod.visitor;

/**
 * Created by Razmik.Mkrtchyan on 3/31/2016.
 */
public class IntegerMetaField  implements  MetaField{
    @Override
    public void accept(MetaFieldVisitor metaFieldVisitor) {
        metaFieldVisitor.visit(this);
    }

    @Override
    public String getSystemName() {
        return null;
    }
}
