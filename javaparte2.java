import java.util.Scanner;

public class javaparte2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite o primeiro numero: ");
        double numero1 = sc.nextDouble();

        System.out.print("digite o segundo numero: ");
        double numero2 = sc.nextDouble();

        double diferenca = numero1 - numero2;

        if (diferenca > 0) {
            System.out.println("a diferenca e positiva.");
        } else if (diferenca < 0) {
            System.out.println("a diferenea e negativp.");
        } else {
            System.out.println("a diferenca e zero.");
        }

    }
}