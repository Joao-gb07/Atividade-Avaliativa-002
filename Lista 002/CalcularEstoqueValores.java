import java.util.Scanner;

public class CalcularEstoqueValores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o valor do produto? ");
        float valorProuto = scan.nextFloat();

        System.out.println("Qual a quantidade no estoque? ");
        int estoque = scan.nextInt();

        if (valorProuto < 10 && estoque > 50) {
            System.out.println("O produto está em promoção!");
        } else if (estoque < 10) {
            System.out.println("O produto deve ser abastecido");
        }

        scan.close();
    }
}
