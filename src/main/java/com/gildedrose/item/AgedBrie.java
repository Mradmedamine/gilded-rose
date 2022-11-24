package com.gildedrose.item;

import com.gildedrose.Item;

public class AgedBrie extends ItemUpdater {

    @Override
    public void updateValue(Item item) {
        if (item.quality < MAX_QUALITY) {
            item.quality++;
        }
        if (item.sellIn <= 0 && item.quality < MAX_QUALITY) {
            item.quality++;
        }
        item.sellIn--;
    }

    @Override
    public boolean isApplicable(Item item) {
        return "Aged Brie".equals(item.name);
    }
}
