package java;

/**
 * Created by Emil on 6/16/2015.
 */
public class CheckBox implements EditableItem {
    private boolean modified;
    private boolean checked;

    public CheckBox(boolean checked) {
        this.checked = checked;
    }

    @Override
    public boolean isModified() {
        return this.modified;
    }

    public void setModified(boolean modified) {
        this.modified = modified;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
