import java.text.Format;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Entradas
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = teclado.nextInt();
        System.out.println("");
        System.out.println("Digite o segundo número: ");
        int segundoNumero = teclado.nextInt();
        System.out.println("");
        teclado.close();
        //Processamento
        int soma = primeiroNumero + segundoNumero;
        //Saídas
        System.out.println(" O resultado da soma foi" + soma);
    }
}
