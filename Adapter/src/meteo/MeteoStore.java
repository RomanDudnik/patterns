package meteo;

import interfaces.iMeteoSensor;

/**
 * Класс хранилища метеоданных
 */
public class MeteoStore {

    // сохранение данных в базу
    public boolean save(iMeteoSensor sensor) {
        System.out.format("Saving data from sensor [%d] at %s%n temperature = %f, humidity = %f, pressure = %f%n",
                sensor.getId(),
                sensor.getDateTime(),
                sensor.getTemperature(),
                sensor.getHumidity(),
                sensor.getPressure());
        return true;
    }
}
