import java.util.Scanner;

public class Problema_1131 {
    public static void main(String[] args) {
        int inter, gremio, x = 1, i = 0, j = 0, grenais = 0, empate = 0;

        Scanner input = new Scanner(System.in);

        while (x == 1) {
            if (x == 1) {
                inter = input.nextInt();
                gremio = input.nextInt();

                if (inter > gremio) {
                    i++;
                } else if (gremio > inter) {
                    j++;
                } else if (gremio == inter) {
                    empate++;
                }
                grenais++;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            x = input.nextInt();
        }

        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + i);
        System.out.println("Gremio:" + j);
        System.out.println("Impates:" + empate);

        if (i > j) {
            System.out.println("Inter venceu mais");
        } else if (j > i) {
            System.out.println("Gremio venceu mais");

        }

    }

}
