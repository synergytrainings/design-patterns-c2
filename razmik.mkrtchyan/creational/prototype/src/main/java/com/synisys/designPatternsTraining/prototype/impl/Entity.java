package main.java.com.synisys.designPatternsTraining.prototype.impl;

import main.java.com.synisys.designPatternsTraining.prototype.api.EntityPrototype;

import java.util.Date;

/**
 * Created by Razmik on 6/2/2015.
 */
public class Entity extends EntityPrototype {


    private Integer id;
    private Date startDate;
    private String title;

    public Entity(Integer id, Date startDate, String title) {
        this.id = id;
        this.startDate = startDate;
        this.title = title;
    }

    @Override
    public boolean isSame(Entity original) {
        if (id != null ? !id.equals(original.id) : original.id != null) {
            return false;
        }
        if (title != null ? !title.equals(original.title) && !title.isEmpty() && original.title != null : original.title != null) {
            return false;
        }
        if (startDate != null ? !startDate.equals(original.startDate) : original.startDate != null) {
            return false;
        }

        return true;
    }

    @Override
    public <T extends EntityPrototype> void cloneFields(T source, T destination) {
        Entity concreteSource = (Entity) source;
        Entity concreteDestination = (Entity) destination;
        concreteDestination.startDate = (Date) concreteSource.startDate.clone();
        concreteDestination.title = concreteSource.title;
        concreteDestination.id = concreteSource.id;
    }

    public Integer getId() {
        return id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public Entity clone() throws CloneNotSupportedException {
        Entity cloneEntity = (Entity) super.clone();
        cloneEntity.cloneFrom(this);
        return cloneEntity;
    }
}

