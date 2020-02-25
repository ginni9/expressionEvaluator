package Operators;

public class Sin implements Operator{
    private double operand1;
    public Sin(double operand1)
    {
        this.operand1=operand1;
    }
    @Override
    public double getResult() {
        return Math.sin(operand1);
    }
}