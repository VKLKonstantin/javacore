package by.konstantinVKLcorporation.lesson6;

public class Dog extends Animal {
    private int distanceDog;
    private int durationDog;
    private double heightDog;

    public Dog() {
        distanceDog = (int) (Math.random() * 201) + 300;
        durationDog = (int) (Math.random() * 201) + 300;
        heightDog = (double) (Math.random() * 5) + 1;
    }


    @Override
    public boolean runnig(int distance) {
        if (distance <= distanceDog && distance > 0) {
            System.out.println("Собака пробежит дистанцию");
            return true;
        } else {
            System.out.println("Собака не пробежит дистанцию");
            return false;
        }
    }

    public int getDistanceDog() {
        return distanceDog;
    }

    public int getDurationDog() {
        return durationDog;
    }

    public double getHeightDog() {
        return heightDog;
    }


    @Override
    public boolean swim(int duration) {
        if (duration <= durationDog && duration > 0) {
            System.out.println("Собака проплывет дистанцию");
            return true;
        } else {
            System.out.println("Собака не проплывет дистанцию");
            return false;
        }
    }

    @Override
    public boolean jump(double height) {
        if (height <= heightDog && height > 0) {
            System.out.println("Собака допрыгнет");
            return true;
        } else {
            System.out.println("Собака не допрыгнет");
            return false;
        }
    }


}
