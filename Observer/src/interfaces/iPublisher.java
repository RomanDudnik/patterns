package interfaces;

/**
 * Интерфейс рассылки наблюдателям.
 * Может регистрировать наблюдателей, удалить их и отправлять сообщения
 */
public interface iPublisher {
    /**
     * Зарегистрировать наблюдателя
     * @param observer
     */
    void regiserObserver(iObserver observer);

    /**
     * Удалить наблюдателя
     * @param observer
     */
    void removeObserver(iObserver observer);

    /**
     * Рассылка наблюдателям
     * @param nameCompany
     * @param salary
     */
    void sendOffer(String nameCompany, int salary);
}
