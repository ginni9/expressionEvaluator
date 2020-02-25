package evaluation;

import Operators.*;

import static java.lang.System.exit;

public class IntermediaryResult {
    Operator operator;
    public double getIntermediaryResult(String op, double operand1, double operand2)
    {
        if (op.equals("+"))
        {
           operator=new Add(operand1,operand2);
            return operator.getResult();

        }
        else if (op.equals("-"))
        {
            operator=new Subtract(operand1,operand2);
            return operator.getResult();
        }

       else if (op.equals("*"))
        {
            operator=new Multiply(operand1,operand2);
            return operator.getResult();
        }

        else if (op.equals("/"))
        {
            operator=new Divide(operand1,operand2);
            return operator.getResult();

        }

        else if (op.equals("sin"))
        {
            operator= new Sin(operand2);
            return operator.getResult();
        }

        else if (op.equals("cos"))
        {
            operator=new Cos(operand2);
            return operator.getResult();
        }

        else if (op.equals("tan"))
        {
           operator= new Tan(operand2);
            return operator.getResult();
        }

        else if (op.equals("log"))
        {
            operator= new Log(operand2);
            return operator.getResult();
        }

        return 0;
    }
}