package com.tactfactory.poei.bases;

import java.util.Scanner;

public class Tp3 {

    public static void main(String[] args) {
        exo6Recursive();
    }

    private static void exo6Recursive() {
        long nb;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Saisir un nombre [1,20]");
            nb = scanner.nextLong();
        } while (nb < 1 || nb > 20);

        long fact = exo6Recursive(nb);

        System.out.println(nb + "! => " + fact);
    }

    private static long exo6Recursive(long nb) {
//        long result;
//
//        if (nb > 1) {
//            result = nb * exo6Recursive(nb - 1);
//        } else {
//            result = 1;
//        }
//
//        return result;

        return nb > 1 ? exo6Recursive(nb - 1) : 1;
    }

    private static void exo6For() {
        long nb;
        long fact;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Saisir un nombre [1,20]");
            nb = scanner.nextLong();
        } while (nb < 1 || nb > 20);

        fact = nb;

        for (long i = nb - 1; i >= 1; i--) {
            fact *= i;
        }

        System.out.println(nb + "! => " + fact);
    }

    private static void exo5StringBuilder() {
        System.out.println("Merci de saisir un mot");

        String word = new Scanner(System.in).nextLine();

        {
            StringBuilder builder = new StringBuilder(word);
            String reverse = builder.reverse().toString();

            if (word.equals(reverse)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Pas un palindrome");
            }
        }
        // Variante.
        System.out.format("%s %s un palindrome", word,
                (new StringBuilder(word).reverse().toString().equals(word) ? "est" : "n'est pas"));
    }

    private static void exo5Loop() {
        System.out.println("Merci de saisir un mot");
        String word = new Scanner(System.in).nextLine();

        boolean isPalindrom = true;

        // Il vaudrait mieux ne pas utiliser une boucle for car on ne connait pas d'avance le nombre exact
        // d'iterations.
        {
            int j;

            for (int i = 0; i <= word.length() / 2 && isPalindrom; i ++) {
                j = word.length() - 1 - i;

                isPalindrom = word.charAt(i) == word.charAt(j);
            }
        }

        // Variante boucle for.
        {
            for (int i = 0, j = word.length() - 1; i <= word.length() / 2 && isPalindrom; i ++, j --) {
                isPalindrom = word.charAt(i) == word.charAt(j);
            }
        }

        // Variante 2 boucle for.
        {
            for (int i = 0, j = word.length() - 1; i <= word.length() / 2
                    && (isPalindrom = word.charAt(i) == word.charAt(j)); i ++, j --);
        }

        // Variante while.
        {
            int i = 0;
            int j = word.length() - 1;

            while (isPalindrom && i < word.length() / 2) {
                isPalindrom = word.charAt(i) == word.charAt(j);
                // Ou.
//                if (word.charAt(i) != word.charAt(j)) {
//                    isPalindrom = false;
//                }

                i++;
                j--;
            }
        }

        System.out.format("Le mot \"%s\" %s un palindrome", word, (isPalindrom ? "est" : "n'est pas"));
    }

    private static void exo4() {
        Scanner scanner = new Scanner(System.in);

//        int max = scanner.nextInt();
        int max = Integer.MIN_VALUE;
//        Integer max = null;
        int newValue;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Merci de saisir le nombre n°" + i);
            newValue = scanner.nextInt();

            if (max < newValue) {
                max = newValue;
            }
        }
    }

    private static void exo3() {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.format("%d x %d = %d\n", i, j, j * i);
            }
        }
    }

    private static void exo2() {
        System.out.println("Merci de saisir un nombre");
        int nb = new Scanner(System.in).nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.format("%d x %d = %d\n", nb, i, nb * i);
        }
    }

    private static void exo1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Merci de saisir un nombre compris entre 1 et 3 :");
        int nb = scanner.nextInt();

        // if (nb == 1 || nb == 2 || nb == 3)
        // if (nb >= 1 && nb <= 3)

        while (nb < 1 || nb > 3) {
            System.out.println(nb + " n'est pas compris entre 1 et 3. Merci de retenter :");
            nb = scanner.nextInt();
        }
    }
}
