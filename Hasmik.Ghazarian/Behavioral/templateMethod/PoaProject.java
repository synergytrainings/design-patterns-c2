package behavioral.templateMethod;

/**
 * Created by Hasmik.Ghazaryan on 4/4/2016.
 */
public class PoaProject extends Project {

    private Integer getCountOfAllPoas(){
        //Calculate POA counts with some logic
        return Integer.valueOf(5);
    }

    private String getPoaType(){
        //get POA type with some logic
        return "Permit";
    }


    @Override
    protected String getContractNumber(){
        //get Contract Number if isContractBase
        return "C/J600.A.";
    }

    private Integer getNextStateId(){
        return Integer.valueOf(66);
    }

    private void doAction(Integer nextStateId){
        // do action
    }


    @Override
    String generateNumber() {
        return getPoaType() + ".POA." + getContractNumber() + getCountOfAllPoas().toString();
    }

    @Override
    void doWorkflowAction() {
        doAction(getNextStateId());
    }

    @Override
    void beforeSave() {
        // do something else that in PGMF
    }

}
