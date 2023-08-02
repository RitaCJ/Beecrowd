import java.util.Scanner;

public class Problema_1072 {
    public static void main(String[] args) {

        int N, x, in = 0, out = 0;
        Scanner input = new Scanner(System.in);

        N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            x = input.nextInt();
            if (x >= 10 && x <= 20) {
                in = in + 1;
            } else {
                out = out + 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
