package com.gildedrose.updater;

import com.gildedrose.Item;

public class Plus5DexterityVestUpdater extends BaseItemUpdater {

    @Override
    public boolean isApplicable(Item item) {
        return "+5 Dexterity Vest".equals(item.name);
    }
}
