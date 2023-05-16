import java.util.Scanner;

public class Problema_1004 {
    public static void main(String args[]){
      
        Scanner input = new Scanner(System.in);

        int A, B;
    try{
        A = input.nextInt();
        B = input.nextInt();

        int result = A * B;

        System.out.println("PROD = " + result);
    }finally{
        input.close();
    }
    }
}
