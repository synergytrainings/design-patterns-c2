package com.synisys.trainings.interpreter;

import java.util.HashMap;

/**
 * Created by emil on 2/21/16.
 */
public class Context {
	private HashMap<String, Integer> varList = new HashMap();

	public void assign(String var, Integer value) {
		varList.put(var, value);
	}

	public Integer getValue(String var) {
		return varList.get(var);
	}

	public Context() {

	}



}
