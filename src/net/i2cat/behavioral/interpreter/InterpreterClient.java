package net.i2cat.behavioral.interpreter;

public class InterpreterClient {

    public InterpreterContext ic;

    public InterpreterClient(InterpreterContext i) {
        this.ic = i;
    }
    public String interpret(String str) {
        Expression exp;
        if(str.contains("Hexadecimal")) {
            exp = new IntToHexadecimalExpression(Integer.parseInt(str.substring(0,str.indexOf(" "))));
        } else if(str.contains("Binary")) {
            exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0,str.indexOf(" "))));
        } else return str;
        return exp.interpret(ic);
    }

    public static void main(String[] args) {
        String str1 = "28 in Binary";
        String str2 = "90 in Hexadecimal";
        String str3 = "456";

        InterpreterClient ic = new InterpreterClient(new InterpreterContext());
        System.out.println(str1 + "= " + ic.interpret(str1));
        System.out.println(str2 + "= " + ic.interpret(str2));
        System.out.println(str3 + "= " + ic.interpret(str3));
    }
}
