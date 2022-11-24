package com.gildedrose.updater;

import com.gildedrose.Item;

public abstract class BaseItemUpdater implements ItemUpdater {

    protected static final Integer MAX_QUALITY = 50;
    protected static final Integer MIN_QUALITY = 0;

    public void updateValue(Item item) {
        if (item.sellIn <= 0 && item.quality > 1) {
            item.quality -= 2;
        } else if (item.quality > MIN_QUALITY) {
            item.quality--;
        }
        item.sellIn--;
    }

}
