package com.synisys.strategy;

import java.util.Map;

/**
 * Created by emil on 3/24/16.
 */
public class PermissionContext {

	private MergeStrategy mergeStrategy;

	public PermissionContext(MergeStrategy mergeStrategy) {
		this.mergeStrategy = mergeStrategy;
	}

	public MergeStrategy getMergeStrategy() {
		return mergeStrategy;
	}

	public void setMergeStrategy(MergeStrategy mergeStrategy) {
		this.mergeStrategy = mergeStrategy;
	}

	public Map<Integer, Permission> merge(Map<Integer, Permission> p1, Map<Integer, Permission> p2){
		return mergeStrategy.marge(p1, p2);
	}
}
