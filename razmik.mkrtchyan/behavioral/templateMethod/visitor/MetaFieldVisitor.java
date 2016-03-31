package TemplateMethod.visitor;

public interface MetaFieldVisitor {

	void visit(IntegerMetaField metaField);

	void visit(BigDecimalMetaField metaField);

	void visit(StringMetaField metaField);

	/*............*/

}
