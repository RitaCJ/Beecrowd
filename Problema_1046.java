import java.util.Scanner;

public class Problema_1046 {
    public static void main(String[] args) {

        int start, end, time;
        Scanner input = new Scanner(System.in);
        start = input.nextInt();
        end = input.nextInt();

        if (start > end || start == end) {
            time = start - end;
            time = 24 - time;
            System.out.println("O JOGO DUROU " + time + " HORA(S)");
        } else {
            time = start - end;
            time = (-1 * time);
            System.out.println("O JOGO DUROU " + time + " HORA(S)");
        }

    }
}
