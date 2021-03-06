/*
 * Dice heroes is a turn based rpg-strategy game where characters are dice.
 * Copyright (C) 2016 Vladislav Protsenko
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.vlaaad.dice.game.config.purchases;

import com.badlogic.gdx.utils.ObjectMap;

/**
 * Created 30.10.13 by vlaaad
 */
public class PurchaseData {

    private static ObjectMap<String, PurchaseInfo> purchaseInfo = new ObjectMap<String, PurchaseInfo>();

    static {
        add(new ItemPurchaseInfo("coin", 100, true, 0));
        add(new ItemPurchaseInfo("coin", 500, false, 0));
        add(new ItemPurchaseInfo("coin", 1000, false, 10));
        add(new ItemPurchaseInfo("coin", 2500, false, 30));
        add(new DonatePurchaseInfo("donation"));
    }

    private static void add(PurchaseInfo info) {
        purchaseInfo.put(info.skuName(), info);
    }

    public static PurchaseInfo get(String sku) {
        return purchaseInfo.get(sku);
    }

    public static ObjectMap.Keys<String> skus() {
        return purchaseInfo.keys();
    }

    public static ObjectMap.Values<PurchaseInfo> infos() {
        return purchaseInfo.values();
    }
}
