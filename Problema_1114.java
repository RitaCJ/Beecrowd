import java.util.Scanner;

public class Problema_1114 {
    public static void main(String[] args) {
        int num = 1;

        Scanner input = new Scanner(System.in);

        do {
            num = input.nextInt();

            if (num != 2002) {
                System.out.println("Senha Invalida");
            } else if (num == 2002) {
                System.out.println("Acesso Permitido");
            }

        } while (num != 2002);

    }
}
