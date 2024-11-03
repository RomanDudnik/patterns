
public class Main {
    public static void main(String[] args) {
        // Создаем переменную типа iCalcuble и присваиваем ей экземпляр класса Calculator
        iCalcuble calc = new Calculator(0);
        // Cоздаем экземпляр класса Decorator и передаем ему экземпляр класса Calculator
        Decorator newCalc = new Decorator(new Calculator(0), new Logger());

        // Создаем экземпляр класса ViewCalculator и передаем ему экземпляр класса Calculator
        ViewCalculator viewCalc = new ViewCalculator(newCalc);
        // Запускаем пользовательский интерфейс
        viewCalc.run();
    }
}