package com.tactfactory.poei.bases;

public class PlaybleClass {
    private int pvBase;

    private String name;

    private boolean magick;

    public PlaybleClass(int pvBase, String name) {
        this(pvBase, name, false);
    }

    public PlaybleClass(int pvBase, String name, boolean magick) {
        this.pvBase = pvBase;
        this.magick = magick;
        this.name = name;
    }

    public int getPvBase() {
        return pvBase;
    }

//    public void setPvBase(int pvBase) {
//        this.pvBase = pvBase;
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public boolean isMagick() {
        return magick;
    }

//    public void setMagick(boolean magick) {
//        this.magick = magick;
//    }
}
