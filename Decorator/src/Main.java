
public class Main {
    public static void main(String[] args) {
        // Создаем переменную типа iCalcuble и присваиваем ей экземпляр класса Calculator
        iCalcuble calc = new Calculator(0);
        // Создаем экземпляр класса ViewCalculator и передаем ему экземпляр класса Calculator
        ViewCalculator viewCalc = new ViewCalculator(calc);
        // Запускаем пользовательский интерфейс
        viewCalc.run();
    }
}