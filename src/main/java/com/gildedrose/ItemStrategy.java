package com.gildedrose;

import java.util.HashMap;
import java.util.Map;

public class ItemStrategy {
    private final Map<String, ItemInterface> nonStandardItemTypes = new HashMap<>();
    public static final String sulfurasName = "Sulfuras, Hand of Ragnaros";
    private final String agedBrie = "Aged Brie";
    private final String backstagePass = "Backstage passes to a TAFKAL80ETC concert";

    public ItemStrategy(Item item) {
        nonStandardItemTypes.put(sulfurasName, new Sulfuras());
        nonStandardItemTypes.put(agedBrie, new AgedBrie(item));
        nonStandardItemTypes.put(backstagePass, new BackstagePass(item));
    }

    public ItemInterface getItemType(Item item) {
        return nonStandardItemTypes.getOrDefault(item.name, new StandardItem(item));
    }

}
