package api;

import impl.model.Category;

/**
 * Created by Razmik on 12/16/2015.
 */
public interface Classifier {

    Integer getId();

    String getLabel();

    Category getCategory();
}
