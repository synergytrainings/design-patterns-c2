package memento;


public class ApplicationForm {
    private WFState state;
    private boolean valid;

    public void setState(WFState state){
        this.state = state;
    }

    public WFState getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getRestoreMemento(Memento Memento){
        state = Memento.getState();
    }

    public boolean getIsValid() {
        return valid;
    }

    public void setIsValid(boolean valid) {
        this.valid = valid;
    }
}
