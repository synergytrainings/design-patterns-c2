package main.java.com.synisys.designPatternsTraining.prototype.api;

import main.java.com.synisys.designPatternsTraining.prototype.impl.Entity;

/**
 * Created by Razmik on 6/2/2015.
 */
public abstract class EntityPrototype implements Cloneable {


    public abstract boolean isSame(Entity original);

    public <T extends EntityPrototype> void cloneFrom(T originalEntity) {
        cloneFields(originalEntity, this);
    }

    public abstract <T extends EntityPrototype> void cloneFields(T source, T destination);

    @Override
    public EntityPrototype clone() throws CloneNotSupportedException {
        return (EntityPrototype) super.clone();
    }
}
