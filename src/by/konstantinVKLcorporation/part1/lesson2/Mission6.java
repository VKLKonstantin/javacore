package by.konstantinVKLcorporation.part1.lesson2;


//6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
//  если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры:
// checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана
// символами ||, эти символы в массив не входят.

import java.util.Arrays;

public class Mission6 {
    public static void main(String[] args) {
        int mass[] = {2, 2, 2, 1, 2, 2, 10, 1};  //new int[10];

       /* for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 7);
        }*/
        System.out.println(Arrays.toString(mass));
        System.out.println(checkBalance(mass));
    }

    public static boolean checkBalance(int a[]) {
        int sum_j = 0;
        int sum_i = 0;
        for (int i = 0; i < a.length; i++) {
            sum_i = sum_i + a[i];
            for (int j = i + 1; j < a.length; j++) {
                sum_j = sum_j + a[j];
            }
            if (sum_i == sum_j) {
                return true;
            }
            sum_j = 0;
        }
        return false;
    }
}
