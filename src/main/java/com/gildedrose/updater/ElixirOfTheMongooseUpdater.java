package com.gildedrose.updater;

import com.gildedrose.Item;

public class ElixirOfTheMongooseUpdater extends BaseItemUpdater {

    @Override
    public boolean isApplicable(Item item) {
        return "Elixir of the Mongoose".equals(item.name);
    }
}
