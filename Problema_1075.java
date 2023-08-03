import java.util.Scanner;

public class Problema_1075 {
    public static void main(String[] args) {

        int N;

        Scanner input = new Scanner(System.in);

        N = input.nextInt();

        for (int i = 1; i <= 10000; i++) {
            if (i % N == 2) {
                System.out.println(i);
            }
        }

    }
}
