import domains.Context;
import impl.ShowExpression;
import interfaces.Expression;

import java.util.Arrays;
import java.util.List;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 2/15/16 <br/>
 * <b>Time:</b> 12:21 AM <br/>
 */
public class Main {
    public static void main(String[] args) {
        List<Context> contexts = Arrays.asList(new Context("show date"), new Context("print blah"));

        for (Context context : contexts) {
            Expression expression = null;
            if (context.getInput().contains("show")) {
                context.setInput(context.getInput().substring(4).trim());
                expression = new ShowExpression(context);
            } else if (context.getInput().contains("print")) {
                context.setInput(context.getInput().substring(5).trim());
                expression = new ShowExpression(context);
            }
            if (expression != null) {
                expression.interpret();
            }
        }

    }
}
