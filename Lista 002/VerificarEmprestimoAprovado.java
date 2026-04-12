import java.util.Scanner;

public class VerificarEmprestimoAprovado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua renda mensal: ");
        float rendaMensal = scan.nextFloat();

        scan.nextLine();

        System.out.println("Como está seu histórico de crédito? (Bom ou Ruim)");
        String historicoCredito = scan.nextLine();

        if (rendaMensal > 3000 && historicoCredito.equalsIgnoreCase("Bom")) {
            System.out.println("Empréstimo Aprovado!");
        
        } else if (rendaMensal >= 2000 && rendaMensal <= 3000) {
            System.out.println("Você possui um fiador? ");
            String fiador = scan.nextLine();
        
         if (fiador.equalsIgnoreCase("Sim")) {
            System.out.println("Empréstimo Aprovado!");
         }
         else {
            System.out.println("Empréstimo Negado");
         }

        } else {
            System.out.println("Empréstimo Negado");
        }
        
        scan.close();
    }
}
