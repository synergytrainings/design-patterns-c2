/**
 * Created by emil.saghatelyan on 6/23/15.
 */
public abstract class TextDecorator implements Text {
	private Text text;

	public TextDecorator(Text text) {
		this.text = text;
	}

	public Text getText() {
		return text;
	}


	@Override
	public String getInputText() {
		return text.getInputText();
	}
}
