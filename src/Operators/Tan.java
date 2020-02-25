package Operators;

public class Tan implements Operator{
    private double operand1;
    public Tan(double operand1)
    {
        this.operand1=operand1;
    }
    @Override
    public double getResult() {
        return Math.tan(operand1);
    }
}