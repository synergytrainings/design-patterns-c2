package behavioral.visitor;

/**
 * Created by Hasmik.Ghazaryan on 4/4/2016.
 */
public interface MetaField {

    void accept(MetaFieldVisitor visitor);

}
