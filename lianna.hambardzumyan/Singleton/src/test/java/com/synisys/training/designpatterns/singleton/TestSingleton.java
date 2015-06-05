package com.synisys.training.designpatterns.singleton;

import com.synisys.training.designpatterns.singleton.impl.SimpleCache;

public class TestSingleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleCache cache1 = SimpleCache.INSTANCE;
		SimpleCache cache2 = SimpleCache.INSTANCE;
		System.out.println(cache1 == cache2);

	}

}
