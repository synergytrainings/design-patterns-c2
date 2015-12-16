package impl.persistence;

import api.Classifier;
import com.sun.istack.internal.NotNull;
import impl.model.Category;
import impl.model.Group;
import impl.model.User;
import impl.provider.CategoryProvider;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Razmik on 12/16/2015.
 */
public class DataService {

    private List<Classifier> getUsers() {
        return Arrays.asList(new User(1, CategoryProvider.USER_CATEGORY, "John", "John"), new User(2, CategoryProvider.USER_CATEGORY, "Cary", "Cary"));
    }

    private List<Classifier> getGroups() {
        return Arrays.asList(new Group(1, CategoryProvider.USER_CATEGORY, "group1"), new Group(2, CategoryProvider.USER_CATEGORY, "group2"));
    }

    public List<Classifier> getClassifiers(@NotNull Category category) {
        if (category.equals(CategoryProvider.USER_CATEGORY)) {
            return getUsers();
        } else if (category.equals(CategoryProvider.GROUP_CATEGORY)) {
            return getGroups();
        }
        return Collections.emptyList();
    }
}
