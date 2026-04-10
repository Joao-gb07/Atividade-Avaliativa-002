import java.util.Scanner;

public class VerificarIdadeEUsuario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        
        scan.nextLine();

        System.out.println("Qual seu tipo de usuario (Profissional ou Estudande)");
        String tipoUsuario = scan.nextLine();

        if (tipoUsuario.equalsIgnoreCase("Profissional") && idade  >= 18) {
            System.out.println("Acesso permitido!");
        } else if (tipoUsuario.equalsIgnoreCase("Estudante")) {
            System.out.println("Você tem cartão válido?");
            String validacaoCartao = scan.nextLine();
        
            if (validacaoCartao.equalsIgnoreCase("Sim")) {
                System.out.println("Acesso permitido");
            }
            else {
                System.out.println("Acesso negado");
            }
        } else {
            System.out.println("Acesso negado");
        }

        scan.close();
    }
}
