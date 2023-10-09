import java.util.Scanner;

public class Problema_1142 {
    public static void main(String[] args) {
        int num, z = 0, y = 0, j = 1;

        Scanner input = new Scanner(System.in);

        num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            z = j + 1;
            y = j + 2;
            System.out.printf("%d %d %d PUM\n", j, z, y);
            j = j + 4;

        }

    }
}
