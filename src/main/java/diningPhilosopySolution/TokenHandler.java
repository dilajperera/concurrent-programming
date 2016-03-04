package diningPhilosopySolution;

import java.util.LinkedList;
import java.util.List;

public class TokenHandler {

    private int numOfTokens;
    private List<Token> tokens;

    public TokenHandler(int numOfTokens) {
       this.tokens = new LinkedList<>();
       for(int i = 0 ; i < numOfTokens; i++){
           tokens.add(new Token("_id_"+i));
       }
    }

    public synchronized Token acquireToken(){
        return !tokens.isEmpty() ? tokens.remove(0) : null;
    }

    public synchronized void releaseToken(Token token){
        tokens.add(token);
    }

    public int getNumOfTokens() {
        return numOfTokens;
    }

    public void setNumOfTokens(int numOfTokens) {
        this.numOfTokens = numOfTokens;
    }

}
