package by.konstantinVKLcorporation.lesson6;

public class Cat extends Animal {

    private final int DISTANCE = 200;
    private final double HEIGHT = 2;

    public Cat() {

    }

    @Override
    public boolean runnig(int distance) {

        if (distance <= DISTANCE && distance > 0) {
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

        if (height <= HEIGHT && height > 0) {
            System.out.println("Кошка прыгнет");
            return true;

        } else {
            System.out.println("Кошка не допрыгнет");
            return false;
        }


    }


}
