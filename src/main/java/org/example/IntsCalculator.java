package org.example;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @java.lang.Override
    public int sum(int arg0, int arg1) {
        return (int) target.newFormula().addOperand(arg0).
                addOperand(arg1).calculate(Calculator.Operation.SUM).result();
    }

    @java.lang.Override
    public int mult(int arg0, int arg1) {
        return (int) target.newFormula().addOperand(arg0).
                addOperand(arg1).calculate(Calculator.Operation.MULT).result();
    }

    @java.lang.Override
    public int pow(int a, int b) {
        return (int) target.newFormula().addOperand(a).
                addOperand(b).calculate(Calculator.Operation.POW).result();
    }
}
