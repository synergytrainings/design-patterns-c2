package behavioral.templateMethod;

/**
 * Created by Hasmik.Ghazaryan on 4/4/2016.
 */
public class TemplateMethodDemo {

    public static void main(String[] args) {

        Project pgmf = new PgmfProject();
        pgmf.save();
        Project poa = new PoaProject();
        poa.save();
    }
}
