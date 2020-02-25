package master;
import conversion.ConversionHandler;
import conversion.Node;
import evaluation.EvaluationHandler;
import tokenization.TokenHandler;
import evaluation.ExpressionTreeTraversal;


import java.util.List;
import java.util.Scanner;



public class Master {
    public static void main(String args[]) {
        TokenHandler token = new TokenHandler();
        ConversionHandler conversionHandler=new ConversionHandler();
        EvaluationHandler evaluationHandler=new EvaluationHandler();


        Scanner ob = new Scanner(System.in); //input
        String expression = ob.next();

        List<String> tokens = token.getTokenList(expression);
        Node root = conversionHandler.getExpressionTree(tokens);
        double result=evaluationHandler.fetchResult(root);

        System.out.println(result);


    }
}

