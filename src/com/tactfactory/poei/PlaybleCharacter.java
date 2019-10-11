package com.tactfactory.poei;

import java.time.LocalDate;

public class PlaybleCharacter {

    private String name;

    private char sex;

    private int pv;

    private int pvMax;

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
        this.playbleClass = pClass;
        this.name = name;
        this.pvMax = pvMax;
        this.pv = pvMax;
        this.power = power;
    }

    public void hit(PlaybleCharacter playbleCharacter) {
        playbleCharacter.pv -= Math.max(0, this.power);
    }

    public boolean isAlive() {
        return this.pv > 0;
    }

    public int getPv() {
        return this.pv;
    }

    public int getPvMax() {
        return this.pvMax;
    }

    public String getName() {
        return this.name;
    }
}
