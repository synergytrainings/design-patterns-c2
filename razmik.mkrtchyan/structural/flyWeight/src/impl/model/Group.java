package impl.model;

import api.ClassifierImpl;
import com.sun.istack.internal.NotNull;
import impl.provider.CategoryProvider;

/**
 * Created by Razmik on 12/16/2015.
 */
public class Group extends ClassifierImpl {
    @NotNull
    private String groupName;

    public Group(Integer id, Category category, String groupName) {
        super(id, category);
        this.groupName = groupName;
    }

    @Override
    public String getLabel() {
        return this.groupName;
    }

    @Override
    public Category getCategory() {
        return CategoryProvider.GROUP_CATEGORY;
    }
}
