import java.util.Scanner;

public class Problema_1070 {
    public static void main(String[] args) {

        int x, i = 1, j = 0;
        Scanner input = new Scanner(System.in);

        x = input.nextInt();

        i = x;

        while (j != 6) {

            if (i % 2 != 0) {
                System.out.println(i);
                j++;
            }

            i++;

        }

    }
}
