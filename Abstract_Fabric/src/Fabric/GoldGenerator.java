package Fabric;

import Interfaces.iGameItem;
import Product.GoldReward;

/**
 * Фабрика GoldReward
 */
public class GoldGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new GoldReward();
    }
}
