package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    String backstageName = "Backstage passes to a TAFKAL80ETC concert";
    String agedbrieName = "Aged Brie";
    String sulfurasName = "Sulfuras, Hand of Ragnaros";
    int sulfurasQuality = 80;

    private void doTest(String name, int sellin, int quality, int expected) {
        Item item = new Item(name, sellin, quality);
        Item[] items = new Item[] { item };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(expected, app.items[0].quality);
    }

    @Test
    void backstageIncreaseQualityByOne() {
        doTest(backstageName, 15, 20, 21);
    }

    @Test
    void backstageIncreaseQualityByTwo() {
        doTest(backstageName, 10, 20, 22);
    }

    @Test
    void backstageIncreaseQualityByThree() {
        doTest(backstageName, 5, 20, 23);
    }

    @Test
    void backstageQualityDropsToZeroAfterConcert() {
        doTest(backstageName, 0, 20, 0);
    }

    @Test
    void backstageQualityShouldNotExceedFifty() {
        doTest(backstageName, 20, 50, 50);
    }

    @Test
    void agedBrieIncreaseQualityByOne_FifteenDaysRemaining() {
        doTest(agedbrieName, 15, 20, 21);
    }

    @Test
    void agedBrieIncreaseQualityByOne_TenDaysRemaining() {
        doTest(agedbrieName, 10, 20, 21);
    }

    @Test
    void agedBrieIncreaseQualityByOne_FiveDaysRemaining() {
        doTest(agedbrieName, 5, 20, 21);
    }

    @Test
    void agedBrieIncreaseQualityByTwo_ZeroDaysRemaining() {
        doTest(agedbrieName, 0, 20, 22);
    }

    @Test
    void agedBrieQualityShouldNotExceedFifty() {
        doTest(agedbrieName, 20, 50, 50);
    }

    @Test
    void sulfurasQualityDoesNotAlter_FifteenDaysRemaining() {
        doTest(sulfurasName, 15, sulfurasQuality, 80);
    }

    @Test
    void sulfurasQualityDoesNotAlter_TenDaysRemaining() {
        doTest(sulfurasName, 10, sulfurasQuality, 80);
    }

    @Test
    void sulfurasQualityDoesNotAlter_FiveDaysRemaining() {
        doTest(sulfurasName, 5, sulfurasQuality, 80);
    }

}
