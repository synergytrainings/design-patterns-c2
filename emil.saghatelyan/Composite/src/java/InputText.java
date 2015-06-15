package java;

/**
 * Created by Emil on 6/16/2015.
 */
public class InputText implements EditableItem {
    private String text;
    private boolean isModified;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setModified(boolean isModified) {
        this.isModified = isModified;
    }

    public InputText(String text) {

        this.text = text;
    }

    @Override
    public boolean isModified() {
        return this.isModified;
    }
}
