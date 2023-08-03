import java.util.Scanner;

public class Problema_1094 {
    public static void main(String[] args) {

        int N, num, total = 0, totalC = 0, totalR = 0, totalS = 0;
        String animal;
        double perctC, perctR, perctS, resultC = 0, resultR = 0, resultS = 0;

        Scanner input = new Scanner(System.in);

        N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            num = input.nextInt();
            animal = input.next();

            if (animal.equals("C")) {
                totalC = totalC + num;

            } else if (animal.equals("R")) {
                totalR = totalR + num;
            } else if (animal.equals("S")) {
                totalS = totalS + num;
            }

            total = total + num;

        }
        resultC = totalC * 100;
        resultR = totalR * 100;
        resultS = totalS * 100;

        perctC = resultC / total;
        perctR = resultR / total;
        perctS = resultS / total;

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + totalC);
        System.out.println("Total de ratos: " + totalR);
        System.out.println("Total de sapos: " + totalS);
        System.out.printf("Percentual de coelhos: %.2f %%\n", perctC);
        System.out.printf("Percentual de ratos: %.2f %%\n", perctR);
        System.out.printf("Percentual de sapos: %.2f %%\n", perctS);

    }
}
