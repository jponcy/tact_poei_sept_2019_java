package com.tactfactory.poei.bases;

import java.text.MessageFormat;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * TP 1 -- variables + conditions.
 *
 * 1) Créer un programme initialisant une variable contenant 42 et l'affichant en console.
 * 2) Créer un programme initialisant 2 variables entières et affichant le produit des deux (a * b).
 * 3) Créer un programme initialisant 2 variables puis inverse leur contenu.
 * 4) Créer un programme demandant à l'utilisateur de saisir un entier
 * 5) Créer un programme qui :
 *    • demande à l'utilisateur de saisir son nom (de famille)
 *    • demande à l'utilisateur de saisir son prénom
 *    • affiche à l'utilisateur 'Bonjour <nom> <prenom>' où <nom> et <prenom> seront remplacés par les valeurs
 *      préalablement saisies
 * 6) Créer un programme qui :
 *    • demande à l'utilisateur de saisir un nombre
 *    • on affichera à l'utilisateur si son nombre est supérieur à 0, égal ou inférieur
 * 7) Écrire deux algorithmes (if / switch) qui demandera l'âge d'un enfant, et retournera sa catégorie en suivant
 *    les règles suivants :
 *    • de 6 à 7 ans => Poussin
 *    • de 8 à 9 ans => Pupille
 *    • de 10 à 11 ans => Minime
 *    • 12 ans ou plus => Cadet
 * 8) Écrire un algorithme donnant l'heure qu'il sera dans 1 minute. Le déroulé attendu est le suivant :
 *    • le programme lit au clavier l'heure (heure + minute)
 *    • le programme calcul l'heure qu'il sera dans 1 minute
 *    • le programme affiche le résultat
 *    Exemple :
 *    • l'utilisateur tape 13 puis 21
 *    • l'algorithme réponds : "Dans une minute, il sera 13 heure(s) 22"
 */
public class TP1Et2 {

    public static void main(String[] args) {
        exo8();
    }

    private static void exo8() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Heure (sans les minutes) ?");
        int hour = scanner.nextInt();
        System.out.println("Minutes ?");
        int min = scanner.nextInt();

        if (min == 59) {
            min = 0;

            if (hour == 23) {
                hour = 0;
            } else {
//                hour = hour + 1;
//                hour += 1;
//                hour++;
                ++hour;
            }
        } else {
//            min = min + 1;
            ++min;
        }

        System.out.println("Dans une minute il sera exactement, et précisément, attention tu va être impressionné : "
                + hour + ":" + (min + 1));
    }

    private static void exo7() {
        System.out.println("Saisir l'âge d'un enfant");
        int age = new Scanner(System.in).nextInt();
        String category;

        // If
//        if (age == 6 || age == 7) {
//        if (age > 5 && age < 8) {
//        if (age >= 6 && age <= 8) {
        if (age < 6) {
            category = "Trop tôt";
        } else if (age < 8) {
            category = "Poussin";
        } else if (age < 10) {
            category = "Pupille";
        } else if (age < 12) {
            category = "Minime";
        } else {
            category = "Cadet";
        }

        // Switch
        if (age < 6) {
            category = "Trop tôt";
        } else {
            switch (age) {
            case 6:
            case 7:
                category = "Poussin";
                break;
            case 8:
            case 9:
                category = "Pupille";
                break;
            case 10:
            case 11:
                category = "Minime";
                break;
            default:
                category = "Cadet";
                break;
            }
        }

        System.out.format("La classification d'un enfant de %d an%s est \"%s\"\n", age, (age > 1 ? "s" : ""), category);
    }

    private static void exo6() {
        System.out.println("Saisir un entier :");
        int nb = new Scanner(System.in).nextInt();

        // If
        if (nb > 0) {
            System.out.println("Supérieur à 0");
        } else if (nb == 0) {
            System.out.println("Egal à 0");
        } else {
            System.out.println("Inférieur à 0");
        }

        // If avec variable.
        String msg;

        if (nb > 0) {
            msg = "Supérieur";
        } else if (nb == 0) {
            msg = "Egal";
        } else {
            msg = "Inférieur";
        }

        System.out.println(msg + " à 0");

        // Ternaire
        // condition ? siVrai : siFaux
        String msgTernaire = nb > 0
                ? "Supérieur"
                : (nb == 0 ? "Egal" : "Inférieur");
        System.out.println(msgTernaire + " à 0");
    }

    private static int maxIf(int a, int b) {
        int result;

        if (a > b) {
            result = a;
        } else {
            result = b;
        }

        return result;
    }

    private static int maxIf2(int a, int b) {
        int result = b;

        if (a > b) {
            result = a;
        }

        return result;
    }

    private static int maxTer(int a, int b) {
        return a > b ? a : b;
    }

    private static void exo5() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nom :");
        String lastname = scanner.nextLine();
        System.out.println("Prénom :");
        String firstname = scanner.nextLine();

        System.out.println("Bonjour " + lastname + " " + firstname);
    }

    private static void exo4() {
        System.out.println("Merci de saisir un entier :");
        int fill = fillInt();
    }

    private static void exo3() {
        int a = 42;
        int b = 1;
        int temp = a;
        a = b;
        b = temp;
    }

    private static void exo2() {
        int a = 4;
        int b = 34231;

        // Plusieurs appels
        System.out.print(a);
        System.out.print(" * ");
        System.out.print(b);
        System.out.print(" = ");
        System.out.print(a * b);

        // Concatenations
        System.out.println("Produit de " + a + " avec " + b + " = " + (a * b));

        // Builder.
        final StringBuilder builder = new StringBuilder();
        builder.append(a);
        builder.append(" * ");
        builder.append(b);
        builder.append(" = ");
        builder.append(a * b);
        System.out.println(builder);

        // Syso + String.format.
        String msg = String.format("%d * %d = %d", a, b, a * b);
        System.out.println(msg);

        // Equivalent de la precedente mais lus court dans notre cas.
        System.out.format("%d * %d = %d\n", a, b, a * b);

        // Message format.
        System.out.println(MessageFormat.format("{0} * {1} = {2}", a, b, a * b));
    }

    private static void exo1() {
        int i = 42;
//        float f = 42;
//        String s = "42";

        System.out.println(i);
    }

    /** Génère et retourne un entier. */
    public static int fillInt() {
        return new Scanner(System.in).nextInt();
    }
}
