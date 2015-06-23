/**
 * Created by emil.saghatelyan on 6/23/15.
 */
public class RemovePeriods extends TextDecorator{

	public RemovePeriods(Text text) {
		super(text);
	}


	@Override
	public String getInputText() {
		return removePeriodsText(this.getInputText());
	}

	private String removePeriodsText(String text) {
		String result = text;
		if (text != null){
			result = result.replace(".", "");
		}
		return result;
	}
}
