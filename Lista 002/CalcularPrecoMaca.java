import java.util.Scanner;

public class CalcularPrecoMaca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas maças deseja comprar?");
        int macasCompradas = scan.nextInt();
        
        double precoMaca; 

        if (macasCompradas < 12) {
            precoMaca = 1.30;
        }
        else {
            precoMaca = 1;
        }

        double total = macasCompradas * precoMaca;

        System.out.println(String.format("Você comprou %d maças e irá pagar R$ %.2f", macasCompradas,total));

        scan.close();
    }
}
