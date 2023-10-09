import java.util.Scanner;

public class Problema_1132 {
    public static void main(String[] args) {
        int x, y, sum = 0;

        Scanner input = new Scanner(System.in);

        x = input.nextInt();
        y = input.nextInt();

        if (x > y) {
            for (int i = y; i <= x; i++) {
                if (i % 13 != 0) {
                    sum = sum + i;
                }

            }

        }

        if (x < y) {
            for (int j = x; j <= y; j++) {
                if (j % 13 != 0) {
                    sum = sum + j;
                }

            }

        }

        System.out.println(sum);
    }
}
