package com.glue;

public class ConsoleDisplay implements Display {
    @Override
    public void print(String name, String type, double price, int sizeInMillilitres, int curingTimeInMinutes, boolean adheresToPlastic, boolean adheresToWood, boolean adheresToMetal, boolean adheresToGlass, boolean adheresToPottery) {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Size In Millilitres: " + sizeInMillilitres);
        System.out.println("Curing Time In Minutes: " + curingTimeInMinutes);
        System.out.println("Adheres To Plastic: " + adheresToPlastic);
        System.out.println("Adheres To Wood: " + adheresToWood);
        System.out.println("Adheres To Metal: " + adheresToMetal);
        System.out.println("Adheres To Glass: " + adheresToGlass);
        System.out.println("Adheres To Pottery: " + adheresToPottery);
        System.out.println();
    }
}
