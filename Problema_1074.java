import java.util.Scanner;

public class Problema_1074 {
    public static void main(String[] args) {

        int N, x;
        Scanner input = new Scanner(System.in);

        N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            x = input.nextInt();

            if (x == 0) {
                System.out.println("NULL");
            } else if (x < 0 && x % 2 != 0) {
                System.out.println("ODD NEGATIVE");

            } else if (x > 0 && x % 2 != 0) {
                System.out.println("ODD POSITIVE");

            } else if (x < 0 && x % 2 == 0) {
                System.out.println("EVEN NEGATIVE");

            } else if (x > 0 && x % 2 == 0) {
                System.out.println("EVEN POSITIVE");

            }
        }

    }
}
