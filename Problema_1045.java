import java.util.Scanner;
import java.lang.Math;

public class Problema_1045 {
    public static void main(String[] args) {

        double A = 0, B = 0, C = 0, x, y, z;

        Scanner input = new Scanner(System.in);

        x = input.nextDouble();
        y = input.nextDouble();
        z = input.nextDouble();

        if (x >= y && x >= z) {
            A = x;
            B = y;
            C = z;
        } else if (y >= x && y >= z) {
            A = y;
            B = x;
            C = z;
        } else if (z >= x && z >= y) {
            A = z;
            B = y;
            C = x;

        }

        if ((B + C) <= A) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (((Math.pow(A, 2)) == (Math.pow(B, 2)) + (Math.pow(C, 2)))) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (((Math.pow(A, 2)) > (Math.pow(B, 2)) + (Math.pow(C, 2)))) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (((Math.pow(A, 2)) < (Math.pow(B, 2)) + (Math.pow(C, 2)))) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if ((A == B && A != C) || (B == C && B != A) || (C == A && C != B)) {
                System.out.println("TRIANGULO ISOSCELES");
            }

        }

    }

}
