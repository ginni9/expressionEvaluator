package operatorValidation;

import operatorRepository.OperatorRepository;

public class IsOperator{
    OperatorRepository op=new OperatorRepository();
    public boolean isOperator(String operator)
    {
        if(op.unaryOperators.contains(operator)||op.binaryOperators.contains(operator))
            return true;
        else
            return false;
    }
}
