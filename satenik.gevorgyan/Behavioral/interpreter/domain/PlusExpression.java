package interpreter.domain;


public class PlusExpression implements Expression {
    Expression leftExpression;
    Expression rightExpresion;

    public PlusExpression(Expression leftExpression, Expression rightExpresion) {
        this.leftExpression = leftExpression;
        this.rightExpresion = rightExpresion;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() + rightExpresion.interpret();
    }
}
