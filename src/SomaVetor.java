import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = in.nextInt();

        double soma = 0;
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = in.nextInt();
        }


        System.out.print("VALORES = ");

        for (int i = 0; i < vect.length; i++){
            System.out.printf("%.2f ",vect[i]);
            soma += vect[i];
        }

        double media = soma/ vect.length;

        System.out.printf("%nSOMA = %.2f%n", soma);
        System.out.printf("MÉDIA = %.2f%n", media);
    }

}
