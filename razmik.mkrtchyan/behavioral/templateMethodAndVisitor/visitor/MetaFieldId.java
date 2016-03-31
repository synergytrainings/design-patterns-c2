package templateMethodAndVisitor.visitor;

/**
 * Created by Razmik on 4/3/2016.
 */
public class MetaFieldId {

        public final String name;

    public MetaFieldId(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MetaFieldId that = (MetaFieldId) o;

        return name != null ? name.equals(that.name) : that.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
