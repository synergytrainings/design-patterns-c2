import main.java.com.synisys.designPatternsTraining.prototype.impl.Entity;

import java.util.Date;

/**
 * Created by Razmik on 5/15/2015.
 */
public class PrototypeTester {
    public static void main(String[] args) throws CloneNotSupportedException {
        //before editing action -entity
        Entity originalEntity=new Entity(1,new Date(),"entity1");
        //after edit action -entity
        Entity entity=originalEntity.clone();
        //after modification
        entity.setTitle("project2");
        System.out.println(entity.isSame(originalEntity));



    }
}
