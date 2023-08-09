public class Problema_1097 {
    public static void main(String[] args) {

        int i = 1, j = 7, x;

        while (i <= 9) {
            x = j;

            for (int z = 1; z <= 3; z++) {

                System.out.printf("I=%d J=%d\n", i, j);
                j = j - 1;

            }

            j = x + 2;

            i = i + 2;

        }
    }
}
