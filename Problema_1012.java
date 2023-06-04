import java.util.Scanner;

public class Problema_1012 {
    public static void main(String args[]) {
        float A, B, C;

        Scanner input = new Scanner(System.in);

        A = input.nextFloat();
        B = input.nextFloat();
        C = input.nextFloat();

        double triangle = (A * C) / 2;
        double circle = 3.14159 * Math.pow(C, 2);
        double trapezium = ((A + B) * C) / 2;
        double square = Math.pow(B, 2);
        double rectangle = A * B;

        String tri = String.format("%.3f", triangle);
        String cir = String.format("%.3f", circle);
        String trap = String.format("%.3f", trapezium);
        String sq = String.format("%.3f", square);
        String re = String.format("%.3f", rectangle);

        System.out.println("TRIANGULO:" + tri);
        System.out.println("CIRCULO: " + cir);
        System.out.println("TRAPEZIO: " + trap);
        System.out.println("QUADRADO: " + sq);
        System.out.println("RETANGULO: " + re);

    }
}
