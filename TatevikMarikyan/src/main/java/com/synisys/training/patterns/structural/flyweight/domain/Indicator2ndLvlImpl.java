package com.synisys.training.patterns.structural.flyweight.domain;

/**
 * Created by Tatevik
 * since  20-Dec-15.
 */
public class Indicator2ndLvlImpl extends Indicator1stLvlImpl {

    private Disaggregation disaggregation2;

    public Indicator2ndLvlImpl(IndicatorType indicatorType) {
        super(indicatorType);
        this.disaggregation2 = new DisaggregationImpl();
    }

    public Disaggregation getDisaggregation2() {
        return disaggregation2;
    }

    public void setDisaggregation2(Disaggregation disaggregation2) {
        this.disaggregation2 = disaggregation2;
    }
}
