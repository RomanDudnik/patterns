import interfaces.iMeteoSensor;
import interfaces.iSensorTemperature;
import meteo.Adapter;
import meteo.MeteoStore;
import sensors.MS200;
import sensors.ST500;

public class Main {
    public static void main(String[] args) {

        // рабочий вариант (старый датчик)
        MeteoStore meteoDB = new MeteoStore();
        iMeteoSensor oldSensor = new MS200(1);
        meteoDB.save(oldSensor);

        // Создание нового датчика (новый экземпляр интерфейса)
        iSensorTemperature newSensor = new ST500();
        // Создание адаптера под новый датчик
        Adapter adapterSensor = new Adapter(newSensor);
        meteoDB.save(adapterSensor);
    }
}