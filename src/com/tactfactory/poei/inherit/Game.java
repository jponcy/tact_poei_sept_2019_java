package com.tactfactory.poei.inherit;

import com.tactfactory.poei.bases.PlaybleClass;

public class Game {
    public static void main(String[] args) {
        Character c = new NonPlayableCharacter("toto", new Localisation("Grand Soren", 0, 100));
    }
}


class Localisation {
    private final String mapName;
    private final int posX;
    private final int posY;

    public Localisation(final String mapName, final int posX, final int posY) {
        this.mapName = mapName;
        this.posX = posX;
        this.posY = posY;
    }

    public String getMapName() {
        return mapName;
    }
    public int getPosX() {
        return posX;
    }
    public int getPosY() {
        return posY;
    }


}

class Character {

    private String name;

    private char sex;

    private int pv;

    private int pvMax;

    protected Character(String name, int pvMax) {
        this.name = name;
        this.pvMax = pvMax;
        this.pv = pvMax;
    }

    public String getName() {
        return this.name;
    }

    public boolean isAlive() {
        return this.pv > 0;
    }

    protected void setPv(int pv) {
        this.pv = pv;
    }

    public int getPv() {
        return this.pv;
    }

    public int getPvMax() {
        return this.pvMax;
    }
}

class NonPlayableCharacter extends Character {
    private Localisation localisation;

    public NonPlayableCharacter(String name, Localisation localisation) {
        super(name, 1);

        this.localisation = localisation;
    }

    public Localisation getLocalisation() {
        return localisation;
    }
}

class PlaybleCharacter extends Character {

    private int pm;

    private int pmMax;

    private PlaybleClass playbleClass;

    private int power;

    public PlaybleCharacter(PlaybleClass pClass, String name) {
        this(pClass, name, pClass.getPvBase());
    }

    public PlaybleCharacter(PlaybleClass pClass, String name, int pvMax) {
        this(pClass, name, pvMax, name.toLowerCase().contains("sasuke") ? 10 : 500 + name.length() * 3);
    }

    public PlaybleCharacter(PlaybleClass pClass, String name, int pvMax, int power) {
        super(name, pvMax);

        this.playbleClass = pClass;
        this.power = power;
    }

    public void hit(Character character) {
        character.setPv(character.getPv() - Math.max(0, this.power));
    }
}









abstract class A {
    abstract String toto();
}

abstract class B extends A {
}

abstract class C extends B {
    String toto() {
        return "titi";
    }
}

class D extends B {

    @Override
    String toto() {
        // TODO Auto-generated method stub
        return null;
    }
}
