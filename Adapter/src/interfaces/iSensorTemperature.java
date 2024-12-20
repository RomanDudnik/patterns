package interfaces;

/**
 * Интерфейс датчика температуры
 * Новая версия датчика - после введения адаптера
 */
public interface iSensorTemperature {
    /**
     * Метод получения идентификатора датчика
     * @return
     */
    int identifier();   // идентификатор датчика

    /**
     * Метод получения температуры с датчика
     * @return
     */
    double temperature();   // температура с датчика

    /**
     * Метод получения года
     * @return
     */
    int year(); // год

    /**
     * Метод получения дня года
     * @return
     */
    int day();  // день

    /**
     * Метод получения секунды дня
     * @return
     */
    int second();   // секунда
}
