package com.glue.types;

import com.glue.Display;

public abstract class AbstractGlue {
    String name;
    String type;
    double price;
    int sizeInMillilitres;
    int curingTimeInMinutes;
    boolean adheresToPlastic;
    boolean adheresToWood;
    boolean adheresToMetal;
    boolean adheresToGlass;
    boolean adheresToPottery;
    //private Display display;

    public AbstractGlue(String name, String type, double price, int sizeInMillilitres, int curingTimeInMinutes, boolean adheresToPlastic, boolean adheresToWood, boolean adheresToMetal, boolean adheresToGlass, boolean adheresToPottery) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.sizeInMillilitres = sizeInMillilitres;
        this.curingTimeInMinutes = curingTimeInMinutes;
        this.adheresToPlastic = adheresToPlastic;
        this.adheresToWood = adheresToWood;
        this.adheresToMetal = adheresToMetal;
        this.adheresToGlass = adheresToGlass;
        this.adheresToPottery = adheresToPottery;
    }

    public void display(Display display) {
//        display.print(name, type, price, sizeInMillilitres, curingTimeInMinutes, adheresToPlastic, adheresToWood, adheresToMetal, adheresToGlass, adheresToPottery);
    }
}
