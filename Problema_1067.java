import java.util.Scanner;

public class Problema_1067 {
    public static void main(String[] args) {
        int x;

        Scanner input = new Scanner(System.in);

        x = input.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {

                System.out.println(i);

            }

        }

    }
}
