import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe a senha:");
        int password = in.nextInt();

        while (password != 2001) {
            System.out.println("Senha inválida");
            System.out.print("Informe a senha:");
            password = in.nextInt();

        }

        System.out.println("Acesso permitido");
    }
}