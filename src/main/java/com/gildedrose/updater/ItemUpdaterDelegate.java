package com.gildedrose.updater;

import com.gildedrose.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemUpdaterDelegate {

    private final List<ItemUpdater> itemUpdaterList = new ArrayList<>();

    public ItemUpdaterDelegate() {
        itemUpdaterList.add(new Plus5DexterityVestUpdater());
        itemUpdaterList.add(new SulfurasHandOfRagnarosUpdater());
        itemUpdaterList.add(new ElixirOfTheMongooseUpdater());
        itemUpdaterList.add(new ConjuredManaCakeUpdater());
        itemUpdaterList.add(new BackstagePassesToTafkal80EtcConcertUpdater());
        itemUpdaterList.add(new AgedBrieUpdater());
    }

    public void updateItemQuality(Item item) {
        getApplicableUpdater(item).updateValue(item);
    }

    private ItemUpdater getApplicableUpdater(Item item) {
        return itemUpdaterList.stream().filter(updater -> updater.isApplicable(item))
            .reduce((a, b) -> {
                throw new IllegalStateException("Multiple implementations for item " + item.name);
            })
            .orElseThrow(() -> new IllegalStateException("No implementation for item " + item.name));
    }
}
