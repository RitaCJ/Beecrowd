import java.util.Scanner;

public class Problema_1117 {
    public static void main(String[] args) {

        float nota1, nota2, sum = 0;
        double media = 0;
        int i = 0;

        Scanner input = new Scanner(System.in);

        while (i != 2) {
            nota1 = input.nextFloat();

            if (nota1 >= 0 && nota1 <= 10) {
                sum = sum + nota1;
                i++;

            } else if (nota1 < 0 || nota1 > 10) {
                System.out.println("nota invalida");
            }

            nota2 = input.nextFloat();

            if (nota2 >= 0 && nota2 <= 10) {
                sum = sum + nota2;
                i++;
            } else if (nota2 < 0 || nota2 > 10) {
                System.out.println("nota invalida");
            }
        }
        media = sum / 2;

        System.out.printf("media = %.2f\n", media);

    }
}
