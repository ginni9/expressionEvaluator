package conversion;

import tokenization.Token;

import java.util.List;

public class ConversionHandler {
    PostfixController postfixController=new PostfixController();
    ExpressionTreeController expressionTreeController=new ExpressionTreeController();
    public Node getExpressionTree(List<String> tokenList)
    {
        List<String>postfixList=postfixController.getPostFixNotation(tokenList);
        Node root=expressionTreeController.constructTree(postfixList);
        return root;

    }

}
