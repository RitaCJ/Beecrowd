import java.util.Scanner;

public class Problema_1113 {
    public static void main(String[] args) {
        int X = 1, Y = 0;

        Scanner input = new Scanner(System.in);

        do {

            X = input.nextInt();
            Y = input.nextInt();

            if (X > Y && X != Y) {
                System.out.println("Decrescente");

            } else if (X < Y) {
                System.out.println("Crescente");

            }

        } while (X != Y);

    }
}
