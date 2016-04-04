package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hasmik.Ghazaryan on 4/4/2016.
 */
public class CategoryConverterService {

    private List<MetaField> getMetaFields(){
        //List<MetaField> metaFieldList =  new ArrayList<>();
        return new ArrayList<>();
        //Here are Integer, Parent, BigDecimal and DateTime metaFields
    }

    public void convert(){
        MetaFieldVisitor visitor = new MetaFieldVisitor();
        for (MetaField metaField : getMetaFields()){
            metaField.accept(visitor);
        }
    }

}
