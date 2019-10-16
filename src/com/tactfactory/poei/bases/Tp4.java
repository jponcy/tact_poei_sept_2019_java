package com.tactfactory.poei.bases;

import java.util.Scanner;

public class Tp4 {
    public static void main(String[] args) {
        exo6();
    }

    private static void exo6() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        float sum = 0;
        int last;

        do {
            System.out.println("Saisir un nombre");
            last = scanner.nextInt();

            if (last >= 0) {
                max = Math.max(max, last);
                min = Math.min(min, last);
                sum += last;
                counter++;

                System.out.format("N°%3d => max: %3d; min: %3d; average: %3.2f\n", counter, max, min, sum / counter);
            }
        } while(last >= 0 && counter <= 100);
    }

    private static void exo5() {
        System.out.println("Merci de saisir un chiffre");
        int tab[] = new int[new Scanner(System.in).nextInt()];

        for (int index = 0, valeur = tab.length; index < tab.length; index++, valeur--) {
            tab[index] = valeur;
        }
    }

    private static void remplacer() {
        System.out.println(remplacer("Bonjour", "jour", "soir") + " <= Bonsoir");
        System.out.println(remplacer("J’ai horreur des espaces", " ", "_") + " <= J’ai_horreur_des_espaces");
        System.out.println(remplacer("Moi, je m'en moque, je suis intouchable !", "y", "titi")
                + " <= Moi, je m'en moque, je suis intouchable !");
    }

    private static String remplacer(String origin, String search, String replacement) {
        return origin.replaceAll(search, replacement);
    }

    private static String remplacer2(String origin, String search, String replacement) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < origin.length()) {
            char c = origin.charAt(i);

            if (c == search.charAt(0) && commencePar(origin.substring(i), search)) {
                i += search.length();
                sb.append(replacement);
                // continue;
            } else {
                sb.append(c);
                ++i;
            }
        }

        return sb.toString();
    }

    private static boolean commencePar(String substring, String search) {
        boolean result = true;

        if (search.length() >= substring.length()) {
            int i = 0;

            while (i < search.length() && result) {
                if (substring.charAt(i) != search.charAt(i)) {
                    result = false;
                } else {
                    i++;
                }
            }
        } else {
            result = false;
        }

        return result;
    }

    private static String remplacer1(String origin, String search, String replacement) {
        String result = origin; // FIXME:....
        int pos;

//        while ((pos = result.indexOf(search)) != -1) {
//        }

        do {
            pos = result.indexOf(search);

            if (pos != -1) {
                result = result.substring(0, pos) + replacement + result.substring(pos + search.length());
            }
        } while (pos != -1);

        return result;
    }

    private static void purge() {
        System.out.println("Bonjour sans o => " + purge("Bonjour", 'o'));
        System.out.println("J'ai ho... => " + purge("J’ai horreur des espaces", ' '));
        System.out.println("Moi, je m'en moque, je suis intouchable ! inchangé => "
                + purge("Moi, je m'en moque, je suis intouchable ! ", 'y'));
    }

    private static String purge(String origin, char toRemove) {
        return purge3(origin, toRemove);
    }

    private static String purge1(String origin, char toRemove) {
        String result = "";

        for (char c : origin.toCharArray()) {
            if (c != toRemove) {
                result += c;
            }
        }

        return result;
    }

    private static String purge2(String origin, char toRemove) {
        String result = "";

        for (int i = 0; i < origin.length(); i++) {
            char c = origin.charAt(i);

            if (c != toRemove) {
                result += c;
            }
        }

        return result;
    }

    private static String purge3(String origin, char toRemove) {
        char result[] = new char[origin.length()];
        int counter = 0;

        for (char c : origin.toCharArray()) {
            if (c != toRemove) {
                result[counter++] = c;
            }
        }

//        char res[] = new char[counter];
//
//        for (int i = 0; i < counter; i++) {
//            res[i] = result[i];
//        }

        return new String(result);
    }

    private static String purge4(String origin, char toRemove) {
        return remplacer(origin, String.valueOf(toRemove), "");
    }


    private static void exo2() {
        int tab1[] = {4, 8, 7, 9, 1, 5, 4};
        int tab2[] = {7, 6, 5, 2, 1, 3, 7};
        int schtroumpf = 0;

        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab2.length; j++) {
                schtroumpf += tab1[i] * tab2[j];
            }
        }
        // Ou en utilisant l'itérateur.
//        for (int valTab1 : tab1) {
//            for (int valTab2 : tab2) {
//                schtroumpf += valTab1 * valTab2;
//            }
//        }

        System.out.println("Le schtroumpf est de " + schtroumpf);
    }

    private static void exo1() {
        int tab1[] = {4, 8, 7, 9, 1, 5, 4};
        int tab2[] = {7, 6, 5, 2, 1, 3, 7};

        int res[] = new int[tab1.length];

        for (int i = 0; i < tab1.length; i++) {
            res[i] = tab1[i] + tab2[i];
        }
    }
}
