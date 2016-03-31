/**
 * Created by Razmik.Mkrtchyan on 3/31/2016.
 */
public class User
		implements EditableEntity {
	@Override
	public boolean isSame(EditableEntity editableEntity) {
		return false;
	}

	@Override
	public EditableEntity clone() {
		return null;
	}

}
