package com.gildedrose.item;

import com.gildedrose.Item;

public class ConjuredManaCake extends ItemUpdater {

    @Override
    public boolean isApplicable(Item item) {
        return "Conjured Mana Cake".equals(item.name);
    }
}
