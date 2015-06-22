package com.synisys.training.patterns.structural.decorator.domain;

import java.util.List;

/**
 * Created by Tatevik
 * since  6/23/2015.
 */
public interface DataTable {

    void prepareDataTable();

    List<EntityImpl> getModel();

    void setModel(List<EntityImpl> entityList);
}
