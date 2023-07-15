import java.util.Scanner;

public class Problema_1038 {
    public static void main(String[] args) {

        int x, y;
        double totalPay;

        Scanner input = new Scanner(System.in);
        x = input.nextInt();

        switch (x) {

            case 1:
                y = input.nextInt();
                totalPay = 4.00 * y;
                System.out.printf("Total: R$ %.2f\n", totalPay);
                break;

            case 2:
                y = input.nextInt();
                totalPay = 4.50 * y;
                System.out.printf("Total: R$ %.2f\n", totalPay);
                break;

            case 3:
                y = input.nextInt();
                totalPay = 5.00 * y;
                System.out.printf("Total: R$ %.2f\n", totalPay);
                break;

            case 4:
                y = input.nextInt();
                totalPay = 2.00 * y;
                System.out.printf("Total: R$ %.2f\n", totalPay);
                break;

            case 5:
                y = input.nextInt();
                totalPay = 1.50 * y;
                System.out.printf("Total: R$ %.2f\n", totalPay);
                break;
        }

    }
}
