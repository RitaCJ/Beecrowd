import java.util.Scanner;
import java.lang.Math;

public class Problema_1002 {
    public static void main (String []args){

        double R, Result;
        Scanner snr = new Scanner(System.in);
    try{
        R = snr.nextDouble();
        Result = (3.14159 * Math.pow(R, 2));
       String A = String.format("%.4f", Result);
        System.out.println("A=" + A);
    }finally{
        snr.close();
    }
        
    }
}
