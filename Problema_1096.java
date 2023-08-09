public class Problema_1096 {
    public static void main(String[] args) {

        int i = 1, z;

        while (i <= 9) {
            z = 7;
            for (int j = 1; j <= 3; j++) {
                System.out.printf("I=%d J=%d\n", i, z);

                z = z - 1;

            }

            i = i + 2;

        }
    }
}
