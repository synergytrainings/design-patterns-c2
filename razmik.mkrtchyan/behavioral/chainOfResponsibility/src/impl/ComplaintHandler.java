package impl;

import api.AbstractCommentHandler;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Feb 01, 2016.
 *  
 */
public class ComplaintHandler extends AbstractCommentHandler {
    @Override
    public void handleRequest(String request) {
        if (commentAnalyzer.getType(request) == CommentType.COMPLAINT) {
            System.out.println("complaint comment");
        } else {
            successor.handleRequest(request);
        }

    }

}
