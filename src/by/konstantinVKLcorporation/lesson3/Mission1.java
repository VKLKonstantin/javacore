package by.konstantinVKLcorporation.lesson3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
 * При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
 * После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
 */

public class Mission1 {

    public static int life = 3;//количество жизней
    public static int vvod;//вводимое число

    public static void main(String[] args) throws IOException {
        play();
        while (true) {
            int random = (int) (Math.random() * 10);

            if (vvod == random) {
                System.out.println("Вы угадали!!!");
                end();
            }
            if (vvod < random) {
                System.out.println("Ваше число меньше");
                life--;
                next_play();
            }

            if (vvod > random) {
                System.out.println("Ваше число больше");
                life--;
                next_play();
            }
        }
    }

    public static void play() throws IOException {//метод ввода
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число:");
        vvod = Integer.parseInt(reader.readLine());
    }

    public static void next_play() throws IOException {//метод продолжения игры если остались жизни
        if (life != 0) {
            play();
        } else {
            System.out.println("Вы проиграли");
            end();
        }
    }

    public static void end() throws IOException {//метод повторения игры или завершения
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int answer = Integer.parseInt(reader.readLine());
        switch (answer) {
            case 1:
                play();
                life = 3;
                break;
            case 0:
                System.exit(0);
                break;
        }
    }
}
