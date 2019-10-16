package com.tactfactory.poei.inherit;

import java.util.LinkedList;
import java.util.List;

interface SaitParler {
    /*public abstract */String parler();

    String getNom();
}

class Robot implements SaitParler {

    @Override
    public String parler() {
        return "Eveee!!!!";
    }

    @Override
    public String getNom() {
        return "Wall-e";
    }
}

public abstract class Animal implements SaitParler {
    String nom;
    String couleur;
    String race;

    @Override
    public String getNom() {
        return this.nom;
    }

//    public abstract String parler();
}

class Chat extends Animal {

    @Override
    public String parler() {
        return this.miauler();
    }

    public String miauler() {
        return "miaou !!";
    }
}

class Chien extends Animal {

    @Override
    public String parler() {
        return "Wouf!";
    }

    @Override
    public String toString() {
//        return this.getName() + " a " + this.getEmployees().size() + " employé"
//                + (this.getEmployees().size() > 2 ? "s" : "");
        return "coucou";
    }
}




class Element {
    private Object value;
    private Element next;
}


class Toto {
    public static void main(String[] args) {
        Chat sassi = new Chat();

        sassi.couleur = "gris";
        sassi.nom = "sassi";
        sassi.race = "persan";

        sassi.miauler();


        Animal phoebus = new Chien();

        phoebus.couleur = "marron";
        phoebus.nom = "Phoebus";
        phoebus.race = "Boxer";


        List<SaitParler> animals = new LinkedList<>();

        animals.add(sassi);
        animals.add(phoebus);
        animals.add(new Robot());

        for (SaitParler a : animals) {
            System.out.println(a.getNom() + " => " + a.parler());
        }






        Chat chat = new Chat();
        Animal animal = new Chat();
        SaitParler sait = new Chat();
//        Chien c3 = new Chat();

        if (sait instanceof Animal) {
            ((Chat) sait).miauler();
        } else {
            System.out.println("Pas un chat");
        }

        if (sait.getClass().getName().equals(Animal.class.getName())) {

        }




        Animal c3 = new Chat();


        Chat c3_2 = (Chat) c3;

        ((Chat) c3).miauler();
    }
}
