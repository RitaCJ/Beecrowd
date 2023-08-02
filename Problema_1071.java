import java.util.Scanner;

public class Problema_1071 {
    public static void main(String[] args) {

        int x, y, sum = 0, i = 0;

        Scanner input = new Scanner(System.in);

        x = input.nextInt();
        y = input.nextInt();

        if (x < y) {

            for (i = (x + 1); i < y; i++) {
                if (i % 2 != 0) {
                    sum = sum + i;
                }

            }

        } else if (x > y) {

            for (i = (x - 1); i > y; i--) {
                if (i % 2 != 0) {
                    sum = sum + i;
                }

            }

        }
        if (x == y) {
            sum = 0;
        }
        System.out.println(sum);
    }
}
