package TemplateMethod.visitor;

/**
 * Created by Razmik.Mkrtchyan on 3/31/2016.
 */
public class StringMetaField
		extends MetaFieldImpl {
	public StringMetaField(String systemName) {
		super(systemName);
	}

	@Override
	public void accept(MetaFieldVisitor metaFieldVisitor) {
		metaFieldVisitor.visit(this);
	}
}
