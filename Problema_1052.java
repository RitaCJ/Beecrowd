import java.util.Scanner;

public class Problema_1052 {
    public static void main(String[] args) {

        int numMonth, i = 0;
        String mes;
        String month[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        Scanner input = new Scanner(System.in);

        numMonth = input.nextInt();

        do {

            mes = month[i];
            i = i + 1;

        } while (i != numMonth);
        System.out.println(mes);

    }
}
