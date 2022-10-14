package com.gildedrose;

public class StandardItem implements ItemInterface {

    private final Item item;

    public StandardItem(Item item) {
        this.item = item;
    }

    @Override
    public void update() {
        updateQuality();
        updateSellIn();
    }

    private void updateSellIn() {
        item.sellIn -= 1;
    }

    private void updateQuality() {
        if (item.sellIn <= 0) {
            item.quality -= 2;
        } else {
            item.quality -= 1;
        }
    }
}
