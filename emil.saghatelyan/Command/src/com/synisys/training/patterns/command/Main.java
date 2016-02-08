package com.synisys.training.patterns.command;

public class Main {

    public static void main(String[] args) {
        Implementer implementer = new Implementer();

        implementer.compute(OperatorType.PLUS, 120);
        implementer.compute(OperatorType.MINUS, 40);
        implementer.compute(OperatorType.MULTIPLY, 5);
        implementer.compute(OperatorType.DIVIDE, 2);


        implementer.undo();

    }
}
