package com.gildedrose;

import com.gildedrose.item.*;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[] {
                new Plus5DexterityVest(10, 20), //
                new AgedBrie(2, 0), //
                new ElixirOfTheMongoose( 5, 7), //
                new SulfurasHandOfRagnaros(0), //
                new SulfurasHandOfRagnaros( -1),
                new BackstagePassesToTafkal80EtcConcert( 15, 20),
                new BackstagePassesToTafkal80EtcConcert( 10, 49),
                new BackstagePassesToTafkal80EtcConcert( 5, 49),
                // this conjured item does not work properly yet
                new ConjuredManaCake( 3, 6) };

        GildedRose app = new GildedRose(items);

        int days = 9;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}
