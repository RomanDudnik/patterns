/**
 * Интерфейс iCalcuble
 * С методами подсчета
 */
public interface iCalcuble {
    /**
     * Метод подсчета суммы
     * @param arg
     * @return
     */
    iCalcuble sum(int arg);

    /**
     * Метод подсчета умножения
     * @param arg
     * @return
     */
    iCalcuble multi(int arg);

    /**
     * Метод получения результата
     * @return
     */
    int getResult();
}
