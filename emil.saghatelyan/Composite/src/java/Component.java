package java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Emil on 6/16/2015.
 */
public class Component implements EditableItem{
    private List<EditableItem> editableItems = new ArrayList<EditableItem>();

    public Component(List<EditableItem> editableItems) {

        this.editableItems = editableItems;
    }

    public List<EditableItem> getEditableItems() {
        return editableItems;
    }

    public void setEditableItems(List<EditableItem> editableItems) {
        this.editableItems = editableItems;
    }

    @Override
    public boolean isModified() {
        for(EditableItem editableItem : editableItems){
            if(editableItem.isModified()){
                return true;
            }
        }
        return false;
    }

    public void addComponentItem(EditableItem item){
        if (!editableItems.contains(item)){
            editableItems.add(item);
            }
        }
    public void removeProjectItem(EditableItem item){
        editableItems.remove(item);
    }

}
