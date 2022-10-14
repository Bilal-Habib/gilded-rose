package com.glue;

import com.glue.types.GlueFactory;

public class Demo {
    public static void main(String[] args) {
        try {
            var glueFactory = new GlueFactory();
            var consoleDisplay = new ConsoleDisplay();

            var superGlue = glueFactory.make(GlueFactory.superGlue, consoleDisplay);
            var woodGlue = glueFactory.make(GlueFactory.woodGlue, consoleDisplay);
            var pritstikGlue = glueFactory.make(GlueFactory.prittstik, consoleDisplay);
//            var glueErr = glueFactory.getGlue("Random Stick", selectedDisplay);

            superGlue.display(consoleDisplay);
            woodGlue.display(consoleDisplay);
            pritstikGlue.display(consoleDisplay);
//            glueErr.display(display);
        } catch (Exception e) {
            System.out.println("Error: Glue Type Not Found");
        }
    }
}
