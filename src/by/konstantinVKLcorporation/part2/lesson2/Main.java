package by.konstantinVKLcorporation.part2.lesson2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4, при подаче массива другого размера
 * необходимо бросить исключение MyArraySizeException.
 * 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. Если в каком-то элементе
 * массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение
 * MyArrayDataException – с детализацией, в какой именно ячейке лежат неверные данные.
 * 3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException
 * и вывести результат расчета.
 */
public class Main {
    public static int n;
    public static int k;
    public static String[][] mas;

    public static void main(String[] args) {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Введите n");
            n = Integer.parseInt(reader.readLine());
            System.out.println("Введите k");
            k = Integer.parseInt(reader.readLine());
            mas = new String[n][k];
            populateMassive(mas, n, k);
            checkMas(n, k);
            System.out.println(parseInInteger(mas));

        } catch (MyArraySizeException e) {
            e.printStackTrace();
            System.out.println("не верный размер массива");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

    }

    public static void checkMas(int n, int k) throws MyArraySizeException {

        if (n != 4 || k != 4) {
            throw new MyArraySizeException();
        }

    }

    public static int parseInInteger(String[][] mas) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {


                try {
                    int a = Integer.parseInt(mas[i][j]);
                    sum += a;
                } catch (IllegalArgumentException e) {
                    String message = "в " + String.valueOf(n) + " строке, " + String.valueOf(k) + " ряду";
                    throw new MyArrayDataException(message);
                }
            }
        }
        return sum;
    }

    public static void populateMassive(String[][] mas, int n, int k) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = "1" + i;
            }
        }
    }
}
