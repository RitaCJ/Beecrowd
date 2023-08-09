import java.text.DecimalFormat;

public class Problema_1098 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.0");

        double i = 0, j = 1;

        while (i <= 2) {

            for (int z = 1; z <= 3; z++) {
                if (df.format(i).endsWith("0")) {
                    System.out.println("I=" + df.format(i).substring(0, 1) + " J=" + df.format(j).substring(0, 1));

                } else {
                    System.out.println("I=" + df.format(i) + " J=" + df.format(j));
                }
                j = j + 1;
            }

            j = j - 3;
            j = j + 0.2;
            i = i + 0.2;

        }
    }
}
