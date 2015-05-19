package main.java.com.synisys.designPatternsTraining.builder.api;

import main.java.com.synisys.designPatternsTraining.builder.impl.Entity;

/**
 * Created by Razmik on 5/19/2015.
 */
public interface MetaField<T> {

    String getFieldName();

    T visit(Entity entity);
}
