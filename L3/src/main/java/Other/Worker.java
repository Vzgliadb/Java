package Other;

import java.util.Random;
import Other.WorkerInterface;
public class Worker implements WorkerInterface {
    public Worker() {}
        public String name;
        public String surname;
        public String patronymic;
        public int age;
        public int experience;
        public int salary;
        public static int num = 1;
        public int id;

    @Override
    public Worker makeWorker(){
        Random random = new Random();

        String[] names = {"Alecsei","Ivan", "Petr", "Luka", "Simeon", "Mark", "Nikolay"};
        String[] surnames = {"Tyrov","Ivanov", "Petrov", "Domov", "Semenov", "Markov", "Nikolaev"};
        String[] patronymics = {"Mikhailovich", "Ivanovich", "Petrovich", "Timofeich", "Semenovich", "Markovich", "Nikolaevich"};

        int randomNameNum = random.nextInt(names.length);
        int randomSurnameNum = random.nextInt(surnames.length);
        int randomPatronymicNum = random.nextInt(patronymics.length);

        id = num++;
        surname = surnames[randomSurnameNum];
        name = names[randomNameNum];
        patronymic = patronymics[randomPatronymicNum];

        final int minValue = 18;

        final int ageBoundary = 50;
        age = minValue + random.nextInt(ageBoundary);

        int expBoundary = 20;
        experience = random.nextInt(expBoundary);

        final int wageBoundary = 150;
        salary = (minValue + random.nextInt(wageBoundary)) * 1000;

        return new Worker(id, surname, name, patronymic, age, experience, salary);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", age=" + age +
                ", exp=" + experience +
                ", wage=" + salary +
                '}';
    }

    public Worker(int id, String surname, String name, String patronymic, int age, int experience, int salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.age = age;
        this.experience = experience;
        this.salary = salary;
        this.id = id;

    }


}