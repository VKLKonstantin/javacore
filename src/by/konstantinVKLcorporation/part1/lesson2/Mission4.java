package by.konstantinVKLcorporation.part1.lesson2;


// 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
//  заполнить его диагональные элементы единицами;

import java.util.Arrays;

public class Mission4 {
    public static void main(String[] args) {
        int mass[][] = new int[5][5];

        for (int i = 0, j = 0; i < mass.length; i++, j++) {
            mass[i][j] = 1;
        }
        for (int i = 0, j = mass.length - 1; i < mass.length; i++, j--) {
            mass[i][j] = 1;
        }

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.printf("%5d ", mass[i][j]);
            }
            System.out.println();
        }
    }
}

