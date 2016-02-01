import api.AbstractCommentHandler;
import impl.ComplaintHandler;
import impl.FanHandler;
import impl.NewLookHandler;
import impl.SpamHandler;

public class Main {

    public static void main(String[] args) {
        String comment = "spam";
        AbstractCommentHandler abstractCommentHandler = createChain();
        abstractCommentHandler.handleRequest(comment);

    }

    private static AbstractCommentHandler createChain() {
        AbstractCommentHandler spamHandler = new SpamHandler();
        AbstractCommentHandler commentHandler = new ComplaintHandler();
        AbstractCommentHandler fanHandler = new FanHandler();
        AbstractCommentHandler newLookHandler = new NewLookHandler();
        spamHandler.setSuccessor(commentHandler);
        commentHandler.setSuccessor(fanHandler);
        fanHandler.setSuccessor(newLookHandler);
        return spamHandler;
    }
}
