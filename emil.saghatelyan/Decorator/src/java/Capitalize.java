/**
 * Created by emil.saghatelyan on 6/23/15.
 */
public class Capitalize extends TextDecorator{

	public Capitalize(Text text) {
		super(text);
	}

	@Override
	public String getInputText() {
		return capitalizeText(this.getInputText());
	}

	private String capitalizeText(String text) {
		String result = text;
		if (text != null){
			result = result.toUpperCase();
		}
		return result;
	}
}
