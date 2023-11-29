import java.util.Scanner;

public class Problema_1146 {
    public static void main(String[] args) {
        int X;

        Scanner input = new Scanner(System.in);

        while ((X = input.nextInt()) != 0) {

            for (int i = 1; i <= X; i++) {
                if (i == X) {
                    System.out.print(i + "\n");

                } else {
                    System.out.print(i + " ");
                }
            }

        }
    }
}