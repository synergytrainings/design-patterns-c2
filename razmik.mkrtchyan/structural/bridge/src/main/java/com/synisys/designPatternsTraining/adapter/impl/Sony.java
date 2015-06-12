package main.java.com.synisys.designPatternsTraining.adapter.impl;

        import main.java.com.synisys.designPatternsTraining.adapter.api.TV;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Jun 12, 2015.
 *  
 */
public class Sony extends TV {


    @Override
    public void on() {
        System.out.println("On TV");
    }

    @Override
    public void off() {
        System.out.println("Off TV");
    }

    @Override
    public void tuneChannel(Integer channel) {
        System.out.println("Channel " + channel);
    }
}
