package com.gildedrose.updater;

import com.gildedrose.Item;

public class ConjuredManaCakeUpdater extends BaseItemUpdater {

    @Override
    public boolean isApplicable(Item item) {
        return "Conjured Mana Cake".equals(item.name);
    }
}
