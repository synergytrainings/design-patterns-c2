package com.synisys.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by emil on 3/23/16.
 */
public class Pessimistic implements MergeStrategy {


	@Override
	public Map<Integer, Permission> marge(Map<Integer, Permission> permissions1, Map<Integer, Permission> permissions2) {
		HashMap<Integer, Permission> merged = new HashMap<>();
		for (Integer key : permissions1.keySet()) {
			Permission p1 = permissions1.get(key);

			if (permissions2.containsKey(key)) {
				Permission permission = new Permission();
				Permission p2 = permissions2.get(key);
				permission.setAdd(p1.isAdd() && p2.isAdd());
				permission.setDelete(p1.isDelete() && p2.isDelete());
				permission.setEdit(p1.isEdit() && p2.isEdit());
				permission.setView(p1.isView() && p2.isView());

				permissions2.remove(key);
				merged.put(key, permission);
			} else {
				merged.put(key, p1);
			}
		}

		merged.putAll(permissions2);

		return merged;
	}
}
