package by.konstantinVKLcorporation.part2.lesson2;

public class MyArrayDataException extends Throwable {
    public MyArrayDataException(String s) {
        super("Неверный тип данных" + s);
    }
}
