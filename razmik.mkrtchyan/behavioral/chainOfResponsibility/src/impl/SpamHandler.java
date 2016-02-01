package impl;

import api.AbstractCommentHandler;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Feb 01, 2016.
 *  
 */
public class SpamHandler extends AbstractCommentHandler {
    @Override
    public void handleRequest(String request) {
        if (commentAnalyzer.getType(request) == CommentType.SPAM) {
            System.out.println("spam comment");
        } else {
            successor.handleRequest(request);
        }
    }
}
