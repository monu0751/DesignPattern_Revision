package MachineCoding.Parking.Repository;

import MachineCoding.Parking.Exceptions.TokenNotFoundException;
import MachineCoding.Parking.Models.Token;

import java.util.HashMap;

public class TokenRepository {
    private HashMap<Integer, Token> tokenHashMap;

    public HashMap<Integer, Token> getTokenHashMap() {
        return tokenHashMap;
    }

    public TokenRepository() {
        this.tokenHashMap = new HashMap<>();
    }

    public Token get(int id) throws TokenNotFoundException {
        Token token = tokenHashMap.get(id);
        if(token==null){
            throw new TokenNotFoundException("Foor "+id+" not found.");
        }
        return token;
    }

    public Token put(Token token){
        tokenHashMap.put(token.getId(),token);
        return token;
    }
}
