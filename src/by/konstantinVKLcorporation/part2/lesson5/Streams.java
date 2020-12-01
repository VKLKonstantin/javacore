package by.konstantinVKLcorporation.part2.lesson5;


import java.util.Arrays;

/**
 * Необходимо написать два метода, которые делают следующее:
 * 1) Создают одномерный длинный массив, например:
 * static final int SIZE = 10 000 000;
 * static final int HALF = size / 2;
 * float[] arr = new float[size];
 * 2) Заполняют этот массив единицами.
 * 3) Засекают время выполнения: long a = System.currentTimeMillis().
 * 4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
 * <p>
 * arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
 * <p>
 * 5) Проверяется время окончания метода System.currentTimeMillis().
 * 6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a).
 * <p>
 * Отличие первого метода от второго:
 * Первый просто бежит по массиву и вычисляет значения.
 * Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и потом склеивает эти массивы обратно в один.
 * <p>
 * Пример деления одного массива на два:
 * System.arraycopy(arr, 0, a1, 0, h);
 * System.arraycopy(arr, h, a2, 0, h).
 * <p>
 * Пример обратной склейки:
 * System.arraycopy(a1, 0, arr, 0, h);
 * System.arraycopy(a2, 0, arr, h, h).
 * <p>
 * Примечание:
 * System.arraycopy() — копирует данные из одного массива в другой:
 * System.arraycopy(массив-источник, откуда начинаем брать данные из массива-источника, массив-назначение, откуда начинаем записывать данные в массив-назначение, сколько ячеек копируем)
 * По замерам времени:
 * Для первого метода надо считать время только на цикл расчета:
 * for (int i = 0; i < size; i++) {
 * arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
 * }
 * <p>
 * Для второго метода замеряете время разбивки массива на 2, просчета каждого из двух массивов и склейки.
 */
public class Streams {

    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;
    public static float[] arr;
    public static float[] firstPart;
    public static float[] secondPart;

    public static void main(String[] args) {
        arr = new float[SIZE];
        firstPart = new float[HALF];
        secondPart = new float[HALF];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) 1;
        }
        long start = System.currentTimeMillis();
        firstMethod(arr);
        long end = System.currentTimeMillis();

        System.out.println(end - start);


        long start2 = System.currentTimeMillis();

        System.arraycopy(arr, 0, firstPart, 0, HALF);
        System.arraycopy(arr, HALF, secondPart, 0, HALF);

        Thread thread1 = new Thread(() -> secondMethod(firstPart));
        Thread thread2 = new Thread(() -> secondMethod(secondPart));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(firstPart, 0, arr, 0, HALF);
        System.arraycopy(secondPart, 0, arr, HALF, HALF);
        long end2 = System.currentTimeMillis();

        System.out.println(end2 - start2);
    }

    public static void firstMethod(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    public static void secondMethod(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + (i + HALF) / 5) * Math.cos(0.2f + (i + HALF) / 5) * Math.cos(0.4f + (i + HALF) / 2));

        }

    }


}
