import java.util.Scanner;

public class Problema_1080 {
    public static void main(String[] args) {
        int maior = 0, p = 0;

        int[] vetor = new int[100];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 100; i++) {
            vetor[i] = input.nextInt();

            if (vetor[i] > maior) {
                maior = vetor[i];

                p = i + 1;

            }

        }

        System.out.printf("%d\n", maior);
        System.out.printf("%d\n", p);

    }
}
