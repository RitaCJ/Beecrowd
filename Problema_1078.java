import java.util.Scanner;

public class Problema_1078 {
    public static void main(String[] args) {

        int N, result = 0;

        Scanner input = new Scanner(System.in);

        N = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            result = i * N;
            System.out.printf("%d x %d = %d\n", i, N, result);
        }

    }
}
