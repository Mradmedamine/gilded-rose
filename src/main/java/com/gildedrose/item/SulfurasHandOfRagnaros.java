package com.gildedrose.item;

import com.gildedrose.Item;

public class SulfurasHandOfRagnaros extends ItemUpdater {

    @Override
    public void updateValue(Item item) {
        //DO NOTHING
    }

    @Override
    public boolean isApplicable(Item item) {
        return "Sulfuras, Hand of Ragnaros".equals(item.name);
    }
}
