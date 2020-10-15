package by.konstantinVKLcorporation.lesson2;


//7. **** Написать метод, которому на вход подается одномерный массив и число n
// (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
// Для усложнения задачи нельзя пользоваться вспомогательными массивами.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Mission7 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите n");
        int n = Integer.parseInt(reader.readLine());
        int mass[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int remainder = mass.length / n; //количество целых перестановок
        if (n > mass.length) {
            n = n - mass.length;
        }
        System.out.println(Arrays.toString(change(mass, n, remainder)));
    }

    public static int[] change(int[] a, int n, int remainder) {//сдвиг элементов массива для случая когда длина массива равна n
        int i = 0;
        int copy_n = n;
        if (copy_n > 0) {
            while (copy_n > 0) {
                int buff = a[i];
                a[i] = a[a.length - copy_n];
                a[a.length - copy_n] = buff;
                copy_n--;
                i++;
            }

        }
        if ((a.length - copy_n > 0 && remainder > 1) || (remainder == 1 && (a.length - n) % 2 == 0)) { //вызов метода для случая когда n больше длины массива на два порядка
            //или когда отаток от деления 2 разности длины массива и n=0
            correct(a, n, remainder);
        }

        return a;

    }

    public static int[] correct(int a[], int n, int remainder) {//метод для случая когда n больше длины массива
        int corr = a.length - n;
        int i = 0;
        int copy_n = n;
        int remainder_new = 1;
        while (corr > 0) {
            i = i + n;
            if (remainder_new == remainder) {
                return correct_two(a, n);

            }
            while (copy_n > 0 && i < a.length) {
                int buff = a[i];
                a[i] = a[a.length - copy_n];
                a[a.length - copy_n] = buff;
                copy_n--;
                i++;
            }
            corr = corr - n;
            copy_n = n;
            remainder_new++;
        }
        return a;
    }

    public static int[] correct_two(int a[], int n) {//метод для сортировки остатка массива
        for (int i = (a.length / n) * n; i < a.length - 1; i++) {
            int buff = a[i];
            a[i] = a[a.length - 1];
            a[a.length - 1] = buff;
        }
        return a;
    }


}

