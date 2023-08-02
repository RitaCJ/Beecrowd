import java.util.Scanner;

public class Problema_1051 {
    public static void main(String[] args) {

        double salary;

        Scanner input = new Scanner(System.in);

        salary = input.nextDouble();

        if (salary >= 0 && salary <= 2000) {
            System.out.println("Isento");
        } else if (salary >= 2000.01 && salary <= 3000) {
            salary = ((salary - 2000) * 0.08);
            String salario = String.format("%.2f", salary);
            System.out.println("R$ " + salario);

        } else if (salary >= 3000.01 && salary <= 4500) {
            salary = ((1000 * 0.08) + ((salary - 3000) * 0.18));
            String salario = String.format("%.2f", salary);
            System.out.println("R$ " + salario);

        } else if (salary > 4500) {
            salary = (((1000 * 0.08) + (1500 * 0.18)) + ((salary - 4500) * 0.28));
            String salario = String.format("%.2f", salary);
            System.out.println("R$ " + salario);

        }

    }
}
