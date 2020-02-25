package evaluation;


import conversion.Node;

public class EvaluationHandler {
    ExpressionTreeTraversal expressionTreeTraversal=new ExpressionTreeTraversal();
    public double fetchResult(Node root)
    {
        double result=expressionTreeTraversal.getResult(root);
        return result;
    }

}
