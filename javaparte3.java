import java.util.Scanner;

public class javaparte3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite o primeiro numero: ");
        double numero1 = sc.nextDouble();

        System.out.print("digite o segundo nimero: ");
        double numero2 = sc.nextDouble();

        double produto = numero1 * numero2;

        if (produto % 2 == 0) {
            System.out.println("o produto de " + numero1 + " e " + numero2 + " e par.");
        } else {
            System.out.println("o produto de " + numero1 + " e " + numero2 + " e impar.");
        }

    }
}
