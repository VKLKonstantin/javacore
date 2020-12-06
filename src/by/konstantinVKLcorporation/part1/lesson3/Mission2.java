package by.konstantinVKLcorporation.part1.lesson3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Создать массив из слов String[] words
 * При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
 * сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
 * Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
 */

public class Mission2 {
    public static String vvod;
    public static String computer;

    public static void main(String[] args) throws IOException {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        while (true) {
            enter();
            random(words);
            compare();
            end();
        }
    }

    public static void enter() throws IOException { //метод для ввода слов
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите слово:");
        vvod = reader.readLine();

    }

    public static void random(String[] words) {//метод генерации случайного слова из массива
        int p = words.length;
        int magic = (int) (Math.random() * p);
        computer = words[magic];
    }

    public static void compare() throws IOException {// метод сравнения
        if (vvod.equals(computer)) {
            System.out.println("Вы абсолютно правы!!!");
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            end();
        }
        System.out.println("Вы не угадали");
        while (!vvod.equals(computer)) {
            litera();
            System.out.println();
            enter();
        }
        System.out.println("Вы догадались!!!!!!");

    }

    public static void end() throws IOException {//метод повторения игры или завершения
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int answer = Integer.parseInt(reader.readLine());
        switch (answer) {
            case 1:
                enter();
                break;
            case 0:
                System.exit(0);
                break;
        }
    }

    public static void litera() {//метод посимвольного сравнения
        char[] vvod_mass = new char[vvod.length()];
        char[] computer_mass = new char[computer.length()];
        int count = 0;

        for (int i = 0; i < vvod_mass.length; i++) {
            vvod_mass[i] = vvod.charAt(i);
        }
        for (int i = 0; i < computer_mass.length; i++) {
            computer_mass[i] = computer.charAt(i);
        }

        for (int i = 0, j = 0; i < vvod_mass.length && j < computer_mass.length; i++, j++) {

            if (vvod_mass[i] == computer_mass[j]) {
                System.out.print(vvod_mass[i]);
                count++;
            } else {
                System.out.print('#');
                count++;
            }
        }
        while (count <= 15) {
            System.out.print('#');
            count++;
        }
    }
}
