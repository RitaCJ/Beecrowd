import java.util.Scanner;

public class Problema_1003 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        int A, B;
        try{
        A = input.nextInt();
        B = input.nextInt();

        int Soma = A + B;
        
        System.out.println("SOMA = " + Soma);

        }finally{
            input.close();
        }

    }
}
