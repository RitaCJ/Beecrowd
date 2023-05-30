import java.util.Scanner;
public class Problema_1009 {
    public static void main (String args[]){

        String seller_name;
        double salary, sold, total;

        Scanner input = new Scanner(System.in);

        try{
            seller_name = input.nextLine();
            sold = input.nextDouble();
            salary = input.nextDouble();

            total = (salary + (sold * 0.15));

            String salario = String.format("%.2f", total);

            System.out.println("TOTAL = R$ " + salario);

        }finally{
            input.close();
        }
    }
}
