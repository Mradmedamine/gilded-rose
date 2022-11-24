package com.gildedrose.item;

import com.gildedrose.Item;

public class Plus5DexterityVest extends ItemUpdater {

    @Override
    public boolean isApplicable(Item item) {
        return "+5 Dexterity Vest".equals(item.name);
    }
}
