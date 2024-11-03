package sensors;

import interfaces.iMeteoSensor;

import java.time.LocalDateTime;

/**
 * Класс датчика MS200
 * Реализует интерфейс iMeteoSensor
 * "Старая версия" датчика - до введения адаптера
 */
public class MS200 implements iMeteoSensor {

    int id;

    public MS200(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Float getTemperature() {
        return (float) Math.random();
    }

    public Float getHumidity() {
        return (float) Math.random();
    }

    public Float getPressure() {
        return (float) Math.random();
    }

    public LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }
}
