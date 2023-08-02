import java.util.Scanner;

public class Problema_1066 {
    public static void main(String[] args) {

        int[] num = new int[5];
        int even = 0, odd = 0, positive = 0, negative = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            num[i] = input.nextInt();
            if (num[i] % 2 == 0) {
                even = even + 1;
            } else {
                odd = odd + 1;
            }
            if (num[i] > 0) {
                positive = positive + 1;
            } else if (num[i] < 0) {
                negative = negative + 1;
            }

        }

        System.out.println(even + " valor(es) par(es)");
        System.out.println(odd + " valor(es) impar(es)");
        System.out.println(positive + " valor(es) positivo(s)");
        System.out.println(negative + " valor(es) negativo(s)");

    }
}
