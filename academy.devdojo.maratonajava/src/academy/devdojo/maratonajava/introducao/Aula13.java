package academy.devdojo.maratonajava.introducao;

public class Aula13 {
    public static void main(String[] args) {
        //while, do while, for
        int c = 0;

        if (c <= 1)

            //valida e acrescenta 2
            for (c = 1; c < 10; c += 2) {
                System.out.println(c);
            }
        for (c = 0; c < 10; c += 2) {
            System.out.println(c);
        }
        // ex for com  if
        for (c = 0; c <= 10; c++) {
            if (c % 2 == 0) {
                System.out.println(c);
                break;
            }

        }
    }
}


