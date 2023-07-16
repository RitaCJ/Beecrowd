import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_1040 {
    public static void main(String[] args) {

        float N1, N2, N3, N4;
        double average, gradeExam;
        int sum;

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        N1 = input.nextFloat();
        N2 = input.nextFloat();
        N3 = input.nextFloat();
        N4 = input.nextFloat();

        sum = 1 + 2 + 3 + 4;

        average = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / sum;
        System.out.println("Media:" + df.format(average) + "\n");
        if (average >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (average < 5.0) {
            System.out.println("Aluno reprovado.");
        } else if (average >= 5.0 && average <= 6.9) {
            System.out.println("Aluno em exame.");

            gradeExam = input.nextDouble();
            average = (average + gradeExam) / 2;
            if (average >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else if (average <= 4.9) {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media:" + df.format(average) + "\n");
        }

    }
}
