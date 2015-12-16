import api.Classifier;
import impl.factory.ClassifierFactory;
import impl.provider.CategoryProvider;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ClassifierFactory classifierFactory = ClassifierFactory.getInstance();
        List<Classifier> usersFromContext1 = classifierFactory.get(CategoryProvider.USER_CATEGORY);
        List<Classifier> usersFromContext2 = classifierFactory.get(CategoryProvider.USER_CATEGORY);

    }
}
