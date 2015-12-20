package com.synisys.training.patterns.structural.flyweight.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tatevik
 * since  20-Dec-15.
 */
public class IndicatorTypeManager {

    private static Map<Integer, IndicatorType> indicatorType1stLvlMap = new HashMap<>();

    private static Map<Integer, IndicatorType> indicatorType2ndLvlMap = new HashMap<>();

    private static Map<Integer, IndicatorType> indicatorType3rdLvlMap = new HashMap<>();

    static{
        for (IndicatorType indicatorType: IndicatorType.values()){
            if (indicatorType.isIs1stLvl()){
                indicatorType1stLvlMap.put(indicatorType.getIndicatorId(), indicatorType);
            } else if (indicatorType.isIs12ndLvl()){
                indicatorType2ndLvlMap.put(indicatorType.getIndicatorId(), indicatorType);
            } else if(indicatorType.isIs3rdLvl()){
                indicatorType3rdLvlMap.put(indicatorType.getIndicatorId(), indicatorType);
            }
        }
    }

    public static IndicatorType getIndicatorType1stLvlMapById(Integer indicatorId) {
        return indicatorType1stLvlMap.get(indicatorId);
    }

    public static IndicatorType getIndicatorType2ndLvlMapById(Integer indicatorId) {
        return indicatorType2ndLvlMap.get(indicatorId);
    }

    public static IndicatorType getIndicatorType3rdLvlMapById(Integer indicatorId) {
        return indicatorType3rdLvlMap.get(indicatorId);
    }
}
