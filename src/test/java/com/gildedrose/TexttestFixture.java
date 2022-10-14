package com.gildedrose;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TexttestFixture {

    @Test
    void test() throws IOException {
        StringBuilder consoleOutput = getThirtyDayOutput();

        Path filePath = Paths.get("src/test/java/texttests/ThirtyDays/stdout.gr");
        String stdOutput = Files.readString(filePath);

        assertEquals(stdOutput, consoleOutput.toString());
    }

    private static StringBuilder getThirtyDayOutput() {
        StringBuilder consoleOutput = new StringBuilder();
        consoleOutput.append("OMGHAI!");

        Item[] items = new Item[]{
            new Item("+5 Dexterity Vest", 10, 20), //
            new Item("Aged Brie", 2, 0), //
            new Item("Elixir of the Mongoose", 5, 7), //
            new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
            new Item("Sulfuras, Hand of Ragnaros", -1, 80),
            new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
            // this conjured item does not work properly yet
            new Item("Conjured Mana Cake", 3, 6)};

        GildedRose app = new GildedRose(items);

        int days = 31;

        for (int i = 0; i < days; i++) {
            consoleOutput.append("\n-------- day ").append(i).append(" --------");
            consoleOutput.append("\nname, sellIn, quality");
            for (Item item : items) {
                consoleOutput.append("\n").append(item);
            }
            consoleOutput.append("\n");
            app.updateQuality();
        }
        consoleOutput.append("\n");
        return consoleOutput;
    }

}
