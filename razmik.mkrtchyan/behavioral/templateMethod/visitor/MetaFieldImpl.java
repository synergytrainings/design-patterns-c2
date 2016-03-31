package TemplateMethod.visitor;

/**
 * Created by Razmik.Mkrtchyan on 3/31/2016.
 */
public abstract class MetaFieldImpl
		implements MetaField {

	private final String systemName;

	public MetaFieldImpl(String systemName) {
		this.systemName = systemName;
	}

	@Override
	public String getSystemName() {
		return systemName;
	}
}
