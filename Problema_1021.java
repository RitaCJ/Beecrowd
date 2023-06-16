import java.util.Scanner;
public class Problema_1021 {
     public static void main(String args[]) {

        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, 
         h=0, i =0, j=0, k=0, l=0, m=0;
         double N;

        Scanner input = new Scanner(System.in);
        N = input.nextDouble();

        while (N > 0) {
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

            else if (N >= 1.00) {
                h = h + 1;
                N = N - 1.00;
            }
           else if (N >= 0.50) {
                i = i + 1;
                N = N - 0.50;
            }

            else if (N >= 0.25) {
                j = j + 1;
                N = N - 0.25;
            }

            else if (N >= 0.10) {
                k = k + 1;
                N = N - 0.10;
            }

            else if (N >= 0.05) {
                l = l + 1;
                N = N - 0.05;
            }

            else if (N >= 0.01) {
                m = m + 1;
                N = N - 0.01;
            }


        }
        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00\n", a);
        System.out.printf("%d nota(s) de R$ 50.00\n", b);
        System.out.printf("%d nota(s) de R$ 20.00\n", c);
        System.out.printf("%d nota(s) de R$ 10.00\n", d);
        System.out.printf("%d nota(s) de R$ 5.00\n", e);
        System.out.printf("%d nota(s) de R$ 2.00\n", f);

        System.out.println("MOEDAS:");
        System.out.printf("%d moeada(s) de R$ 1.00\n", h);
        System.out.printf("%d moeada(s) de R$ 0.50\n", i);
        System.out.printf("%d moeada(s) de R$ 0.25\n", j);
        System.out.printf("%d moeada(s) de R$ 0.10\n", k);
        System.out.printf("%d moeada(s) de R$ 0.05\n", l);
        System.out.printf("%d moeada(s) de R$ 0.01\n", m);
       
    }
}
