import java.util.Scanner;

public class Problema_1006 {
    public static void main(String args[]) {
        double A, B, C;

        Scanner input = new Scanner(System.in);

        try {

            A = input.nextDouble();
            B = input.nextDouble();
            C = input.nextDouble();

                double average = (((A * 2) + (B * 3) + (C * 5)) / (2 + 3 + 5));

                String media = String.format("%.1f", average);

                System.out.println("MEDIA = " + media);
                
        } finally {
            input.close();
        }

    }
}
