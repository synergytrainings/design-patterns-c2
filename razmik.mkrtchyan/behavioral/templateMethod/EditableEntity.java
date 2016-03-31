package TemplateMethod;

import TemplateMethod.visitor.BigDecimalMetaField;
import TemplateMethod.visitor.IntegerMetaField;
import TemplateMethod.visitor.MetaField;
import TemplateMethod.visitor.StringMetaField;

import java.math.BigDecimal;
import java.util.List;

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
