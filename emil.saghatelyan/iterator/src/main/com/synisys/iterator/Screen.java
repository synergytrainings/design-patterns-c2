package main.com.synisys.iterator;

import java.util.List;

/**
 * Created by emil.saghatelyan on 2/29/2016.
 */
public class Screen {
	private Integer id;
	private String name;
	private List<Field> fields;
	private boolean valid;

	public Screen(Integer id, String name, List<Field> fields) {
		this.id = id;
		this.name = name;
		this.fields = fields;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Field> getFields() {
		return fields;
	}

	public void setFields(List<Field> fields) {
		this.fields = fields;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}
}
