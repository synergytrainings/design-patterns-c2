package behavioral.templateMethod;

/**
 * Created by Hasmik.Ghazaryan on 4/4/2016.
 */
public class PgmfProject extends Project {

    private Boolean isApproved;

    private Integer getCountOfAllPgmfs(){
        //Calculate PGMF counts with some logic
        return Integer.valueOf(11);
    }

    private String getPgmfType(){
        //get POA type with some logic
        return "Administrative";
    }

    private Integer getNextStateId(){
        return Integer.valueOf(108);
    }

    private void doAction(Integer nextStateId){
        // do action
    }


    @Override
    String generateNumber() {
        return getPgmfType() + ".PGMF." + getContractNumber() + getCountOfAllPgmfs().toString();
    }

    @Override
    void doWorkflowAction() {
        doAction(getNextStateId());
    }

    @Override
    void beforeSave() {
        if(isApproved){
            //do something
        }
    }

}
