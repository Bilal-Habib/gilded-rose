package com.gildedrose;

public class AgedBrie implements ItemInterface {

    final private Item item;

    public AgedBrie(Item item) {
        this.item = item;
    }

    @Override
    public void update() {
        updateQuality();
        updateSellIn();
    }

    private void updateQuality() {
        if (item.sellIn > 0) {
            item.quality += 1;
        } else {
            item.quality += 2;
        }
    }

    private void updateSellIn() {
        item.sellIn -= 1;
    }

}
