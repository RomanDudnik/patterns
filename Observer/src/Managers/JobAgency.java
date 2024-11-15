package Managers;

import interfaces.iObserver;
import interfaces.iPublisher;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализация рассылки наблюдателям
 * Класс JobAgency реализует интерфейс iPublisher и
 * представляет собой агентство по поиску сотрудников.
 * Его основная функция - рассылать предложения о работе наблюдателям,
 * которые зарегистрировались в агентстве.
 * Publisher(Managers) - публикация ресурсов
 * @see iPublisher
 */
public class JobAgency implements iPublisher {
    /**
     * Список наблюдателей,
     * которые зарегистрировались в агентстве.
     */
    List<iObserver> observers = new ArrayList<>();

    /**
     * Зарегистрировать наблюдателя
     * @param observer
     */
    @Override
    public void registerObserver(iObserver observer) {
        observers.add(observer);
    }

    /**
     * Удалить наблюдателя
     * @param observer
     */
    @Override
    public void removeObserver(iObserver observer) {
        observers.remove(observer);
    }

    /**
     * Рассылка предложений наблюдателям
     * @param nameCompany
     * @param salary
     */
    @Override
    public void sendOffer(String nameCompany, int salary) {
        for (iObserver observer : observers) {
            observer.receiveOffer(nameCompany, salary);
        }
    }
}
