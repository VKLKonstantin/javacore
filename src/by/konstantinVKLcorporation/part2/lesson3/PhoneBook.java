package by.konstantinVKLcorporation.part2.lesson3;


import java.util.*;

/**
 * 2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
 * * В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер
 * * телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
 * * тогда при запросе такой фамилии должны выводиться все телефоны.
 * *
 */


public class PhoneBook {

    public static void main(String[] args) {
        HashMap<Integer, String> phoneBook = new HashMap<>();
        phoneBook.put(111222333, "Ivanov");
        phoneBook.put(111222334, "Petrov");
        phoneBook.put(111222335, "Ivanov");
        phoneBook.put(111222336, "Kalinin");
        phoneBook.put(111222337, "Alex");
        phoneBook.put(111222338, "Ivanov");


        get(phoneBook, "Alex");

        add(phoneBook, 14187615, "Kira");

        get(phoneBook, "Kira");

    }


    public static void add(HashMap<Integer, String> phoneBook, int number, String name) {

        phoneBook.put(number, name);
    }


    public static void get(HashMap<Integer, String> phoneBook, String name) {

        for (Map.Entry<Integer, String> search : phoneBook.entrySet()) {
            if (search.getValue().equals(name)) {
                System.out.println(search.getKey());
            }
        }

    }


}
