package memento;

/**
 * Created by Hasmik.Ghazaryan on 3/10/2016.
 */
public class MementoDemo {

    public static void main(String[] args) {
        Originator<String> originator = new Originator<>();
        Caretaker<String> caretaker = new Caretaker();

        originator.setState("state0");
        caretaker.saveState(originator); //save state of the originator
        originator.showState();

        originator.setState("state1");
        caretaker.saveState(originator); //save state of the originator
        originator.showState();

        originator.setState("state2");
        caretaker.saveState(originator); //save state of the originator
        originator.showState();

        //restore state of the originator
        caretaker.restoreState(originator, 0);
        originator.showState();  //shows state0
    }
}
