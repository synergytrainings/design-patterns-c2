package com.synisys.training.patterns.structural.flyweight;

import com.synisys.training.patterns.structural.flyweight.domain.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tatevik
 * since  20-Dec-15.
 */
public class IndicatorFactory {

    private static final Map<IndicatorType, List<? extends Indicator>> indicatorMap = new HashMap<>();

    public static synchronized  List<? extends Indicator> getIndicatorList(IndicatorType indicatorType){
        List<? extends Indicator> indicators = indicatorMap.get(indicatorType);
        if (indicators == null){
            indicators = new ArrayList<>();
        }
        indicatorMap.put(indicatorType, indicators);

        return indicators;
    }

}
