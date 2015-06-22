package com.synisys.training.patterns.structural.decorator;

import com.synisys.training.patterns.structural.decorator.domain.DataTable;
import com.synisys.training.patterns.structural.decorator.domain.EntityImpl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Tatevik
 * since  6/23/2015.
 */
public class SortedDataTableDecorator extends DataTableDecorator {

    protected SortedDataTableDecorator(DataTable dataTable) {
        super(dataTable);
    }

    @Override
    public void prepareDataTable() {
        Collections.sort(this.dataTable.getModel(), new Comparator<EntityImpl>() {
            @Override
            public int compare(EntityImpl o1, EntityImpl o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
    }

    @Override
    public List<EntityImpl> getModel() {
        return this.dataTable.getModel();
    }

    @Override
    public void setModel(List<EntityImpl> entityList) {
        this.dataTable.setModel(entityList);
    }
}
