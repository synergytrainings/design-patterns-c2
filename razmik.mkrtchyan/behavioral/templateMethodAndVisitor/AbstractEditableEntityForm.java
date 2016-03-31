package templateMethodAndVisitor;

/**
 * Created by Razmik.Mkrtchyan on 3/31/2016.
 */
public abstract class AbstractEditableEntityForm {

    private EditableEntity entity;

    private EditableEntity originalEntity;


    public void init(Integer id) {
        loadFormData(id);
        cloneFormData();
    }


    protected void cloneFormData() {
        setOriginalEntity(this.getEntity().clone());
    }

    protected abstract void loadFormData(Integer id);

    public boolean isEntityEdited() {
        return !getEntity().isSame(getOriginalEntity());
    }

    public void cancelAction() {
        performCancel();
    }

    public void okAction() {
        if (isEntityEdited()) {
            beforeSave();
            save();
            // after save replace original entity with current
            setOriginalEntity(getEntity().clone());
        }
    }

    public abstract void save();

    public abstract void beforeSave();

    public void performCancel() {
        if (isEntityEdited()) {
            this.entity = originalEntity.clone();
        }
    }

    public EditableEntity getOriginalEntity() {
        return this.originalEntity;
    }

    public EditableEntity getEntity() {
        return this.entity;
    }

    public void setOriginalEntity(EditableEntity originalEntity) {
        this.originalEntity = originalEntity;
    }

    public void setEntity(EditableEntity entity) {
        this.entity = entity;
    }
}
