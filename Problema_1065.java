import java.util.Scanner;

public class Problema_1065 {
    public static void main(String[] args) {

        int[] num = new int[5];
        int m = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            num[i] = input.nextInt();
            if (num[i] % 2 == 0) {
                m = m + 1;
            }

        }

        System.out.println(m + " valores pares");

    }
}
