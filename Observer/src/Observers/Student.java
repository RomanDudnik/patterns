package Observers;

import interfaces.iObserver;

/**
 * Класс Student реализует интерфейс iObserver
 * Студент, цепляется за любую работу, которая лучше текущей
 * Observers - потребители ресурсов
 */
public class Student implements iObserver {
    // Имя
    String name;
    int salary;
    // Конструктор
    public Student(String name){
        this.name = name;
        salary = 0;
    }

    /**
     * Метод получения уведомления о предложении
     * Студент постоянно ищет где лучше
     * @param nameCompany
     * @param salary
     */
    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary < salary) {
            System.out.println(String.format("Student %s: I need this work! (company, salary) = %s, %d", name, nameCompany, salary));
            this.salary = salary;
        }
        else{
            System.out.println(String.format("Student %s: I got better job! (company, salary) = %s, %d", name, nameCompany, salary));
        }
    }
}
