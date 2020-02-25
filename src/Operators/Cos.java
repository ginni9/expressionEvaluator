package Operators;

public class Cos implements Operator{
   private double operand1;
   public Cos(double operand1)
   {
       this.operand1=operand1;
   }
    @Override
    public double getResult() {
        return Math.cos(operand1);
    }
}
