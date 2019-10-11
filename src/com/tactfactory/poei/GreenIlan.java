package com.tactfactory.poei;

public class GreenIlan {
    public static void main(String[] args) {
        PlaybleClass kikou = new PlaybleClass(300, "Kikou", false);
        PlaybleClass assassin = new PlaybleClass(1, "Assassin", false);

        PlaybleCharacter players[] = {
                new PlaybleCharacter(kikou, "DarkSasuke"),
                new PlaybleCharacter(kikou, "DarkSasukeDu35", 402),
                new PlaybleCharacter(kikou, "**Dark_**Dark#*Kill**Hextra**Sasuke2*", 21),
                new PlaybleCharacter(assassin, "Kiruas", 1500),
                new PlaybleCharacter(assassin, "Gon", 3000, 490)
        };

        for (PlaybleCharacter p : players) {
            p.hit(players[0]);
        }

        for (PlaybleCharacter pc : players) {
            String state;

            if (pc.isAlive()) {
                state = " a " + pc.getPv() + "/" + pc.getPvMax();
            } else {
                state = " est mort (mais il aura jouer déjà trop longtemps)";
            }

            System.out.println(pc.getName() + state);
        }
    }
}
