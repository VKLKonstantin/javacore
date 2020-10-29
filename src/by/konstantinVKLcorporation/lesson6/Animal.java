package by.konstantinVKLcorporation.lesson6;

public abstract class Animal {

    private int distance;
    private int duration;
    private double height;

    public Animal(int distance, int duration, double height) {
        this.distance = distance;
        this.duration = duration;
        this.height = height;
    }

    public Animal(int distance, double height) {
        this.distance = distance;
        this.height = height;
    }

    public Animal() {
    }


    public abstract boolean runnig(int distance);

    public abstract boolean swim(int duration);

    public abstract boolean jump(double height);
}
