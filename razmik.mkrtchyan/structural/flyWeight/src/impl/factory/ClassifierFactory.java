package impl.factory;

import api.Classifier;
import impl.model.Category;
import impl.persistence.DataService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Razmik on 12/16/2015.
 */
public class ClassifierFactory {
    private  static  ClassifierFactory instance;
    private Map<Category, List<Classifier>> cache;
    private final DataService persistenceService = new DataService();

    private ClassifierFactory() {
        this.cache = new HashMap<>();
    }

    public static ClassifierFactory getInstance() {
        if (instance == null) {
            instance = new ClassifierFactory();
        }
        return instance;
    }

    public List<Classifier> get(Category category) {
        if (!cache.containsKey(category)) {
            cache.put(category, persistenceService.getClassifiers(category));
        }
        return cache.get(category);
    }
}
