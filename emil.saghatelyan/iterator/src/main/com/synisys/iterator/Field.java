package main.com.synisys.iterator;

/**
 * Created by emil.saghatelyan on 2/29/2016.
 */
public class Field {

	private Integer id;
	private String name;
	private boolean required;

	public Field(Integer id, String name, boolean required) {
		this.id = id;
		this.name = name;
		this.required = required;
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

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}
}
