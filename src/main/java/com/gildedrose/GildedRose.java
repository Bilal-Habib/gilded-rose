package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            update(item);
        }
    }

    private void update(Item item) {
        getItemType(item).update();
        handleQualityBoundaryCases(item);
    }

    private void handleQualityBoundaryCases(Item item) {
        handleLowerBoundaryCase(item);
        handleUpperBoundaryCase(item);
    }

    private void handleLowerBoundaryCase(Item item) {
        if (item.quality < 0) {
            item.quality = 0;
        }
    }

    private void handleUpperBoundaryCase(Item item) {
        int highestValue = getHighestValue(item);
        if (item.quality > highestValue) {
            item.quality = highestValue;
        }
    }

    private ItemInterface getItemType(Item item) {
        return new ItemStrategy(item).getItemType(item);
    }

    public int getHighestValue(Item item) {
//        if not a legendary item, the highest value is 50
        int highestValue = 50;
        String sulfurasName = ItemStrategy.sulfurasName;
        if (item.name.equals(sulfurasName)) {
            highestValue = 80;
        }
        return highestValue;
    }

}
