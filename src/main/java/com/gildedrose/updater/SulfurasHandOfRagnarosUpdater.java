package com.gildedrose.updater;

import com.gildedrose.Item;

public class SulfurasHandOfRagnarosUpdater extends BaseItemUpdater {

    @Override
    public void updateValue(Item item) {
        //DO NOTHING
    }

    @Override
    public boolean isApplicable(Item item) {
        return "Sulfuras, Hand of Ragnaros".equals(item.name);
    }
}
