package Clients;

import interfaces.iPublisher;

import java.util.Random;

/**
 * Компания, которая ищет сотрудников.
 * Будет давать команду агентству
 */
public class Company {
    /**
     * Объект, который реализует интерфейс iPublisher.
     * Этот объект будет использоваться для отправки команд агентству по поиску сотрудников.
     */
    iPublisher jobAgency;

    /**
     * Название компании
     */
    String nameCompany;

    /**
     * Random для генерации случайных чисел
     */
    Random rnd;

    /**
     * Максимальная зарплата,
     * которую компания может предложить сотруднику.
     */
    int maxSalary;

    /**
     * Конструктор класса
     * Компания работает с определённым агентством
     * @param jobAgency
     * @param nameCompany
     * @param maxSalary
     */
    public Company(iPublisher jobAgency, String nameCompany, int maxSalary) {
        this.jobAgency = jobAgency;
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        rnd = new Random();
    }

    /**
     * Метод будет вызываться, когда компания нуждается в сотруднике.
     *  В методе генерируется случайная зарплата в диапазоне от 0 до maxSalary
     *  и отправляется команда агентству по поиску сотрудников через объект jobAgency.
     *  Команда отправляется методом sendOffer, который принимает два параметра:
     *  название компании и зарплату.
     */
    public void needEmployee() {
        int salary = rnd.nextInt(maxSalary);
        jobAgency.sendOffer(nameCompany, salary);
    }
}
