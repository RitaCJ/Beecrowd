import java.util.Scanner;

public class Problema_1048 {
    public static void main(String[] args) {
        float salary, newSalary = 0, moneyEarned = 0;
        int percentage = 0;

        Scanner input = new Scanner(System.in);

        salary = input.nextFloat();

        if (salary >= 0 && salary <= 400.00) {
            moneyEarned = salary * 15 / 100;
            newSalary = salary + moneyEarned;
            percentage = 15;
        } else if (salary >= 400.01 && salary <= 800.00) {
            moneyEarned = salary * 2 / 100;
            newSalary = salary + moneyEarned;
            percentage = 12;
        } else if (salary >= 800.01 && salary <= 1200.00) {
            moneyEarned = salary * 10 / 100;
            newSalary = salary + moneyEarned;
            percentage = 10;
        } else if (salary >= 1200.01 && salary <= 2000.00) {
            moneyEarned = salary * 7 / 100;
            newSalary = salary + moneyEarned;
            percentage = 7;
        } else if (salary >= 2000.00) {
            moneyEarned = salary * 4 / 100;
            newSalary = salary + moneyEarned;
            percentage = 4;
        }

        System.out.printf("Novo salario: %.2f\n", newSalary);
        System.out.printf("Reajuste ganho: %.2f\n", moneyEarned);
        System.out.printf("Em percentual: %d %%\n", percentage);
    }
}
