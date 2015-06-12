import main.java.com.synisys.designPatternsTraining.adapter.impl.Sony;

/**
 * Created by Razmik on 6/4/2015.
 */
public class BridgeTester {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sony sony = new Sony();
        sony.on();
        sony.tuneChannel(1);
        sony.off();
    }
}
