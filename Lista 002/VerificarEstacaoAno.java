import java.util.Scanner;

public class VerificarEstacaoAno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um mês do ano ");
        String mesDoAno = scan.nextLine();

        if (mesDoAno.equalsIgnoreCase("Junho") || mesDoAno.equalsIgnoreCase("Julho") || mesDoAno.equalsIgnoreCase("Agosto")) {
            System.out.println("É Inverno.");
        }
        else if (mesDoAno.equalsIgnoreCase("Setembro") || mesDoAno.equalsIgnoreCase("Outubro") || mesDoAno.equalsIgnoreCase("Novembro")) {
            System.out.println("É Primavera");
        }
        else if (mesDoAno.equalsIgnoreCase("Março") || mesDoAno.equalsIgnoreCase("Abril") || mesDoAno.equalsIgnoreCase("Maio")) {
            System.out.println("É Outono");
        }
        else if (mesDoAno.equalsIgnoreCase("Dezembro") || mesDoAno.equalsIgnoreCase("Janeiro") || mesDoAno.equalsIgnoreCase("Fevereiro")) {
            System.out.println("É Verão");
        }
        else {
            System.out.println("Erro! Mês digitado inválido");
        }
        scan.close();
    }
}
