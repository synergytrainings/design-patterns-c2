/**
 * Created by Luiza.Karapetyan on 2/15/2016.
 */
public class IntToHexExpression implements Expression {

    private int i;

    public IntToHexExpression(int c){
        this.i=c;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getHexadecimalFormat(i);
    }

}
