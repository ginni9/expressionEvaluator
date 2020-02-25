package evaluation;


import conversion.Node;

import static java.lang.System.exit;

public class ExpressionTreeTraversal {
    IntermediaryResult intermediaryResult=new IntermediaryResult();
    public double getResult(Node root) {

        if (root == null)
            return 0;

        if (root.left == null && root.right == null) {
            double value = Double.parseDouble(root.value);
            return value;
        }


        double operand1 = getResult(root.left);
        double operand2 = getResult(root.right);

        return intermediaryResult.getIntermediaryResult(root.value,operand1,operand2);

    }
}
