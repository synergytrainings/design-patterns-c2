package impl;

import domains.Context;
import interfaces.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 2/15/16 <br/>
 * <b>Time:</b> 9:51 PM <br/>
 */
public class IPSyntaxValidator implements Validator {
    Context context;

    public IPSyntaxValidator(Context context) {
        this.context = context;
    }

    @Override
    public boolean validate(Context context) {
        System.out.println("IPSyntaxValidator::validate()");
        String regex = "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
        return Pattern.compile(regex).matcher(context.getInput()).matches();
    }
}
