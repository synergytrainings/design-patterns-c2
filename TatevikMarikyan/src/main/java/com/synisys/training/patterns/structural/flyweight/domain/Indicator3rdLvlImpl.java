package com.synisys.training.patterns.structural.flyweight.domain;

/**
 * Created by Tatevik
 * since  20-Dec-15.
 */
public class Indicator3rdLvlImpl extends Indicator2ndLvlImpl {

    private Disaggregation disaggregation3;

    public Indicator3rdLvlImpl(IndicatorType indicatorType) {
        super(indicatorType);
        this.disaggregation3 = new DisaggregationImpl();
    }

    public Disaggregation getDisaggregation3() {
        return disaggregation3;
    }

    public void setDisaggregation3(Disaggregation disaggregation3) {
        this.disaggregation3 = disaggregation3;
    }
}
