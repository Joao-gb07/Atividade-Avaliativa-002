import java.util.Scanner;

public class CalcularMaiorNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = scan.nextInt();

        System.out.println("Digite um número: ");
        int num2 = scan.nextInt();

        System.out.println("Digite um número: ");
        int num3 = scan.nextInt();

        int maiorNumero;

        if (num1 > num2 && num1 > num3) {
            maiorNumero = num1;
        }
        else if (num2 > num1 && num2 > num3) {
            maiorNumero = num2;
        }
        else{
            maiorNumero = num3;
        }
        System.out.println("O maior número é: " + maiorNumero);
        
        scan.close();
    }
}
