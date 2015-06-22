package com.synisys.training.patterns.structural.decorator;

import com.synisys.training.patterns.structural.decorator.domain.DataTableImpl;
import com.synisys.training.patterns.structural.decorator.domain.EntityImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tatevik
 * since  6/23/2015.
 */
public class DecoratorDemo {

    public static void main(String[] args){

        List<EntityImpl> entityList = new ArrayList<>();
        entityList.add(new EntityImpl(5));
        entityList.add(new EntityImpl(2));
        entityList.add(new EntityImpl(1));
        entityList.add(new EntityImpl(10));

        System.out.println("List hashCode Before Editable Addable Decorator functionality: " + entityList.hashCode());

        DataTableDecorator dataTableDecorator = new EditableAddableDataTableDecorator(new SortedDataTableDecorator(new DataTableImpl(entityList)));
        dataTableDecorator.prepareDataTable();

        System.out.println("List hashCode After Editable Addable Decorator functionality: " + dataTableDecorator.getModel().hashCode());
        System.out.println(dataTableDecorator.getModel().toString());
    }
}
