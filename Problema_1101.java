import java.util.Scanner;

public class Problema_1101 {
    public static void main(String[] args) {

        int M = 1, N = 1, sum = 0;

        Scanner input = new Scanner(System.in);

        do {
            M = input.nextInt();
            N = input.nextInt();
            if (M > N && M > 0 && N > 0) {
                sum = 0;
                for (int i = N; i <= M; i++) {
                    System.out.printf("%d ", i);
                    sum = sum + i;
                }
                System.out.println("Sum=" + sum);
            }

            if (N > M && M > 0 && N > 0) {
                sum = 0;
                for (int j = M; j <= N; j++) {
                    System.out.printf("%d ", j);
                    sum = sum + j;
                }
                System.out.println("Sum=" + sum);
            }

        } while (M > 0 && N > 0);
    }
}
