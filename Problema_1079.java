import java.util.Scanner;

public class Problema_1079 {
    public static void main(String[] args) {

        int N;
        double num1, num2, num3, result;

        Scanner input = new Scanner(System.in);

        N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            num1 = input.nextDouble();
            num2 = input.nextDouble();
            num3 = input.nextDouble();

            result = (num1 * 2 + num2 * 3 + num3 * 5) / (2 + 3 + 5);
            System.out.printf("%.1f\n", result);

        }

    }
}
