package interpreter.domain;


public class NumberExpression implements Expression {
    int number;

    public NumberExpression(int i) {
        number = i;
    }

    public NumberExpression(String s) {
        number = Integer.parseInt(s);
    }

    @Override
    public int interpret() {
        return number;
    }
}
