import java.util.Scanner;

public class javaparte3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite o primeiro numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("digite o segundo nimero: ");
        int numero2 = scanner.nextInt();

        int produto = numero1 * numero2;

        if (produto % 2 == 0) {
            System.out.println("o produto de " + numero1 + " e " + numero2 + " e par.");
        } else {
            System.out.println("o produto de " + numero1 + " e " + numero2 + " e impar.");
        }

        scanner.close();
    }
}
