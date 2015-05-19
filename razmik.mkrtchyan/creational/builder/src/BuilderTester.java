import main.java.com.synisys.designPatternsTraining.builder.builders.EntityBuilder;
import main.java.com.synisys.designPatternsTraining.builder.builders.SqlInsertQueryBuilder;
import main.java.com.synisys.designPatternsTraining.builder.impl.Entity;
import main.java.com.synisys.designPatternsTraining.builder.impl.IntegerMetaField;
import main.java.com.synisys.designPatternsTraining.builder.impl.StringMetaField;

/**
 * Created by Razmik on 5/15/2015.
 */
public class BuilderTester {


    public static void main(String[] args) {
        EntityBuilder entityBuilder = EntityBuilder.newBuilder();
        Entity entity = entityBuilder.with(new IntegerMetaField("id"), 1).with(new StringMetaField("organization"), "Synergy Armenia").build();
        SqlInsertQueryBuilder sqlInsertQueryBuilder = new SqlInsertQueryBuilder(entity);
        System.out.println(sqlInsertQueryBuilder.getQuery());
    }


}
