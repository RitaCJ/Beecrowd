import java.util.Scanner;
public class Problema_1047 {
    public static void main(String[] args) {

        int start, end, minute1, minute2, time, minute;
        Scanner input = new Scanner(System.in);
        start = input.nextInt();
        minute1 = input.nextInt();
        end = input.nextInt();
        minute2 = input.nextInt();

        if (start > end || start == end) {
            time = start - end;
            time = 24 - time;
            if(minute1>minute2){
            minute = minute1 - minute2;
            time = time - minute;
            minute = Math.abs(minute);
            minute = 60 - minute;
            }else{
            minute = minute1 - minute2;
            minute = Math.abs(minute);
            }

            System.out.println("O JOGO DUROU " + time + " HORA(S) E " + minute + " MINUTO(S)");
        }else{
            time = start - end;
            time = Math.abs(time);
             if(minute1>minute2){
            minute = minute1 - minute2;
            time = time - minute;
            minute = Math.abs(minute);
            minute = 60 - minute;
            }else{
            minute = minute1 - minute2;
            minute = Math.abs(minute);
            }
           System.out.println("O JOGO DUROU " + time + " HORA(S) E " + minute + " MINUTO(S)");
        } 
}

}
