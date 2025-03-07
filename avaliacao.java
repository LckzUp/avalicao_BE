import java.util.Scanner;

public class avaliacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro numero: ");
        int numero3 = scanner.nextInt();

        int maiornumero = numero1;

        if (numero2 > maiornumero) {
            maiornumero = numero2;
        }
        if (numero3 > maiornumero) {
            maiornumero = numero3;
        }

        System.out.println("o maior numero e: " + maiornumero);
        
        scanner.close();
    }
}