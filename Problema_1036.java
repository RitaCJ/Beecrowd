import java.util.Scanner;

public class Problema_1036 {
    public static void main(String[] args) {
        double number1, number2, number3;
        double delta, R1, R2, result, result1;
        Scanner input = new Scanner(System.in);

        number1 = input.nextDouble();
        number2 = input.nextDouble();
        number3 = input.nextDouble();

        delta = Math.pow(number2, 2) - (4 * number1 * number3);

        if (delta > 0) {
            result = Math.sqrt(delta);
            result1 = number1 * 2;
            if (result1 != 0) {
                R1 = (-number2 + result) / result1;
                R2 = (-number2 - result) / result1;
                System.out.printf("R1 = %.5f\nR2 = %.5f\n", R1, R2);
            } else {
                System.out.println("Impossivel calcular");
            }

        } else {
            System.out.println("Impossivel calcular");
        }

    }
}
