package templateMethodAndVisitor.visitor;

public interface MetaField {
	void accept(MetaFieldVisitor metaFieldVisitor);

	 MetaFieldId getMetaFieldId();

}