package impl;

import api.AbstractCommentHandler;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Feb 01, 2016.
 *  
 */
public class NewLookHandler extends AbstractCommentHandler {
    @Override
    public void handleRequest(String request) {
        if (commentAnalyzer.getType(request) == CommentType.NEW_LOOK) {
            System.out.println("new look comment");
        } else {
            successor.handleRequest(request);
        }
    }
}
