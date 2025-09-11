package academy.devdojo.maratonajava.javacore.Kenum.model;

/**
 * Strategy - Enum - enumeração
 * */
public enum TipoPagamento{
    // sobreposição de metodo calculaDesconto
    //comportamento diferente para cada constante ou enum DEbito e credito
        DEBITO{
            @Override
            public double calculaDesconto(double valor) {
                return  valor * 0.1;
            }
        }, CREDITO{
            @Override
            public double calculaDesconto(double valor) {
                return valor * 0.05;
            }
        };


    //metodo sem comportamento pois e abstrato
    //o que existe é a implementacao dentro das denominacoes
    //criado so pra ser sobreposto sobreescrito
    public abstract double calculaDesconto(double valor);
    }


