import java.util.Scanner;

public class Problema_1011 {
    public static void main(String [] args){

        double R, result;
        Scanner input = new Scanner(System.in); 

        R = input.nextDouble();

        result = (4.0/3)* 3.14159 * Math.pow(R, 3);

      String  volume = String.format("%.3f", result);

      System.out.println("VOLUME = " + volume);


    }
}
