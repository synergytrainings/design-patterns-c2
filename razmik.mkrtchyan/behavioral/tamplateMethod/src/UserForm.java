/**
 * Created by Razmik.Mkrtchyan on 3/31/2016.
 */
public class UserForm
		extends AbstractEditableEntityForm {

	@Override
	protected void loadFormData(Integer id) {
		setEntity(new User());
		//load from DB
	}

	@Override
	public void save() {
		getEntity(); //insert to DB
	}

	@Override
	public void beforeSave() {

	}

}
