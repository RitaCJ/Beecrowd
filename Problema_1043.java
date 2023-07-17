import java.util.Scanner;

public class Problema_1043 {
    public static void main(String[] args) {

        float A, B, C, perimeter, area;
        Scanner input = new Scanner(System.in);

        A = input.nextFloat();
        B = input.nextFloat();
        C = input.nextFloat();

        if ((A + B) > C && (A + C) > B && (B + C) > A) {
            perimeter = A + B + C;
            System.out.println("Perimetro = " + perimeter);
        } else {
            area = ((A + B) * C) / 2;
            System.out.println("Area = " + area);
        }
    }
}
