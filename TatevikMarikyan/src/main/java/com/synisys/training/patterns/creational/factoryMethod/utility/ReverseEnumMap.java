package com.synisys.training.patterns.creational.factoryMethod.utility;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Tatevik.Marikyan
 * @since 22-May-15.
 */
public class ReverseEnumMap<K, V extends Enum<V> & ConvertibleEnum<K>> {

    private Map<K, V> map = new HashMap<>();

    public ReverseEnumMap(Class<V> enumClass) {
        for (V value : enumClass.getEnumConstants()) {
            map.put(value.convert(), value);
        }
    }

    public V findInstance(K key) {
        return map.get(key);
    }
}
