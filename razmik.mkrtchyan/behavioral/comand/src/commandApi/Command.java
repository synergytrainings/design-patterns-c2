package commandApi;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Feb 04, 2016.
 *  
 */
public interface Command {
    void execute();

    void undo();
}
