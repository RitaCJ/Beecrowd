import java.util.Scanner;

public class Problema_1149 {
    public static void main(String[] args) {
        int A, N, sum = 0, result;

        Scanner input = new Scanner(System.in);

        A = input.nextInt();
        N = input.nextInt();

        while (N <= 0) {
            N = input.nextInt();
        }

        for (int i = 0; i < N; i++) {
            result = A + i;
            sum = sum + result;
        }

        System.out.println(sum);
    }
}
