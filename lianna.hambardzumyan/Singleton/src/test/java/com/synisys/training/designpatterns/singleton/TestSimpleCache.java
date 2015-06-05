package com.synisys.training.designpatterns.singleton;

import com.synisys.training.designpatterns.singleton.impl.SimpleCache;

public class TestSimpleCache {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(SimpleCache.INSTANCE.getImage("daughter.jpg"));
	}

}
