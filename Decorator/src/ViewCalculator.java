import java.util.Scanner;

/**
 * Класс пользовательского интерфейса
 * Для взаимодействия с калькулятором
 */
public class ViewCalculator {

    // Поле калькулятора через интерфейс iCalcuble
    private iCalcuble calculator;

    // Конструктор
    public ViewCalculator(iCalcuble calculator) {
        this.calculator = calculator;
    }

    // Метод запуска пользовательского интерфейса калькулятора
    public void run() {
        while (true) {
            int primaryArg = promptInt("Введите первое число: ");
            calculator.sum(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (+, *, =): ");
                if (cmd.equals("+")) {
                    int arg = promptInt("Введите второе число: ");
                    calculator.sum(primaryArg);
                    continue;
                } else if (cmd.equals("*")) {
                    int arg = promptInt("Введите второе число: ");
                    calculator.multi(primaryArg);
                    continue;
                } else if (cmd.equals("=")) {
                    int result = calculator.getResult();
                    System.out.println("Результат: " + result);
                    break;
                }
            }
            String cmd = prompt("Хотите продолжить? (y/n): ");
            if (cmd.equals("y")) {
                continue;
            }
            break;
        }
    }

    // Метод ввода строк
    private String prompt(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        return scanner.nextLine();
    }

    // Метод ввода числа
    private int promptInt(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        return Integer.parseInt(scanner.nextLine());
    }
}
