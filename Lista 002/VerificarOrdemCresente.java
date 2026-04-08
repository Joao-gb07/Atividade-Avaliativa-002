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

        System.out.println("Os números digitados fora de ordem foram: " + num1 + "-" + num2 + "-" + num3);

        int maiorNumero;
        int segundoMaior;
        int terceiroMaior;

        if (num1 > num2 && num1 > num3) {
            maiorNumero = num1;
        }
        else if (num2 > num1 && num2 > num3) {
            segundoMaior = num2;
        }
        else {
            terceiroMaior = num3;
        }
        System.out.println("Os números digitados em ordem cresente ficam assim: " + terceiroMaior  + segundoMaior  + maiorNumero);



    }
    
}
