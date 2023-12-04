import java.util.Scanner;

public class Problema_1150 {
    public static void main(String[] args) {

        int x, z, sum = 0, cont = 0;
        Scanner input = new Scanner(System.in);

        x = input.nextInt();
        z = input.nextInt();

        while (z <= x) {
            z = input.nextInt();
        }

        do {
            sum = sum + x;
            cont++;
            x++;

        } while (sum < z);

        System.out.println(cont);

    }
}
