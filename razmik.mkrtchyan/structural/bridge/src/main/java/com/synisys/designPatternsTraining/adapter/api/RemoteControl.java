package main.java.com.synisys.designPatternsTraining.adapter.api;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Jun 12, 2015.
 *  
 */
public abstract class RemoteControl {

    private TV tv;

    public void on() {
        tv.on();
    }

    public void off() {
        tv.off();
    }

    public void setChannel(Integer channel) {
        tv.tuneChannel(channel);
    }
}
