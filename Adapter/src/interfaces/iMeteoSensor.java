package interfaces;

import java.time.LocalDateTime;

/**
 * Интерфейс iMeteoSensor
 * Методы получения данных от датчика метеостанции
 * Рабочая версия проекта под старый датчик
 */
public interface iMeteoSensor {
    /**
     * Метод получения идентификатора датчика
     * @return
     */
    int getId();     // идентификатор датчика

    /**
     * Метод получения температуры датчика
     * @return
     */
    Float getTemperature(); // температура датчика

    /**
     * Метод получения влажности датчика
     * @return
     */
    Float getHumidity(); // влажность датчика

    /**
     * Метод получения давления датчика
     * @return
     */
    Float getPressure(); // давление датчика

    /**
     * Метод получения даты и времени датчика
     * @return
     */
    LocalDateTime getDateTime(); // дата и время датчика
}
