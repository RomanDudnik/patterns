package sensors;

import interfaces.iSensorTemperature;

import java.time.LocalDateTime;

/**
 * Класс датчика ST500
 * Реализует интерфейс iSensorTemperature
 * "Новая версия" датчика - после введения адаптера
 */
public class ST500 implements iSensorTemperature {
    @Override
    public int identifier() {
        return (int) Math.random();
    }

    @Override
    public double temperature() {
        return (double) Math.random();
    }

    @Override
    public int year() {
        return LocalDateTime.now().getYear();
    }

    @Override
    public int day() {
        return LocalDateTime.now().getDayOfYear();
    }

    @Override
    public int second() {
        LocalDateTime now = LocalDateTime.now();
        return now.getHour() * 3600 + now.getMinute() * 60 + now.getSecond();
    }
}
