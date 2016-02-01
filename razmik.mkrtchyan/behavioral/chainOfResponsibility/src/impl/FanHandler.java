package impl;

import api.AbstractCommentHandler;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Feb 01, 2016.
 *  
 */
public class FanHandler extends AbstractCommentHandler {
    @Override
    public void handleRequest(String request) {
        if (commentAnalyzer.getType(request) == CommentType.FAN) {
            System.out.println("fan's comment");
        } else {
            successor.handleRequest(request);
        }
    }
}
