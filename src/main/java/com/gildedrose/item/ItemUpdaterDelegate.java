package com.gildedrose.item;

import com.gildedrose.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemUpdaterDelegate {

    private final List<ItemUpdater> itemUpdaterList = new ArrayList<>();

    public ItemUpdaterDelegate() {
        itemUpdaterList.add(new Plus5DexterityVest());
        itemUpdaterList.add(new SulfurasHandOfRagnaros());
        itemUpdaterList.add(new ElixirOfTheMongoose());
        itemUpdaterList.add(new ConjuredManaCake());
        itemUpdaterList.add(new BackstagePassesToTafkal80EtcConcert());
        itemUpdaterList.add(new AgedBrie());
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
