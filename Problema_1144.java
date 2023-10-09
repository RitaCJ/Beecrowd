import java.util.Scanner;
public class Problema_1144 {
    public static void main(String [] args){
        int num;

        Scanner input = new Scanner(System.in);

        num = input.nextInt();

        for(int i = 1; i <= num; i++){
            System.out.println(i + " " + (i*i) + " " +  (i*i*i));
             System.out.println(i + " " + ((i*i)+1) + " " + ((i*i*i)+1));
        }
    }
}
