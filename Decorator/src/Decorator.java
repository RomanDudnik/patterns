/**
 * Класс "Декоратор"
 * Для добавления нового функционала к калькулятору
 */
public class Decorator implements iCalcuble {

    // Поле калькулятора через интерфейс iCalcuble
    private Calculator oldCalc;
    // Поле логгера
    private Logger logger;

    // Конструктор
    public Decorator(Calculator oldCalc, Logger logger) {
        this.oldCalc = oldCalc;
        this.logger = logger;
    }

    @Override
    public iCalcuble sum(int arg) {
        int firstArg = oldCalc.getResult();

        logger.log("Певое значение калькулятора: " + firstArg
                + " Начало вызова метода sum() с аргументом: " + arg);
        iCalcuble result = oldCalc.sum(arg);
        logger.log("Вызов метода sum() завершен");
        return result;
    }

    @Override
    public iCalcuble multi(int arg) {
        int firstArg = oldCalc.getResult();

        logger.log("Певое значение калькулятора: " + firstArg
                + " Начало вызова метода multi() с аргументом: " + arg);
        iCalcuble result = oldCalc.multi(arg);
        logger.log("Вызов метода multi() завершен");
        return result;
    }

    @Override
    public int getResult() {
        int result = oldCalc.getResult();
        logger.log("Вызов метода getResult(), результат: " + result);
        return result;
    }
}
