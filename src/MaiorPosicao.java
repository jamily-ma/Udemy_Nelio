import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double maior = 0;
        int indice = 0;

        System.out.print("Quantos números você vai digitar? ");
        int n = in.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i ++){

            System.out.print("Digite um número: ");
            vect[i] = in.nextDouble();

        }

        for (int i = 0; i < vect.length; i++){

            if (vect[i] > maior){

                maior = vect[i];
                indice = i;

            }

        }

        System.out.printf("MAIOR VALOR = %.2f%n", maior);

        System.out.printf("POSIÇÃO DO MAIOR VALOR = %d", indice);
    }

}
