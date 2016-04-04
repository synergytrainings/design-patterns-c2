package behavioral.visitor;

/**
 * Created by Hasmik.Ghazaryan on 4/4/2016.
 */
public class MetaFieldVisitor {

    public void visit(ParentMetaField parentMetaField) {
        // Do specific action for ParentMetaField
        System.out.print("Convert ParentMetaField");
    }

    public void visit(IntegerMetaField integerMetaField) {
        // Do specific action for IntegerMetaField
        System.out.print("Convert IntegerMetaField");
    }

    public void visit(BigDecimalMetaField bigDecimalMetaField) {
        // Do specific action for BigDecimalMetaField
        System.out.print("Convert BigDecimalMetaField");
    }

    public void visit(DateTimeMetaField dateTimeMetaField) {
        // Do specific action for DateTimeMetaField
        System.out.print("Convert DateTimeMetaField");
    }

}
