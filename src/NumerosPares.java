import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int acum = 0;

        System.out.print("Quantos números você vai digitar? ");
        int n = in.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i ++){

            System.out.print("Digite um número: ");
            vect[i] = in.nextInt();

        }

        System.out.print("NÚMEROS PARES: ");

        for (int i = 0; i < vect.length; i++){

            if (vect[i]%2 == 0){

                System.out.print(" " + vect[i]);
                acum += 1;

            }
        }

        System.out.printf("%nQUANTIDADE DE PARES =  %d", acum);
    }
}
