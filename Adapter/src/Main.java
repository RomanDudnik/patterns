import interfaces.iMeteoSensor;
import meteo.MeteoStore;
import sensors.MS200;

public class Main {
    public static void main(String[] args) {

        MeteoStore meteoDB = new MeteoStore();
        iMeteoSensor oldSensor = new MS200(1);

        meteoDB.save(oldSensor);
    }
}