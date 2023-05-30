import java.util.Scanner;

public class Problema_1007 {
    public static void main(String args[]) {
        int A, B, C, D, result;

        Scanner input = new Scanner(System.in);

        try {

            A = input.nextInt();
            B = input.nextInt();
            C = input.nextInt();
            D = input.nextInt();

            result = ((A * B) - (C * D));

            System.out.printf("DIFERENCA = %d\n", result);

        } finally {
            input.close();
        }
    }
}
