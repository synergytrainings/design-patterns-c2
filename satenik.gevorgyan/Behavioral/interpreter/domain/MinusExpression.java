package interpreter.domain;


public class MinusExpression implements Expression {
    Expression leftExpression;
    Expression rightExpresion;

    public MinusExpression(Expression leftExpression,
                           Expression rightExpresion) {
        this.leftExpression = leftExpression;
        this.rightExpresion = rightExpresion;
    }

    @Override
    public int interpret() {

        return leftExpression.interpret() - rightExpresion.interpret();
    }

}
