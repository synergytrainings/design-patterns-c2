package api;

import impl.CommentAnalyzer;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Feb 01, 2016.
 *  
 */
public abstract class AbstractCommentHandler {
    protected CommentAnalyzer commentAnalyzer = new CommentAnalyzer();
    protected AbstractCommentHandler successor;

    public abstract void handleRequest(String request);

    public void setSuccessor(AbstractCommentHandler successor) {
        this.successor = successor;
    }
}
