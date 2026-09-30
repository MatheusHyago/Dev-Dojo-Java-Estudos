package academy.devdojo.maratonajava.ChainOfResponsibility.middlewares;

public abstract class Middlewares {

    private Middlewares next;
    public Middlewares linkWith(Middlewares next){
        this.next = next;
        return next;
    }

    public abstract boolean check (String email, String password);

    protected boolean checkNext(String email, String passoword){
        if(next == null){
            return true;
        }
        return next.check(email, passoword);
    }
}
