import java.util.Scanner;

public class VerificarTemperaturaTosse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite sua temperatura corporal: ");
        double temperaturaCorporal = scan.nextDouble();
        scan.nextLine();

        System.out.print("Você está com tosse? ");
        String tosse = scan.nextLine();

        if (temperaturaCorporal > 37.5 || tosse.equalsIgnoreCase("Sim")) {
            System.out.println("Recomendamos que você procure um médico.");
        } else {
            System.out.println("Você está bem, não precisa de atendimento.");
        }

        scan.close();
    }
}