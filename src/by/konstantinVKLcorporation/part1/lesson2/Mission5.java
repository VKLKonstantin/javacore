package by.konstantinVKLcorporation.part1.lesson2;


//5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

import java.util.Arrays;

public class Mission5 {
    public static void main(String[] args) {

        int mass[] = new int[10];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 40);
        }

        int max = mass[0];
        int min = mass[0];

        for (int i = 0; i < mass.length; i++) {

            if (mass[i] > max) {
                max = mass[i];
            }
            if (mass[i] < min) {
                min = mass[i];
            }
        }

        System.out.println(Arrays.toString(mass));
        System.out.println(max);
        System.out.println(min);
    }
}
