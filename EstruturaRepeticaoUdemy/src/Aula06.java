import java.util.Scanner;

public class Aula06 {

    public static void Declaracao (int cpf, int matricula) {
        System.out.printf("DECLARAÇÃO%nO portador do CPF %d e matrícula %d está " +
                "%ncursando graaduação na unifametro no período noturno", cpf, matricula);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("--- DECLARAÇÃO ---");

        System.out.print("Informe seu CPF: ");
        int cpf = in.nextInt();

        System.out.print("Informe sua matrícula: ");
        int matricula = in.nextInt();

        Declaracao(cpf, matricula);
    }

}
