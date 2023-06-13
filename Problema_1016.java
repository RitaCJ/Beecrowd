import java.util.Scanner;

public class Problema_1016 {
    public static void main(String args[]) {
        int kilometros, result;

        Scanner input = new Scanner(System.in);

        kilometros = input.nextInt();

        result = kilometros * 2;

        System.out.printf("%d minutos\n", result);

    }

}
