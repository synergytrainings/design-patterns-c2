import domains.Context;
import impl.EmptyValidator;
import impl.IPSyntaxValidator;
import impl.IPValidator;
import impl.RangeValidator;
import interfaces.Validator;

import java.util.Arrays;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 2/15/16 <br/>
 * <b>Time:</b> 12:21 AM <br/>
 */
public class Main {
    public static void main(String[] args) {
        String fromIP = "192.168.4.1";
        String toIP = "192.168.7.255";

        Context context = new Context("192.168.5.122");

        Validator emptyValidator = new EmptyValidator(context);
        Validator ipSyntaxValidator = new IPSyntaxValidator(context);
        Validator rangeValidator = new RangeValidator(fromIP, toIP);
        Validator ipValidator = new IPValidator(Arrays.asList(emptyValidator, ipSyntaxValidator, rangeValidator));

        System.out.println("Range From:\t" + fromIP);
        System.out.println("Range To:\t" + toIP);
        System.out.println("Context:\t" + context.getInput());
        System.out.println("Is valid:\t" + ipValidator.validate(context));
        System.out.println("------------------------------------------");
    }
}
