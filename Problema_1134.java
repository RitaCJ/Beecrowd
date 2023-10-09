import java.util.Scanner;

public class Problema_1134 {
    public static void main(String[] args) {
        int code = 0, i = 0, j = 0, z = 0;

        Scanner input = new Scanner(System.in);

        while (code != 4) {
            code = input.nextInt();

            if (code == 1) {
                i++;
            } else if (code == 2) {
                j++;
            } else if (code == 3) {
                z++;
            }
        }

        System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d\n", i, j, z);

    }
}
