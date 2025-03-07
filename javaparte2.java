import java.util.Scanner;

public class javaparte2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite o primeiro numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        int diferenca = numero1 - numero2;

        if (diferenca > 0) {
            System.out.println("a diferenca e positiva.");
        } else if (diferenca < 0) {
            System.out.println("a diferenea e negativa.");
        } else {
            System.out.println("a diferenca e zero.");
        }

        scanner.close();
    }
}