import java.util.Scanner;
public class Problema_1010 {
    public static void main (String args[]){

        int code_1, code_2, unit_1, unit_2;
        double price_1, price_2, total;

        Scanner input = new Scanner(System.in);

    try{
        code_1 = input.nextInt();
        unit_1 = input.nextInt();
        price_1 = input.nextDouble();

        code_2 = input.nextInt();
        unit_2 = input.nextInt();
        price_2 = input.nextDouble();

        total = ((unit_1*price_1) + (unit_2*price_2));

        String preço_final = String.format("%.2f", total);

        System.out.println("VALOR A PAGAR : R$ " + preço_final);
    }finally{
        input.close();
    }
    }
}
