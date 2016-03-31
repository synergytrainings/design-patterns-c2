package templateMethodAndVisitor.visitor;

/**
 * Created by Razmik.Mkrtchyan on 3/31/2016.
 */
public class StringMetaField
		extends MetaFieldImpl {

	public StringMetaField(MetaFieldId metaFieldId) {
		super(metaFieldId);
	}

	@Override
	public void accept(MetaFieldVisitor metaFieldVisitor) {
		metaFieldVisitor.visit(this);
	}
}
