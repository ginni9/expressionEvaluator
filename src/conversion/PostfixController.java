package conversion;

import operatorRepository.OperatorRepository;
import operatorValidation.OperatorPrecedence;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostfixController {
    OperatorPrecedence precedence=new OperatorPrecedence();
    OperatorRepository op=new OperatorRepository();
    List<String> getPostFixNotation(List<String> s){
        Stack<String> stack = new Stack<String>();
        List<String> postFixList = new ArrayList<>();

        for(int i=0;i<s.size();i++)
        {
            String word = s.get(i);

            if(word.equals("("))
            {
                stack.push(word);
            }
            else if(word.equals(")"))
            {
                while(!stack.isEmpty()){
                    if(stack.peek().equals("(")){
                        stack.pop();
                        break;
                    }else{

                        postFixList.add(stack.pop()+"");
                    }
                }
            }
            else if(op.unaryOperators.contains(word)||op.binaryOperators.contains(word))
            {
                if(stack.isEmpty())
                    stack.push(word);
                else
                {
                    while (!stack.isEmpty() && precedence.getPrecedence(stack.peek()) >= precedence.getPrecedence(word))
                    {
                        postFixList.add(stack.pop() + "");
                    }
                    stack.push(word);
                }

            }
            else
            {

                postFixList.add(word+"");

            }
        }
        while(!stack.isEmpty())
        {
            postFixList.add(stack.pop()+"");
        }
        return postFixList;
    }

}
