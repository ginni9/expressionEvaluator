package operatorValidation;

import operatorRepository.OperatorRepository;

public class OperatorType{
    OperatorRepository op=new OperatorRepository();
    public String getOperatorType(String operator)
    {
        if(op.unaryOperators.contains(operator))
            return "unaryOperator";
        else if(op.binaryOperators.contains(operator))
            return "binaryOperator";
        else
            return "false";                         //throw exception
    }
}
