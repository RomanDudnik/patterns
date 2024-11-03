package meteo;

import interfaces.iMeteoSensor;
import interfaces.iSensorTemperature;

import java.time.LocalDateTime;

/**
 * Класс адаптера
 * Для работы с новым датчиком
 * Имплементирует интерфейс iMeteoSensor (старая логика)
 * Адаптирует методы iMetoSensor для работы с новой логикой iSensorTemperature
 */
public class Adapter implements iMeteoSensor {

    // Адаптируемый датчик
    private iSensorTemperature adaptee;

    // Конструктор
    public Adapter(iSensorTemperature s) {
        this.adaptee = s;
    }

    @Override
    public int getId() {
        return adaptee.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float) adaptee.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime dateTime = LocalDateTime.of(adaptee.year(), 1, 1, 0, 0);
        dateTime = dateTime.plusDays(adaptee.day() - 1);
        dateTime = dateTime.plusSeconds(adaptee.second());
        return dateTime;
    }
}
