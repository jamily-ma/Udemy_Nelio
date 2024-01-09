import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int o = 0, en = 0, n;

        for (int i = 0; i < x; i++){
            n = in.nextInt();
            
            if (n >= 10 && n <= 20){
                en++;
            } else {
                o++;
            }
        }

        System.out.printf("IN: %d%nout: %d%n", en, o);
    }
}
