package Observers;

import interfaces.iObserver;

import java.util.Random;

/**
 * Класс Junior реализует интерфейс iObserver
 * Джуниор, который ищет работу подбрасывая монетку (Random)
 * Observers - потребители ресурсов
 */
public class Junior implements iObserver {
    // Имя
    private String name;
    // Конструктор
    public Junior(String name) {
        this.name = name;
    }

    /**
     * Метод получения уведомления о предложении
     * Реализован Рандомный выбор предложения
     * @param nameCompany
     * @param salary
     */
    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (new Random().nextBoolean()) {
            System.out.println(String.format("Junior %s: I need this work! (company, salary) = %s, %d", name, nameCompany, salary));
        }
        else {
            System.out.println(String.format("Junior %s: I got better job! (company, salary) = %s, %d", name, nameCompany, salary));
        }
    }
}
