package impl.model;

import api.ClassifierImpl;
import com.sun.istack.internal.NotNull;
import impl.provider.CategoryProvider;

/**
 * Created by Razmik on 12/16/2015.
 */
public class User extends ClassifierImpl {
    @NotNull
    private String fistsName;
    @NotNull
    private String lastName;

    public User(Integer id, Category category, String fistsName, String lastName) {
        super(id, category);
        this.fistsName = fistsName;
        this.lastName = lastName;
    }

    @Override
    public String getLabel() {
        return this.fistsName + " " + this.lastName;
    }

    @Override
    public Category getCategory() {
        return CategoryProvider.USER_CATEGORY;
    }
}
