import java.util.Scanner;

public class Problema_1116 {
    public static void main(String[] args) {

        int N, X, Y;
        double divid, z = 0.5;

        Scanner input = new Scanner(System.in);

        N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            X = input.nextInt();
            Y = input.nextInt();

            if (Y != 0) {
                divid = ((X * z) / (Y * z));
                System.out.printf("%.1f\n", divid);

            } else {
                System.out.println("divisao impossivel");
            }

        }

    }
}
