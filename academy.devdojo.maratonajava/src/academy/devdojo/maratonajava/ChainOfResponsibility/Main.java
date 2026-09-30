package academy.devdojo.maratonajava.ChainOfResponsibility;

import academy.devdojo.maratonajava.ChainOfResponsibility.middlewares.CheckPermissionMiddleware;
import academy.devdojo.maratonajava.ChainOfResponsibility.middlewares.CheckUserMiddleware;
import academy.devdojo.maratonajava.ChainOfResponsibility.middlewares.Middlewares;
import academy.devdojo.maratonajava.ChainOfResponsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;
    public static void init(){
        server = new Server();
        server.registerUser("master@selfbooking.com.br", "123");
        server.registerUser("master2@selfbooking.com.br", "12355");

        Middlewares middlewares = new CheckUserMiddleware(server);
        middlewares.linkWith(new CheckPermissionMiddleware());

        server.setMiddleware(middlewares);
    }

    public static void main(String[] args) throws IOException {
        init();
        boolean done;

        do{
            System.out.println("input seu email");
            String email = reader.readLine();
            System.out.println("input sua senha");
            String senha = reader.readLine();
            done = server.login(email, senha);
        } while (!done);
    }

}
