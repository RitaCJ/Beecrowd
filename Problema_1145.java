import java.util.Scanner;

public class Problema_1145 {
    public static void main(String[] args) {

        int x, y, j = 1;

        Scanner input = new Scanner(System.in);

        x = input.nextInt();
        y = input.nextInt();

        for (int i = 1; i <= y; i++) {
            System.out.printf("%d", i);
            if (i % x == 0)
                System.out.println("");
            else
                System.out.print(" ");
        }

    }
}
