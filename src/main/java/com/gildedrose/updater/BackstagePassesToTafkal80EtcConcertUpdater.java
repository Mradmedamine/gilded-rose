package com.gildedrose.updater;

import com.gildedrose.Item;

public class BackstagePassesToTafkal80EtcConcertUpdater extends BaseItemUpdater {

    @Override
    public void updateValue(Item item) {
        if (item.quality < MAX_QUALITY) {
            item.quality++;
        }
        if (item.sellIn < 11 && item.quality < MAX_QUALITY) {
            item.quality++;
        }
        if (item.sellIn < 6 && item.quality < MAX_QUALITY) {
            item.quality++;
        }
        if (item.sellIn <= 0) {
            item.quality = 0;
        }
        item.sellIn--;
    }

    @Override
    public boolean isApplicable(Item item) {
        return "Backstage passes to a TAFKAL80ETC concert".equals(item.name);
    }
}
