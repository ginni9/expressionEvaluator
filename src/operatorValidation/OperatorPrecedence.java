package operatorValidation;

public class OperatorPrecedence {
    public int getPrecedence(String operator){
        if(operator.equals("+")|| operator.equals("-"))
            return 1;
        else if(operator.equals("*" )|| operator.equals("/")||operator.equals("%"))
            return 2;
        else if(operator.equals("sin")||operator.equals("cos")||operator.equals("tan")||operator.equals("log"))
            return 3;
        else return -1;
    }
}
