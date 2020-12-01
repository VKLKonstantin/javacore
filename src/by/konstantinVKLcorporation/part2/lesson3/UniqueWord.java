package by.konstantinVKLcorporation.part2.lesson3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 1. Создать массив с набором слов (10-20 слов, среди которых должны встречаться повторяющиеся). Найти и вывести список
 * уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.
 *
 */
public class UniqueWord {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Alfa");
        list.add("Romeo");
        list.add("Mercedes");
        list.add("BMW");
        list.add("Geely");
        list.add("Alfa");
        list.add("Golf");
        list.add("Romeo");
        list.add("Jaguar");
        list.add("Alfa");
        list.add("Mercedes");
        list.add("BMW");
        list.add("Alfa");
        list.add("Jaguar");
        System.out.println(list);

        Set<String> words = new HashSet<>(list);//список уникальных слов
        System.out.println(words);

            Iterator<String> uniWord = words.iterator();//проход по Set
        while (uniWord.hasNext()) {
            int count = 0;
            String bufferList = null;//элемент ArrayList
            String bufferSet = uniWord.next();//элемент HashSet
            for (int i = 0; i < list.size(); i++) {
                bufferList = list.get(i);
                if (bufferSet.equals(bufferList)) {
                    count++;
                }
            }
            System.out.println(bufferSet + " повторяется " + count + " раз");

        }


    }
}

