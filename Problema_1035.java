import java.util.Scanner;

public class Problema_1035 {
    public static void main(String args[]) {
        int A, B, C, D, soma, sum, i = 0, j = 0;
        Scanner input = new Scanner(System.in);

        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();

        soma = A + B;
        sum = C + D;

        if (C > 0 && D > 0) {
            i = 1;
        }

        if (A % 2 == 0) {
            j = 1;
        }

        if (B > C && D > A && sum > soma && i == 1 && j == 1) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

    }
}
