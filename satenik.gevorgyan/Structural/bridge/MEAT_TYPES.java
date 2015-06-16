package structral.bridge;

/**
 * Created by TikSat on 16.06.2015.
 */
public  enum MEAT_TYPES {
    CHICKEN("chicken"),
    BRUTE("brute");
    private String typeName;

    MEAT_TYPES(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }
}
