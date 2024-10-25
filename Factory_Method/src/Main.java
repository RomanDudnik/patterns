import Fabric.GemGenerator;
import Fabric.GoldGenerator;
import Fabric.ItemGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Fabric Method - Фабричный метод (Fabric)
 * Порождающий паттерн, динамически создающий
 * необходимый класс по интерфейсу из семейства
 * классов
 */
public class Main {
    public static void main(String[] args) {
        // создаем экземпляр фабрики GoldGenerator
        ItemGenerator g1 = new GoldGenerator();
        // открываем предмет
        g1.openReward();

        List<ItemGenerator> genList = new ArrayList<>();
        genList.add(g1);
        genList.add(new GemGenerator());

        // выбираем случайную фабрику (добавляем рандомайзер)
        Random random = ThreadLocalRandom.current();

        // получаем случайную фабрику и открываем предмет рандомно.
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(2);
            genList.get(index).openReward();
        }

    }
}
