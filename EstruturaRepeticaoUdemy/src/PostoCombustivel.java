import java.util.Scanner;

public class PostoCombustivel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o tipo de combustível abastecido:");
        System.out.println("1.Álcool");
        System.out.println("2.Gasolina");
        System.out.println("3.Diesel");
        System.out.println("4.fim");

        int combustivel = in.nextInt();
        int gasolina = 0, alcool = 0, diesel = 0;

        while (combustivel != 4){

                switch (combustivel){
                    case 1:
                        alcool++;
                    break;

                    case 2:
                        gasolina++;
                    break;

                    case 3:
                        diesel++;
                    break;
                }

            combustivel = in.nextInt();

        }

        System.out.printf("MUITO OBRIGADO!%nÁlcool: %d%nGasolina: %d%nDiesel: %d%n", alcool, gasolina, diesel);
    }
}
