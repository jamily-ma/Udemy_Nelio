import java.util.Scanner;

public class Aula04 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int fat = 1;
        for (int i = 1; i <= n; i++){

            fat *= i;

        }

        System.out.println(fat);
    }
}
