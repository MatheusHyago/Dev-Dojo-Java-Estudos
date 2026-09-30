package academy.devdojo.maratonajava.ChainOfResponsibility.middlewares;

public class CheckPermissionMiddleware extends Middlewares {

    @Override
    public boolean check(String email, String password) {
        if(email.equals("master@selfbooking.com.br")){
            System.out.println("boa");
            return true;
        }

        System.out.println("Bem vindo");
        return checkNext(email, password);
    }
}
