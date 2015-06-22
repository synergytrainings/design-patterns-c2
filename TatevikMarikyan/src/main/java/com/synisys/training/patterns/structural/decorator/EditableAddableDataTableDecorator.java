package com.synisys.training.patterns.structural.decorator;

import com.synisys.training.patterns.structural.decorator.domain.DataTable;
import com.synisys.training.patterns.structural.decorator.domain.EntityImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tatevik
 * since  6/23/2015.
 */
public class EditableAddableDataTableDecorator extends DataTableDecorator {

    protected EditableAddableDataTableDecorator(DataTable dataTable) {
        super(dataTable);
    }

    @Override
    public void prepareDataTable() {
        this.dataTable.prepareDataTable();
        List<EntityImpl> modelDecorList = new ArrayList<>();
        for (EntityImpl entity : this.dataTable.getModel()) {
            try {
                modelDecorList.add(entity.clone());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        setModel(modelDecorList);
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
