import java.util.Scanner;

public class Problema_1073 {
    public static void main(String[] args) {

        int N, result;

        Scanner input = new Scanner(System.in);

        N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                result = i * i;
                System.out.printf("%d^2 = %d\n", i, result);
            }
        }

    }
}
