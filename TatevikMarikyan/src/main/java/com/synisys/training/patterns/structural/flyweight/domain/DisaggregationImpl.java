package com.synisys.training.patterns.structural.flyweight.domain;

/**
 * Created by Tatevik
 * since  20-Dec-15.
 */
public class DisaggregationImpl implements Disaggregation{

    private Integer id;

    private String name;

    public DisaggregationImpl() {
    }

    public DisaggregationImpl(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
