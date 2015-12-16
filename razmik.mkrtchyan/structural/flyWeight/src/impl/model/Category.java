package impl.model;

import com.sun.istack.internal.NotNull;

/**
 * Created by Razmik on 12/16/2015.
 */
public class Category {
    @NotNull
    public final String categoryName;

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (categoryName != null ? !categoryName.equals(category.categoryName) : category.categoryName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return categoryName != null ? categoryName.hashCode() : 0;
    }
}
