package tokenization;

import java.util.ArrayList;
import java.util.List;

public class TokenHandler {
    Token token=new Token();
    public List<String> getTokenList(String expression)
    {
        List<String> tokenList=token.createTokens(expression);
        return tokenList;
    }
}
