package interfaces;

/**
 * Наблюдатель (будет получать уведомления)
 * В данном случае - человек ищущий работу,
 * получает уведомление о предложении от рекрутингового агенства
 */
public interface iObserver {
    /**
     * Метод получения уведомления о предложении
     * @param nameCompany
     * @param salary
     */
    void receiveOffer(String nameCompany, int salary);
}
