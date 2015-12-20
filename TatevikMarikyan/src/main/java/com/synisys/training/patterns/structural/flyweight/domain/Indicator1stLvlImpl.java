package com.synisys.training.patterns.structural.flyweight.domain;

import java.math.BigDecimal;

/**
 * Created by Tatevik
 * since  20-Dec-15.
 */
public class Indicator1stLvlImpl implements Indicator {

    private IndicatorType indicatorType;

    private Disaggregation disaggregation1;

    private BigDecimal count;

    public Indicator1stLvlImpl() {
        this.disaggregation1 = new DisaggregationImpl();
    }

    public Indicator1stLvlImpl(IndicatorType indicatorType) {
        this.indicatorType = indicatorType;
        this.disaggregation1 = new DisaggregationImpl();
    }

    public Indicator1stLvlImpl(IndicatorType indicatorType, Disaggregation disaggregation1, BigDecimal count) {
        this.indicatorType = indicatorType;
        this.disaggregation1 = disaggregation1;
        this.count = count;
    }

    @Override
    public IndicatorType getIndicatorType() {
        return indicatorType;
    }

    public void setIndicatorType(IndicatorType indicatorType) {
        this.indicatorType = indicatorType;
    }

    public Disaggregation getDisaggregation1() {
        return disaggregation1;
    }

    public void setDisaggregation1(Disaggregation disaggregation1) {
        this.disaggregation1 = disaggregation1;
    }

    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }
}
