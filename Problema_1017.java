import java.util.Scanner;

public class Problema_1017 {
    public static void main(String args[]) {
        int v_h, v_k;
        double result;

        Scanner input = new Scanner(System.in);

        v_h = input.nextInt();
        v_k = input.nextInt();

        result = (v_h * v_k);
        result = result / 12;

        String r = String.format("%.3f", result);

        System.out.println(r);
    }
}
