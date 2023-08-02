import java.util.Scanner;

public class Problema_1049 {
    public static void main(String[] args) {
        String word1, word2, word3;

        Scanner input = new Scanner(System.in);

        word1 = input.nextLine();
        word2 = input.nextLine();
        word3 = input.nextLine();

        if (word1.equalsIgnoreCase("vertebrado")) {
            if (word2.equalsIgnoreCase("ave")) {
                if (word3.equalsIgnoreCase("carnivoro")) {
                    System.out.println("aguia");

                } else {
                    if (word3.equalsIgnoreCase("onivoro")) {
                        System.out.println("pomba");
                    }
                }
            } else {
                if (word2.equalsIgnoreCase("mamifero")) {
                    if (word3.equalsIgnoreCase("onivoro")) {
                        System.out.println("homem");
                    } else {
                        if (word3.equalsIgnoreCase("herbivoro")) {
                            System.out.println("vaca");
                        }
                    }
                }

            }
        } else {
            if (word1.equalsIgnoreCase("invertebrado")) {
                if (word2.equalsIgnoreCase("inseto")) {
                    if (word3.equalsIgnoreCase("hematofago")) {
                        System.out.println("pulga");

                    } else {
                        if (word3.equalsIgnoreCase("herbivoro")) {
                            System.out.println("lagarta");
                        }
                    }
                } else {
                    if (word2.equalsIgnoreCase("anelideo")) {
                        if (word3.equalsIgnoreCase("hematofago")) {
                            System.out.println("sanguessuga");
                        } else {
                            if (word3.equalsIgnoreCase("onivoro")) {
                                System.out.println("minhoca");
                            }
                        }
                    }
                }
            }
        }

    }
}
