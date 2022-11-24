package com.gildedrose.item;

public class BackstagePassesToTafkal80EtcConcert extends Item {

    public BackstagePassesToTafkal80EtcConcert(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void updateValue() {
        if (quality < 50) {
            quality++;
        }
        if (sellIn < 11 && quality < 50) {
            quality++;
        }
        if (sellIn < 6 && quality < 50) {
            quality++;
        }
        if (sellIn <= 0) {
            quality = 0;
        }
        sellIn--;
    }

}
