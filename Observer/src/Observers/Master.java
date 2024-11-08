package Observers;

import interfaces.iObserver;

import java.util.Random;
/**
 * Класс Master реализует интерфейс iObserver
 * Профи, ищет хорошую высокооплачиваемую работу
 * Observers - потребители ресурсов
 */
public class Master implements iObserver {
    // Имя
    private String name;
    // Конструктор
    public Master(String name) {
        this.name = name;
    }

    /**
     * Метод получения уведомления о предложении
     * Реализован на основе запроса зарплаты
     * @param nameCompany
     * @param salary
     */
    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (salary < 180000) {
            System.out.println(String.format("Master %s: I am waiting for the better job! (company, salary) = %s, %d", name, nameCompany, salary));
        }
        else {
            System.out.println(String.format("Master %s: Ok. I'm ready for this job! (company, salary) = %s, %d", name, nameCompany, salary));
        }
    }
}
