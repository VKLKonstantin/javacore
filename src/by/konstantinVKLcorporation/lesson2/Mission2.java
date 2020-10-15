package by.konstantinVKLcorporation.lesson2;

//2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

import java.util.Arrays;

public class Mission2 {
    public static void main(String[] args) {
        int mass[] = new int[8];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i * 3;
        }
        System.out.println(Arrays.toString(mass));
    }

}
