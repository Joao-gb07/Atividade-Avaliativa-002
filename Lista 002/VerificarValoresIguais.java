import java.util.Scanner;

public class VerificarValoresIguais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int numero1 = scan.nextInt();

        System.out.println("Digite um valor: ");
        int numero2 = scan.nextInt();

        if (numero1 == numero2 || numero2 == numero1) {
            System.out.println("Erro! Você digitou valores iguais");
        }
        else{
            System.out.println("Os valores digitados não são iguais");
        }
        scan.close();
    }
}
