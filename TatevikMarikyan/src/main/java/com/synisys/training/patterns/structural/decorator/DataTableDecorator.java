package com.synisys.training.patterns.structural.decorator;

import com.synisys.training.patterns.structural.decorator.domain.DataTable;
import com.synisys.training.patterns.structural.decorator.domain.EntityImpl;

import java.util.List;

/**
 * Created by Tatevik
 * since  6/23/2015.
 */
public abstract class DataTableDecorator implements DataTable {

    protected DataTable dataTable;

    protected DataTableDecorator(DataTable dataTable) {
        this.dataTable = dataTable;
    }

}
