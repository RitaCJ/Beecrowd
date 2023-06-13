import java.util.Scanner;

public class Problema_1018 {
    public static void main(String args[]) {

        int N, a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0;

        Scanner input = new Scanner(System.in);
        N = input.nextInt();

        int num = N;

        while (N != 0) {
            if (N >= 100) {
                a = a + 1;
                N = N - 100;
            }

            else if (N >= 50) {
                b = b + 1;
                N = N - 50;
            }

            else if (N >= 20) {
                c = c + 1;
                N = N - 20;
            }

            else if (N >= 10) {
                d = d + 1;
                N = N - 10;
            }

            else if (N >= 5) {
                e = e + 1;
                N = N - 5;
            }

            else if (N >= 2) {
                f = f + 1;
                N = N - 2;
            }

            else if (N >= 1) {
                g = g + 1;
                N = N - 1;
            }

        }
        System.out.printf("%d\n",num);
        System.out.printf("%d nota(s) de R$ 100,00\n", a);
        System.out.printf("%d nota(s) de R$ 50,00\n", b);
        System.out.printf("%d nota(s) de R$ 20,00\n", c);
        System.out.printf("%d nota(s) de R$ 10,00\n", d);
        System.out.printf("%d nota(s) de R$ 5,00\n", e);
        System.out.printf("%d nota(s) de R$ 2,00\n", f);
        System.out.printf("%d nota(s) de R$ 1,00\n", g);

    }
}
