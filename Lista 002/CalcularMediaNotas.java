import java.util.Scanner;

public class CalcularMediaNotas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua 1° nota: ");
        float nota1 = scan.nextFloat();

        System.out.println("Digite sua 2° nota: ");
        float nota2 = scan.nextFloat();

        float mediaSimples = (nota1 + nota2) / 2;

        if (mediaSimples >= 6) {
            System.out.println("Parabéns, você foi aprovado e sua média foi " + mediaSimples);
        }
        else {
            System.out.println("Reprovado, precisa estudar mais. ");
        }

    }
}
