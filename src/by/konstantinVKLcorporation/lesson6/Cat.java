package by.konstantinVKLcorporation.lesson6;

public class Cat extends Animal {

    private int distanceCat;
    private double heightCat;

    public Cat() {
        distanceCat = (int) (Math.random() * 201) + 300;
        heightCat = (double) (Math.random() * 5) + 1;
    }


    @Override
    public boolean runnig(int distance) {

        if (distance <= distanceCat && distance > 0) {
            System.out.println("Кошка пробежит дистанцию");
            return true;
        } else {
            System.out.println("Кошка не пробежит дистанцию");
            return false;
        }

    }

    @Override
    public boolean swim(int duration) {
        System.out.println("Кошки не плавают");
        return false;
    }

    @Override
    public boolean jump(double height) {

        if (height <= heightCat && height > 0) {
            System.out.println("Кошка прыгнет");
            return true;

        } else {
            System.out.println("Кошка не допрыгнет");
            return false;
        }


    }


}
