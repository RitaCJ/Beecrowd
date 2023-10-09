import java.util.Scanner;

public class Problema_1115 {
    public static void main(String[] args) {

        int X = 1, Y = 1;

        Scanner input = new Scanner(System.in);

        while (X != 0 && Y != 0) {

            X = input.nextInt();
            Y = input.nextInt();

            if (X != 0 && Y != 0) {

                if (X > 0 && Y > 0) {
                    System.out.println("primeiro");
                } else if (X < 0 && Y > 0) {
                    System.out.println("segundo");
                } else if (X < 0 && Y < 0) {
                    System.out.println("terceiro");
                } else if (X > 0 && Y < 0) {
                    System.out.println("quarto");
                }

            }

        }
    }
}
