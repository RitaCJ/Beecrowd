import java.util.Scanner;
public class Problema_1005 {
   public static void main(String [] args){
      Scanner input = new Scanner(System.in);
       float A, B;
    try{
       A = input.nextFloat();
       B = input.nextFloat();

   double  result = (((A * 3.5) + (B * 7.5)) / (3.5 + 7.5));

   String resultado = String.format("%.5f", result);

   System.out.println("MEDIA = " + resultado);

    }finally{
        input.close();
    }
   } 
}
