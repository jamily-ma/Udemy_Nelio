import java.util.Scanner;

public class Aula03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        double media = 0, a, b, c;;
        for (int i = 0; i < n; i++){
            a = in.nextDouble();
            b = in.nextDouble();
            c = in.nextDouble();


            media = ((a*2) + (b*3) + (c*5))/10;

            System.out.printf("%.1f",media);

        }
    }
}
