import java.util.Scanner;

public class Problema_1014 {
    public static void main(String args[]) {

        int x;
        float y;
        double consumption;

        Scanner input = new Scanner(System.in);

        x = input.nextInt();
        y = input.nextFloat();

        consumption = x / y;

        String c = String.format("%.3f", consumption);

        System.out.println(c + " km/l");

    }
}
