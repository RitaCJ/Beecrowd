import java.util.Scanner;

public class Problema_1020 {
    public static void main(String args[]) {

        int day, year = 0, month = 0, dias = 0;
        int i = 0, j = 0;

        Scanner input = new Scanner(System.in);

        day = input.nextInt();

        while (day != dias) {
            if (day >= 365) {
                year += 1;
                day -= 365;
            } else if (day >= 30) {
                month += 1;
                day -= 30;
            } else {
                dias = day;
            }
        }

        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)", year, month, dias);

    }
}
