package by.konstantinVKLcorporation.lesson1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
 * 2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
 * 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
 * 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
 * 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
 * 6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
 * 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
 * 8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        int b = 8;
        double z = 9.88;
        float n = 9.9f;
        char c = 'c';
        byte m = 127;
        short v = 32767;
        long l = 922337806;
        boolean p = true;
        String s = "Hello";


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку");
        String k = reader.readLine();
        System.out.println("введите целое число 1");
        int a1 = Integer.parseInt(reader.readLine());
        System.out.println("введите целое число 2");
        int a2 = Integer.parseInt(reader.readLine());
        System.out.println("введите целое число 3");
        int a3 = Integer.parseInt(reader.readLine());
        System.out.println("введите целое число 4");
        int a4 = Integer.parseInt(reader.readLine());

        name(k);
        System.out.println(formula(a1, a2, a3, a4));
        System.out.println(band(a1, a2));
        System.out.println(positive_negative(a1));

        leap_year(a1);
    }

    public static double formula(int a, int b, int c, int d) {//метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат
        double result = (a * (b + (c / d)));
        return result;
    }

    public static boolean band(int a, int b) { //метод, принимающий на вход два числа, и проверяющий что их сумма лежит
        // в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }

    }

    public static String positive_negative(int a) { //метод, которому в качестве параметра передается целое число,
        // метод должен напечатать в консоль положительное ли число передали, или отрицательное

        String s1 = "Число положительное";
        String s2 = "Число отрицательное";
        if (a >= 0) {
            return s1;
        } else {
            return s2;
        }
    }

    public static boolean negative(int a) {//метод, которому в качестве параметра передается целое число, метод должен вернуть true,
        // если число отрицательное
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void name(String s) {        //Написать метод, которому в качестве параметра передается строка, обозначающая имя,
        // метод должен вывести в консоль сообщение «Привет, указанное_имя!

        System.out.println("Привет, " + s + "!");

    }

    public static void leap_year(int year) {//метод, который определяет является ли год високосным, и выводит сообщение в консоль
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                System.out.println("год невисокосный");
            } else {
                System.out.println("год високосный");
            }
        } else {
            System.out.println("год невисокосный");
        }

    }

}
