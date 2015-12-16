package api;

import com.sun.istack.internal.NotNull;
import impl.model.Category;

/**
 * Created by Razmik on 12/16/2015.
 */
public abstract class ClassifierImpl implements Classifier {
    @NotNull
    private Integer id;
    @NotNull
    private Category category;

    public ClassifierImpl(Integer id, Category category) {
        this.id = id;
        this.category = category;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public Category getCategory() {
        return category;
    }
}
