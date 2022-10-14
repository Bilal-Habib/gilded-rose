package com.gildedrose;

public class BackstagePass implements ItemInterface {

    private final Item item;
    public BackstagePass(Item item) {
        this.item = item;
    }

    @Override
    public void update() {
        updateQuality();
        updateSellIn();
    }

    private void updateQuality() {
        if (item.sellIn > 10) item.quality += 1;
        else if (item.sellIn > 5) item.quality += 2;
        else if (item.sellIn > 0) item.quality += 3;
        else item.quality = 0;
    }

    private void updateSellIn() {
        item.sellIn -= 1;
    }

}
