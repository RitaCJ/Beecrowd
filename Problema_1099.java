import java.util.Scanner;

public class Problema_1099 {
    public static void main(String[] args) {

        int N, x, y, sum = 0;

        Scanner input = new Scanner(System.in);

        N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            x = input.nextInt();
            y = input.nextInt();
            if (x > y) {
                sum = 0;
                for (int j = (y + 1); j < x; j++) {
                    if (j % 2 != 0) {
                        sum = sum + j;

                    }

                }

            } else if (x == y) {
                sum = 0;

            } else if (y > x) {
                sum = 0;
                for (int z = (x + 1); z < y; z++) {
                    if (z % 2 != 0) {
                        sum = sum + z;

                    }

                }
            }
            System.out.println(sum);
        }

    }
}
