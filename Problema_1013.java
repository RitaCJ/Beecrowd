import java.util.Scanner;

public class Problema_1013 {
    public static void main(String[] args) {

        int a, b, c;
        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        int d = (a + b + (Math.abs(a - b))) / 2;
        int thegreatest = (c + d + (Math.abs(c - d))) / 2;

        System.out.printf("%d eh o maior\n", thegreatest);

    }
}
