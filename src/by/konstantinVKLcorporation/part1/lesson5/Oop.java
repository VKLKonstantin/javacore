package by.konstantinVKLcorporation.part1.lesson5;

/**
 *  Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
 *  Конструктор класса должен заполнять эти поля при создании объекта;
 *  Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
 *  Создать массив из 5 сотрудников
 *  С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */

public class Oop {
    public static void main(String[] args) {

        Worker[] worker = new Worker[5];

        worker[0] = new Worker("Ivanov Ivan", "Engineer",
                "ivivan1@mailbox.com", 892344312, 30000, 18);
        worker[1] = new Worker("Petrov Ivan", "Senior Engineer",
                "ivivan2@mailbox.com", 892312344, 30000, 25);
        worker[2] = new Worker("Ivanov Petr", "BigBoss",
                "ivivan3@mailbox.com", 892312446, 30000, 45);
        worker[3] = new Worker("Ivanov Konstantin", "Programmer",
                "ivivan4@mailbox.com", 892312312, 30000, 50);
        worker[4] = new Worker("Pavel Pavlovich", "Security",
                "ivivan5@mailbox.com", 892312312, 30000, 42);

        System.out.println(worker[0].setAge(12));

        for (int i = 0; i < worker.length; i++) {
            if (worker[i].getAge() > 40) {
                worker[i].printInformation();
            }

        }
    }

}
