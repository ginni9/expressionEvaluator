package Operators;

public class Log implements Operator{
    private double operand1;
    public Log(double operand1)
    {
        this.operand1=operand1;
    }
    @Override
    public double getResult() {
        return Math.log(operand1); //uses loge(val)
    }
}
