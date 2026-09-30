package academy.devdojo.maratonajava.ChainOfResponsibility.server;

import academy.devdojo.maratonajava.ChainOfResponsibility.middlewares.Middlewares;

import java.util.HashMap;
import java.util.Map;

public class Server {
    private Map<String, String> usersMap = new HashMap<>();
    private Middlewares middleware;

    public void setMiddleware(Middlewares middleware){
        this.middleware = middleware;
    }

    public boolean login(String email, String password){
        if(middleware.check(email, password)){
            System.out.println("Usuario Autenticado");
            return true;
        }
        return false;
    }

    public void registerUser(String email, String password){
        usersMap.put(email, password);
    }

    public boolean hasEmail(String email){
        return usersMap.containsKey(email);
    }

    public boolean isValidPassword(String email, String password){
        return usersMap.get(email).equalsIgnoreCase(password);
    }

}
