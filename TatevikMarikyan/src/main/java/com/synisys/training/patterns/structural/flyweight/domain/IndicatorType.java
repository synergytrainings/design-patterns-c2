package com.synisys.training.patterns.structural.flyweight.domain;

/**
 * Created by Tatevik
 * since  20-Dec-15.
 */
public enum IndicatorType {

    INDICATOR_A (1, "Indicator_A", true,    false,  false),
    INDICATOR_B (2, "Indicator_B", false,   true,   false),
    INDICATOR_C (3, "Indicator_C", false,   false,  true)
    ;

    IndicatorType(Integer indicatorId, String indicatorName, boolean is1stLvl, boolean is12ndLvl, boolean is3rdLvl) {
        this.indicatorId = indicatorId;
        this.indicatorName = indicatorName;
        this.is1stLvl = is1stLvl;
        this.is12ndLvl = is12ndLvl;
        this.is3rdLvl = is3rdLvl;
    }

    private Integer indicatorId;

    private String indicatorName;

    private boolean is1stLvl;

    private boolean is12ndLvl;

    private boolean is3rdLvl;

    public Integer getIndicatorId() {
        return indicatorId;
    }

    public String getIndicatorName() {
        return indicatorName;
    }

    public boolean isIs1stLvl() {
        return is1stLvl;
    }

    public boolean isIs12ndLvl() {
        return is12ndLvl;
    }

    public boolean isIs3rdLvl() {
        return is3rdLvl;
    }
}
