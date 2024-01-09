import java.util.Scanner;

public class AbaixoMedia {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double media = 0;
        int acum = 0;

        System.out.print("Quantos números você vai digitar? ");
        int n = in.nextInt();

        int[] vect = new int[n];


        for (int i = 0; i < vect.length; i++) {

            System.out.print("Digite um número: ");
            vect[i] = in.nextInt();

        }

        for (int i = 0; i < vect.length; i++) {

            if (vect[i] % 2 == 0){

                acum ++;
                media += vect[i];

            }
        }

        if (acum != 0){

            media = media / acum;
            System.out.printf("MÉDIA DOS PARES = %.2f", media);

        } else {

            System.out.println("NENHUM NÚMERO PAR ENCONTRADO");

        }
    }
}
