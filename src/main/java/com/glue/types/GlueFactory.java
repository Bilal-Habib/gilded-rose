package com.glue.types;

import com.glue.Display;

public class GlueFactory {

    public final static String superGlue = "Super Glue";
    public final static String woodGlue = "Wood Glue";
    public final static String prittstik = "Pritt Stick";

    public AbstractGlue make(String glueName, Display display) {

        return switch (glueName) {
            case superGlue -> createSuperGlue();
            case woodGlue -> createWoodGlue();
            case prittstik -> createPrittstik();
            default -> throw new IllegalArgumentException();
        };
    }

    private Prittstik createPrittstik() {
        return new Prittstik(
            "Pritt Stick",
            "Tube",
            2.50,
            160,
            5,
            false,
            true,
            false,
            false,
            false
        );
    }

    private WoodAbstractGlue createWoodGlue() {
        return new WoodAbstractGlue(
            "Wood Glue",
            "Bottle",
            10.50,
            500,
            60,
            false,
            true,
            false,
            false,
            false
        );
    }

    private SuperAbstractGlue createSuperGlue() {
        return new SuperAbstractGlue(
            "Super Glue",
            "Metal",
            5.5,
            100,
            30,
            true,
            true,
            true,
            true,
            true);
    }

}
