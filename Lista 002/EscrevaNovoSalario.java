import java.util.Scanner;

public class EscrevaNovoSalario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu salário base :");
        float salarioBase = scan.nextFloat();

        System.out.println("Tem plano de saúde");
        boolean temPlanoSaude = scan.nextBoolean();

        float novoSalario = 0;
        if (salarioBase < 2000 && temPlanoSaude == false) {
            novoSalario = salarioBase * 1.20F;
        }
        else {
            novoSalario = salarioBase * 1.10F;
        }
        System.out.println(String.format("Novo salário R$ %.2f" ,  novoSalario));
    }
}
