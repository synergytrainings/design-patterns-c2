package memento;


public class MementoPatternDemo {

    public static void main(String[] args) {

        ApplicationForm applicationForm = new ApplicationForm();
        RestoreAppFormState restoreAppFormState = new RestoreAppFormState();

        applicationForm.setState(WFState.DRAFT);
        System.out.println("Application WF status set to : " + applicationForm.getState().getStateName());
        applicationForm.setIsValid(true);
        if(applicationForm.getIsValid()) {
            applicationForm.setState(WFState.SUBMITTED);
            System.out.println("Application WF status set to : " + applicationForm.getState().getStateName());
        }
        restoreAppFormState.add(applicationForm.saveStateToMemento());
        applicationForm.setIsValid(false);
        if(!applicationForm.getIsValid()) {
            applicationForm.setState(WFState.REJECTED);
            System.out.println("Application WF status set to : " + applicationForm.getState().getStateName());
            restoreAppFormState.add(applicationForm.saveStateToMemento());
        }

        applicationForm.setIsValid(true);

        if(applicationForm.getIsValid()) {
            applicationForm.getRestoreMemento(restoreAppFormState.restoreMementoByState(WFState.SUBMITTED));
            System.out.println("Application WF status restored to : " + applicationForm.getState().getStateName());
        }
    }
}
