/**
 * Created by Razmik.Mkrtchyan on 3/31/2016.
 */
public interface EditableEntity extends Cloneable{

   boolean  isSame(EditableEntity editableEntity);
    EditableEntity clone();
}
