import java.util.Scanner;

public class Problema_1060 {
    public static void main(String[] args) {

        double num[] = new double[6];
        int m = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            num[i] = input.nextDouble();
            if (num[i] > 0) {
                m = m + 1;
            }
        }
        System.out.println(m + " valores positivos");

    }
}
