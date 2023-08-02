import java.util.Scanner;

public class Problema_1064 {
    public static void main(String[] args) {

        double num[] = new double[6];
        int m = 0;
        double average = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            num[i] = input.nextDouble();
            if (num[i] > 0) {
                m = m + 1;
                average = (average + num[i]);

            }
        }

        average = average / m;
        System.out.println(m + " valores positivos");
        System.out.printf("%.1f\n",average);

    }
}
