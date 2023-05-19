import java.util.Scanner;
public class Problema_3302 {
    
    public static void main(String args[]){

        int N, question; 

        Scanner input = new Scanner(System.in);

    N = input.nextInt();

    for (int i= 1; i<=N; i++){
        question = input.nextInt();

        System.out.println("resposta " + i +  ": " + question);
    }

    }

}
