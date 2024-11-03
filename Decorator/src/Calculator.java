/**
 * Класс "Калькулятор"
 * Имплементирует интерфейс iCalcuble
 */

public final class Calculator implements iCalcuble {

    // Поле для хранения результата
    private int primaryArg;

    // Конструктор
    public Calculator(int primaryArg) {
        this.primaryArg = primaryArg;
    }

    // Метод подсчета суммы
    @Override
    public iCalcuble sum(int arg) {
        primaryArg += arg;
        return this;
    }

    // Метод подсчета умножения
    @Override
    public iCalcuble multi(int arg) {
        primaryArg *= arg;
        return this;
    }

    // Метод получения результата
    @Override
    public int getResult() {
        return primaryArg;
    }
}
