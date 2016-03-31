package templateMethodAndVisitor;


import templateMethodAndVisitor.visitor.BigDecimalMetaField;
import templateMethodAndVisitor.visitor.IntegerMetaField;
import templateMethodAndVisitor.visitor.StringMetaField;

import java.math.BigDecimal;


/**
 * Created by Razmik.Mkrtchyan on 3/31/2016.
 */
public interface EditableEntity extends Cloneable{

   boolean  isSame(EditableEntity editableEntity);
    EditableEntity clone();
     String get(StringMetaField stringMetaField) ;

     Integer get(IntegerMetaField stringMetaField) ;

     BigDecimal get(BigDecimalMetaField stringMetaField) ;
}
