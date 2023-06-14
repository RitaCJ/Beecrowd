import java.util.Scanner;

public class Problema_1019 {
    public static void main(String args[]) {

        int duration_s, hour, minute, second;
        
        Scanner input = new Scanner(System.in);

        duration_s = input.nextInt();

        hour = duration_s / 3600;
        duration_s = duration_s - (hour * 3600);

        minute = duration_s / 60;
        duration_s = duration_s - (minute * 60);

        second = duration_s;

        System.out.printf("%d:%d:%d\n", hour, minute, second);

    }
}
