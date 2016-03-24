package com.synisys.strategy;

/**
 * Created by emil on 3/23/16.
 */
public class Permission {
//	private int itemId;
	private boolean edit;
	private boolean view;
	private boolean add;
	private boolean delete;




	public boolean isEdit() {
		return edit;
	}

	public void setEdit(boolean edit) {
		this.edit = edit;
	}

	public boolean isView() {
		return view;
	}

	public void setView(boolean view) {
		this.view = view;
	}

	public boolean isAdd() {
		return add;
	}

	public void setAdd(boolean add) {
		this.add = add;
	}

	public boolean isDelete() {
		return delete;
	}

	public void setDelete(boolean delete) {
		this.delete = delete;
	}
}
