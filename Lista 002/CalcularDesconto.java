import java.util.Scanner;

public class CalcularDesconto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor total da sua compra R$ ");
        float valorDaCompra = scan.nextFloat();
        scan = new Scanner(System.in);

        System.out.println("Você se encaixa em qual categoria de cliente? (Novo ou Fidelidade)");
        String tipoCliente = scan.nextLine();

       
        if (valorDaCompra > 100 || tipoCliente.equalsIgnoreCase("Fidelidade")) {
            System.out.println(String.format("Parabéns! Você ganhou um desconto de R$ %.2f" , valorDaCompra * 0.15));
        } 

        else {
            System.out.println(String.format("O total a pagar é de R$ %.2f" , valorDaCompra));
        }

        scan.close();
    }

}

//Terminar esse codigo
