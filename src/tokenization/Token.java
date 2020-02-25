package tokenization;


import ExceptionHandler.InvalidOperator;
import ExceptionHandler.Numbers;
import operatorRepository.OperatorRepository;
import operatorValidation.IsOperator;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.exit;

public class Token {
    ArrayList<String> tokenList = new ArrayList<String>();
    String word ="";
    Numbers numbers=new Numbers();
    IsOperator isOperator=new IsOperator();
    OperatorRepository operatorRepository=new OperatorRepository();
    boolean negativeOperand =false;
    int f=0,f1=0;


    public List<String> createTokens(String s)
    {

        for (int i = 0; i < s.length(); i++)
        {
            if(!Character.isDigit(s.charAt(s.length()-1)) && s.charAt(s.length()-1)!=')')
            {
                System.out.println("Invalid Expression!");
                exit(0);
            }
            else if (Character.isLetter(s.charAt(i)) || (s.charAt(i)=='-' && Character.isLetter(s.charAt(i+1)))) {
                if(s.charAt(i)=='-' )
                {

                    if (s.indexOf('-') == 0 && Character.isLetter(s.charAt(i + 1))) {

                        tokenList.add("-1");
                        tokenList.add("*");


                    } else if (Character.isLetter(s.charAt(i + 1)) && operatorRepository.binaryOperators.contains(String.valueOf(s.charAt(i - 1)))) {
                        tokenList.add("-1");
                        tokenList.add("*");


                    } else if (s.indexOf('-') != 0 && !Character.isDigit(s.charAt(i - 1)) && !Character.isLetter(s.charAt(i - 1))) {
                        tokenList.add("-1");
                        tokenList.add("*");


                    }
                }

                while (Character.isLetter(s.charAt(i)))
                {
                    f=1;
                    word += s.charAt(i);
                    i++;
                    if (i >= s.length())
                        break;
                }
                if(f==1)
                    i--;
                try {
                    if (word.length() != 0 && !isOperator.isOperator(word))
                        throw new InvalidOperator("Invalid Operator Used!");
                }
                catch (InvalidOperator e)
                {
                    System.out.println(e.getMessage());
                    exit(0);
                }
            }
            else if(i>0 &&  s.charAt(i)=='-'&& Character.isDigit(s.charAt(i-1) )&& Character.isDigit(s.charAt(i+1)))
            {
                word = String.valueOf(s.charAt(i));
                try {
                    if (!isOperator.isOperator(word))
                        throw new InvalidOperator("Invalid Operator Used!");
                }
                catch(InvalidOperator e)
                {
                    System.out.println(e.getMessage());
                    exit(0);
                }
            }
            else if (Character.isDigit(s.charAt(i)) || s.charAt(i) == '.' || (s.charAt(i)=='-' && Character.isDigit(s.charAt(i+1))))
            {
                if(s.charAt(i)=='-' ) {
                    if(s.indexOf('-')==0  && Character.isDigit(s.charAt(i + 1))) {
                        negativeOperand =true;
                        i++;

                    }
                    else if (Character.isDigit(s.charAt(i + 1))&&operatorRepository.binaryOperators.contains(String.valueOf(s.charAt(i - 1))))
                    {
                        negativeOperand = true;
                        i++;

                    }
                    else if(s.indexOf('-')!=0 && !Character.isDigit(s.charAt(i -1))) {
                        negativeOperand =true;
                        i++;
                    }
                    }
                while (Character.isDigit(s.charAt(i)) || s.charAt(i) == '.')
                {
                    f1=1;
                    word += s.charAt(i);
                    i++;
                    if (i >= s.length())
                        break;
                }
                if(f1!=0)
                i--;
                if(negativeOperand)
                {
                    word = "-" + word;
                }
                if(word.length()!=0 && !numbers.isNumber(word));

            }

            else if(s.charAt(i)=='('||s.charAt(i)==')') {
                word = String.valueOf(s.charAt(i));
            }


            else
                {
                    word = String.valueOf(s.charAt(i));
                    try {
                        if (!isOperator.isOperator(word))
                            throw new InvalidOperator("Invalid Operator Used!");
                    }
                    catch(InvalidOperator e)
                    {
                        System.out.println(e.getMessage());
                        exit(0);
                    }
            }

            if(word.length()!=0)
            tokenList.add(word);
            word="";
            f=0;
            f1=0;
            negativeOperand=false;

        }

        return tokenList;
    }
}
