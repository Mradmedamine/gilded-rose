package com.gildedrose.updater;

import com.gildedrose.Item;

public interface ItemUpdater {

    void updateValue(Item item);

    boolean isApplicable(Item item);
}
