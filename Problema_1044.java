import java.util.Scanner;

public class Problema_1044 {
    public static void main(String[] args) {

        int A, B;

        Scanner input = new Scanner(System.in);

        A = input.nextInt();
        B = input.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

    }
}
