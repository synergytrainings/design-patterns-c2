package templateMethodAndVisitor.visitor;

/**
 * Created by Razmik.Mkrtchyan on 3/31/2016.
 */
public abstract class MetaFieldImpl
		implements MetaField {

	private final MetaFieldId metaFieldId;

	public MetaFieldImpl(MetaFieldId metaFieldId) {
		this.metaFieldId = metaFieldId;
	}

	public MetaFieldId getMetaFieldId() {
		return metaFieldId;
	}
}
