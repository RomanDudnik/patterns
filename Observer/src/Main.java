import Clients.Company;
import Managers.JobAgency;
import interfaces.iObserver;
import interfaces.iPublisher;

public class Main {
    public static void main(String[] args) {
        // Создание агентства по поиску сотрудников
        iPublisher jobAgency = new JobAgency();
        // Создание компаний, которая ищет сотрудников (являются клиентами агентства)
        Company google = new Company(jobAgency, "Google", 250000);
        Company yandex = new Company(jobAgency, "Google", 100000);

        // Создание новых пользователей (являются наблюдателями агентства)
        iObserver ivanov = new Observers.Master("Ivanov");
        iObserver petrov = new Observers.Student("Petrov");
        iObserver sidorov = new Observers.Junior("Sidorov");

        // Регистрация наблюдателя в агентстве
        jobAgency.regiserObserver(ivanov);
//        jobAgency.regiserObserver(petrov);
        jobAgency.regiserObserver(sidorov);

        // Рассылка предложений наблюдателям
        for (int i = 0; i < 5; i++) {
            google.needEmployee();
            yandex.needEmployee();
        }
    }
}