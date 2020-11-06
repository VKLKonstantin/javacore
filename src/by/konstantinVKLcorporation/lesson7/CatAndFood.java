package by.konstantinVKLcorporation.lesson7;


/**
 * 1. Расширить задачу про котов и тарелки с едой
 * 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20)
 * 3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true
 * 4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
 * 5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль
 * 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
 */
public class CatAndFood {

    private static Cat[] cat = new Cat[6];
    private static Plate[] plates = new Plate[5];
    private static String[] name = {"Barsik", "Mursik", "Kirilich", "Kotofi", "IvanIvanovich", "Borisich"};
    private static int countCat;

    public static void main(String[] args) {

        createCats();
        createPlates();
        catComToPlate();


    }


    public static void createCats() {//создание котов
        for (int i = 0; i < cat.length; i++) {
            cat[i] = new Cat(name[i], i + 5, false);
            System.out.println(cat[i]);
        }
    }

    public static void createPlates() {//создание тарелок
        for (int i = 0; i < plates.length; i++) {
            int capacityForPlates = (int) (Math.random() * 6) + 1;
            plates[i] = new Plate(capacityForPlates);
            System.out.println(plates[i]);
        }
    }

    public static void catComToPlate() {
        for (int countPlate = 0; countPlate < plates.length && countCat < cat.length; ) {


            while ((cat[countCat].isFullness() == false) && (countPlate < plates.length && countCat < cat.length)) {
                int resultEat = cat[countCat].eat(plates[countPlate], cat[countCat].getAppetite());//остаток аппетита кота
                if (resultEat > 0) {//если аппетит остался - следующая тарелка
                    countPlate++;
                } else if (resultEat == 0) {//кот сыт и тарелка пуста

                    cat[countCat].setFullness(true);
                    System.out.println(cat[countCat].getName() + " поел " + cat[countCat].isFullness());
                    countCat++;//следующий кот
                    countPlate++;//следующая тарелка


                } else {//если осталась еда
                    cat[countCat].setFullness(true);
                    System.out.println(cat[countCat].getName() + " поел " + cat[countCat].isFullness());
                    countCat++;//то идет следующий кот


                }

            }


        }
    }
}




