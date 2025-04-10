import java.util.Scanner;

public class Avaliacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double numero1 = sc.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double numero2 = sc.nextDouble();

        System.out.print("Digite o terceiro numero: ");
        double numero3 = sc.nextDouble();

        double maiornumero = numero1;

        if (numero2 > maiornumero) {
            maiornumero = numero2;
        }

        if (numero3 > maiornumero) {
            maiornumero = numero3;
        }

        System.out.println("o maior numero e: " + maiornumero);
        
    }
}