package operatorRepository;

import java.util.ArrayList;

public class OperatorRepository {
    public ArrayList<String> unaryOperators = new ArrayList<String>() {
        {
            add("cos");
            add("sin");
            add("tan");
            add("log");

        }
    };
    public ArrayList<String> binaryOperators = new ArrayList<String>() {
        {
            add("+");
            add("*");
            add("/");
            add("%");
            add("-");

        }
    };
}
