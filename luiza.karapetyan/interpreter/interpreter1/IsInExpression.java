package com.synisys.de.rwandaIngo.interpreter1;

/**
 * Created by Luiza.Karapetyan on 2/25/2016.
 */
class IsInExpression implements Expression {
    private String data;

    public IsInExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean evaluate(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}

