package com.synisys.training.patterns.creational.abstractFactory.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Tatevik.Marikyan
 * @since 14-May-15.
 */
public class MPAOResponse implements Response {

    private Integer id;

    private BigDecimal localAmount;

    private BigDecimal foreignAmount;

    public MPAOResponse() {
    }

    @Override
    public void printResponseDetails() {
        System.out.println("Response result:");
        System.out.println("Local Amount:     " + this.localAmount);
        System.out.println("Foreign number:   " + this.foreignAmount);
    }

    public MPAOResponse(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getLocalAmount() {
        return localAmount;
    }

    public void setLocalAmount(BigDecimal localAmount) {
        this.localAmount = localAmount;
    }

    public BigDecimal getForeignAmount() {
        return foreignAmount;
    }

    public void setForeignAmount(BigDecimal foreignAmount) {
        this.foreignAmount = foreignAmount;
    }
}
