package Fabric;

import Interfaces.iGameItem;

/**
 * Прототип фабрики игровых предметов
 */
public abstract class ItemGenerator {
    // Поле прототипа фабрики игровых предметов
    public abstract iGameItem createItem();

    // Метод создания игрового предмета и его открытия
    public void openReward() {
        iGameItem gameItem = createItem();
        gameItem.open();
    }

}
