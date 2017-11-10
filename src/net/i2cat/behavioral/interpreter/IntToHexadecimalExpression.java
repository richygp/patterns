package net.i2cat.behavioral.interpreter;

public class IntToHexadecimalExpression implements Expression {

    private int i;

    public IntToHexadecimalExpression(int i) {
        this.i = i;
    }

    @Override
    public String interpret(InterpreterContext interpreterContext) {
        return interpreterContext.getHexadecimalFormat(this.i);
    }
}
