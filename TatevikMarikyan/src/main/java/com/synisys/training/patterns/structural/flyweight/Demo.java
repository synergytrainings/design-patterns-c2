package com.synisys.training.patterns.structural.flyweight;

import com.synisys.training.patterns.structural.flyweight.IndicatorFactory;
import com.synisys.training.patterns.structural.flyweight.domain.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Tatevik
 * since  20-Dec-15.
 */
public class Demo {

    public static void main(String args[]) throws SQLException {

        // Indicators List must be called from db
        List<ResultSet> rows = new ArrayList<>();
        createIndicatorMaps(rows);
    }

    public static <T extends Indicator> void createIndicatorMaps(List<ResultSet> rows) throws SQLException {
        Integer indicatorId;
        IndicatorType indicatorType;
        List<T> indicators = Collections.emptyList();
        T indicator = null;

        for (ResultSet row: rows){
            indicatorId = row.getInt("IndicatorId");
            indicatorType = IndicatorTypeManager.getIndicatorType1stLvlMapById(indicatorId);
            if (indicatorType != null){
                indicators = (List<T>) IndicatorFactory.getIndicatorList(indicatorType);
                indicator = (T) new Indicator1stLvlImpl(indicatorType);

            } else {
                indicatorType = IndicatorTypeManager.getIndicatorType2ndLvlMapById(indicatorId);
                if (indicatorType != null){
                    indicators = (List<T>) IndicatorFactory.getIndicatorList(indicatorType);
                    indicator = (T) new Indicator2ndLvlImpl(indicatorType);
                } else{
                    indicatorType = IndicatorTypeManager.getIndicatorType3rdLvlMapById(indicatorId);
                    if (indicatorType != null){
                        indicators = (List<T>) IndicatorFactory.getIndicatorList(indicatorType);
                        indicator = (T) new Indicator3rdLvlImpl(indicatorType);
                    }
                }
            }
            indicators.add(indicator);
        }
    }
}
