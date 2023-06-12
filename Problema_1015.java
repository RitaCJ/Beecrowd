import java.util.Scanner;

public class Problema_1015 {
    public static void main(String args[]) {
        double x1, x2, y1, y2;

        Scanner input = new Scanner(System.in);

        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        double d1 = Math.pow((x2 - x1), 2);
        double d2 = Math.pow((y2 - y1), 2);
        double distancia = Math.sqrt(d1 + d2);

        String result = String.format("%.4f", distancia);

        System.out.println(result);

    }
}
