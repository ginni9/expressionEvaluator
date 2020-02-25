package Operators;

public class Multiply implements Operator{
    private double result;
    private double operand1;
    private double operand2;

    public Multiply(double l_val, double r_val) {
        this.operand1=l_val;
        this.operand2=r_val;
    }

    @Override
    public double getResult() {

        result=operand1*operand2;
        return result;
    }
}