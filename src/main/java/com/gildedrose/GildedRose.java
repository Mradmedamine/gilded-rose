package com.gildedrose;

import com.gildedrose.item.ItemUpdaterDelegate;

class GildedRose {
    Item[] items;
    private ItemUpdaterDelegate itemUpdaterDelegate;

    public GildedRose(Item[] items, ItemUpdaterDelegate itemUpdaterDelegate) {
        this.items = items;
        this.itemUpdaterDelegate = itemUpdaterDelegate;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            itemUpdaterDelegate.updateItemQuality(items[i]);
        }
    }
}
