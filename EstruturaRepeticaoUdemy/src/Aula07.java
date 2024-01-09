import java.util.Scanner;

public class Aula07 {
    public static double Salario (double salarioAtual, double percentual) {

        return (salarioAtual * (percentual/100)) + salarioAtual;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("--- SALÁRIO ---");

        System.out.print("Informe seu sálario: ");
        double salario = in.nextDouble();

        System.out.print("Informe seu percentual de aumento: ");
        int percentual = in.nextInt();

        double diferenca = Salario(salario, percentual) - salario;

        System.out.printf("SALÁRIO: R$%.2f%nDIFERENÇA: R$%.2f%n", Salario(salario, percentual), diferenca);
    }
}
