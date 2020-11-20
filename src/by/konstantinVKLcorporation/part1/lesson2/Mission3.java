package by.konstantinVKLcorporation.part1.lesson2;

//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

import java.util.Arrays;

public class Mission3 {
    public static void main(String[] args) {
        int mass[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < 6) {
                mass[i] = mass[i] * 2;
            }
        }
        System.out.println(Arrays.toString(mass));
    }
}
