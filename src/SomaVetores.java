import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = in.nextInt();

        int[] vectA = new int[n];
        int[] vectB = new int[n];
        int[] vectC = new int[n];

        System.out.println("Digite os valores do vetor A: ");

        for (int i = 0; i < vectA.length; i++) {

            vectA[i] = in.nextInt();

        }

        System.out.println("Digite os valores do vetor B: ");

        for (int i = 0; i < vectB.length; i++) {

            vectB[i] = in.nextInt();

        }

        System.out.println("VETOR RESULTANTE : ");

        for (int i = 0; i < vectC.length; i++) {

            vectC[i] = vectA[i] + vectB[i];
            System.out.println(vectC[i]);

        }


    }
}
