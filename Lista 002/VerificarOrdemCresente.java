import java.util.Scanner;

public class VerificarOrdemCresente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = scan.nextInt();

        System.out.println("Digite um número: ");
        int num2 = scan.nextInt();

        System.out.println("Digite um número: ");
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("O maior é: " + num1);

            if (num2 > num3) {
                System.out.println("O segundo maior é " + num2);
                System.out.println("O terceiro maior é " + num3);
            } else {
                System.out.println("O segundo maior é " + num3);
                System.out.println("O terceiro maior é " + num2);
            }

        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O maior é " + num2);

            if (num1 > num3) {
                System.out.println("O segundo maior é " + num1);
                System.out.println("O terceiro maior é " + num3);
            } else {
                System.out.println("O segundo maior é " + num3);
                System.out.println("O terceiro maior é " + num1);
            }

        } else {
            System.out.println("O maior é " + num3);

            if (num2 > num1) {
                System.out.println("O segundo maior é " + num2);
                System.out.println("O terceiro maior é " + num1);
            } else {
                System.out.println("O segundo maior é " + num1);
                System.out.println("O terceiro maior é " + num2);
            }
        }

        scan.close();
    }
}
