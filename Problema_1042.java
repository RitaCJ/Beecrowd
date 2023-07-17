import java.util.Scanner;

public class Problema_1042 {
    public static void main(String[] args) {

        int num1, num2, num3, n = 0, j = 0, i = 0;
        int x = 0, y = 0, z = 0;

        Scanner input = new Scanner(System.in);

        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        if (num1 < num2) {
            i++;
        }
        if (num1 < num3) {
            i++;
        }

        if (num2 < num1) {
            n++;
        }
        if (num2 < num3) {
            n++;
        }
        if (num3 < num1) {
            j++;
        }
        if (num3 < num2) {
            j++;
        }

        if (i == 2) {
            x = num1;
        } else if (i == 1) {
            y = num1;
        } else if (i == 0) {
            z = num1;
        }
        if (n == 2) {
            x = num2;
        } else if (n == 1) {
            y = num2;
        } else if (n == 0) {
            z = num2;
        }
        if (j == 2) {
            x = num3;
        } else if (j == 1) {
            y = num3;
        } else if (j == 0) {
            z = num3;
        }

        System.out.println(x + "\n" + y + "\n" + z);
        System.out.println();
        System.out.println(num1 + "\n" + num2 + "\n" + num3);

    }
}
