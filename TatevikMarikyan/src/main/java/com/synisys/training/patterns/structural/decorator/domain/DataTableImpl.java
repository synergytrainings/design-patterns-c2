package com.synisys.training.patterns.structural.decorator.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tatevik
 * since  6/23/2015.
 */
public class DataTableImpl implements DataTable {

    private List<EntityImpl> model;

    public DataTableImpl(List<EntityImpl> model) {
        this.model = model;
    }

    @Override
    public void prepareDataTable() {
        this.model = new ArrayList<>();
    }

    @Override
    public List<EntityImpl> getModel() {
        return this.model;
    }

    public void setModel(List<EntityImpl> model) {
        this.model = model;
    }
}
