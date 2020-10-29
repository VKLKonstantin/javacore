package by.konstantinVKLcorporation.lesson6;

public class Dog extends Animal {
    private final int DISTANCE = 500;
    private final int DURATION = 10;
    private final double HEIGHT = 0.5;

    public Dog() {
    }

    @Override
    public boolean runnig(int distance) {
        if (distance <= DISTANCE && distance > 0) {
            System.out.println("Собака пробежит дистанцию");
            return true;
        } else {
            System.out.println("Собака не пробежит дистанцию");
            return false;
        }
    }

    @Override
    public boolean swim(int duration) {
        if (duration <= DURATION && duration > 0) {
            System.out.println("Собака проплывет дистанцию");
            return true;
        } else {
            System.out.println("Собака не проплывет дистанцию");
            return false;
        }
    }

    @Override
    public boolean jump(double height) {
        if (height <= HEIGHT && height > 0) {
            System.out.println("Собака допрыгнет");
            return true;
        } else {
            System.out.println("Собака не допрыгнет");
            return false;
        }
    }


}
