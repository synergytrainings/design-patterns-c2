package memento;


public enum WFState {
    DRAFT("Draft"),
    SUBMITTED("Submitted"),
    APPROVED("Approved"),
    COMPLETED("Completed"),
    REJECTED("Rejected"),
    CLOSED("Closed");

    private String stateName;

    WFState(String label){
        this.stateName = label;
    }

    public String getStateName() {
        return stateName;
    }

}
