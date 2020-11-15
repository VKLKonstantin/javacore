package by.konstantinVKLcorporation.part2.lesson1;

public class Cat implements RunAndJump {

   public int maxRunDistance;
   public int maxJumpHeight;



    public Cat(int maxRunDistance, int maxJumpHeight) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public int run() {

       // System.out.println("Кот бежит");
        return maxRunDistance;
    }

    @Override
    public int jump() {

        System.out.println("Кот прыгает");
        return maxJumpHeight;
    }

}
