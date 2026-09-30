package academy.devdojo.maratonajava.ChainOfResponsibility.middlewares;

import academy.devdojo.maratonajava.ChainOfResponsibility.server.Server;

public class CheckUserMiddleware extends Middlewares {
    private Server server;

    public CheckUserMiddleware(Server server){
        this.server = server;
    }



    @Override
    public boolean check(String email, String password) {

        if(!server.hasEmail((email))){
            System.out.println("email invalido");
            return false;
        }
        if(!server.isValidPassword(email, password)){
            System.out.println("email ou senha invalidos");
            return false;
        }
        return checkNext(email, password);
    }
}
