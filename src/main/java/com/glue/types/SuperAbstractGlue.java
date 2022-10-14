package com.glue.types;

import com.glue.Display;

class SuperAbstractGlue extends AbstractGlue {

    public SuperAbstractGlue(
                             String name,
                             String type,
                             double price,
                             int sizeInMillilitres,
                             int curingTimeInMinutes,
                             boolean adheresToPlastic,
                             boolean adheresToWood,
                             boolean adheresToMetal,
                             boolean adheresToGlass,
                             boolean adheresToPottery) {
        super(name, type, price, sizeInMillilitres, curingTimeInMinutes, adheresToPlastic, adheresToWood, adheresToMetal, adheresToGlass, adheresToPottery);
    }
}
