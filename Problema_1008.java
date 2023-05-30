import java.util.Scanner;

public class Problema_1008 {
    public static void main(String args[]) {

        int E_number, W_hour;
        double amount;

        Scanner input = new Scanner(System.in);

        try {

            E_number = input.nextInt();
            W_hour = input.nextInt();
            amount = input.nextDouble();

            double salary = (W_hour * amount);

            String salario = String.format("%.2f", salary);

            System.out.println("NUMBER = " + E_number + "\nSALARY = U$ " + salario);

        } finally {
            input.close();
        }
    }

}
