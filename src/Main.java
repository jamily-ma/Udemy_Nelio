import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = in.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = in.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS:");

        for (int i = 0; i < vect.length; i++){
            if (vect[i] < 0){
                System.out.println(vect[i]);
            }
        }

    }
}