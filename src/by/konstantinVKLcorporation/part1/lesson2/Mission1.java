package by.konstantinVKLcorporation.part1.lesson2;

import java.util.Arrays;

//1. Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

public class Mission1 {
    public static void main(String[] args) {

        int mass[] = {0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 0) {
                mass[i] = 1;
            }
            else {
                mass[i] = 0;
            }
        }
        System.out.println(Arrays.toString(mass));
    }
}























