import java.util.Scanner;

public class SomarDoisMaiores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = scan.nextInt();

        System.out.println("Digite um número: ");
        int num2 = scan.nextInt();

        System.out.println("Digite um número: ");
        int num3 = scan.nextInt();

        int menorNumero;

        if (num1 < num2 && num1 < num3) {
            menorNumero = num1;
        }
        else if (num2 < num1 && num2 < num3) {
            menorNumero = num2;
        }
        else {
            menorNumero = num3;
        }

        int resultado = (num1 + num2 + num3) - menorNumero;

        System.out.println("A soma dos dois maiores números é: " + resultado);
        scan.close();
    }
}
