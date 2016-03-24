package com.synisys.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by emil on 3/23/16.
 */
public interface MergeStrategy {

	Map<Integer, Permission> marge(Map<Integer, Permission> permissions1, Map<Integer, Permission> permissions2);
}
