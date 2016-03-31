package TemplateMethod.visitor;

public interface MetaField {
	void accept(MetaFieldVisitor metaFieldVisitor);

	 String getSystemName();

}