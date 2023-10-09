import java.util.Scanner;

public class Problema_1118 {
    public static void main(String[] args) {
        double score1, score2, sum = 0, media = 0;
        int i = 0, x = 1;

        Scanner input = new Scanner(System.in);

        while (x == 1) {

            do {
                score1 = input.nextDouble();

                if (score1 >= 0 && score1 <= 10) {
                    sum = sum + score1;
                    i++;
                } else if (score1 < 0 || score1 > 10) {
                    System.out.println("nota invalida");
                }

                score2 = input.nextDouble();

                if (score2 >= 0 && score2 <= 10) {
                    sum = sum + score2;
                    i++;
                } else if (score2 < 0 || score2 > 10) {
                    System.out.println("nota invalida");
                }

            } while (i != 2);
            media = sum / 2;

            System.out.printf("media = %.2f\n", media);

            x = 0;
            i = 0;

            while (x > 2 || x < 1) {
                System.out.println("novo calculo (1-sim 2-nao)");
                x = input.nextInt();
            }
            sum = 0;
            media = 0;

        }

    }
}
