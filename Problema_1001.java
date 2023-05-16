import java.util.Scanner;
public class Problema_1001 {
    public static void main (String[]a){
        int A, B, X; 
        Scanner m = new Scanner(System.in);
    
        try{
            A = m.nextInt();
            B = m.nextInt();
        
            X = A + B; 
        
            System.out.println("X = " + X);
    
        }finally{
             m.close();
        }
        
        }
}
