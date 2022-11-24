package com.gildedrose.item;

public class Item {

    public String name;

    public int sellIn;
    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void updateValue() {
        if (sellIn <= 0 && quality > 1) {
            quality -= 2;
        } else if (quality > 0) {
            quality--;
        }
        sellIn--;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
