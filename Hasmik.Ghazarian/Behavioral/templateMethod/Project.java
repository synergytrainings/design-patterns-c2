package behavioral.templateMethod;

/**
 * Created by Hasmik.Ghazaryan on 4/4/2016.
 */
public abstract class Project {

    abstract String generateNumber();
    abstract void doWorkflowAction();
    abstract void beforeSave();

    protected String getContractNumber(){
        return "";
    }

    public void save(){
        generateNumber();
        beforeSave();
        doWorkflowAction();
    }
}
