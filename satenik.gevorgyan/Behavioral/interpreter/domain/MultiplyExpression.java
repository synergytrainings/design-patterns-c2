package interpreter.domain;


public class MultiplyExpression implements Expression {
    Expression leftExpression;
    Expression rightExpresion;

    public MultiplyExpression(Expression leftExpression,
                              Expression rightExpresion) {
        this.leftExpression = leftExpression;
        this.rightExpresion = rightExpresion;
    }

    @Override
    public int interpret() {

        return leftExpression.interpret() * rightExpresion.interpret();
    }
}
