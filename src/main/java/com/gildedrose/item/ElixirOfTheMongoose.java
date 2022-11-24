package com.gildedrose.item;

import com.gildedrose.Item;

public class ElixirOfTheMongoose extends ItemUpdater {

    @Override
    public boolean isApplicable(Item item) {
        return "Elixir of the Mongoose".equals(item.name);
    }
}
