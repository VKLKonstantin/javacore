package by.konstantinVKLcorporation.part2.lesson1;

public class Human implements RunAndJump {
    public int maxRunDistance;
    public int maxJumpHeight;

    public Human(int maxRunDistance, int maxJumpHeight) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }


    @Override
    public int run() {
        return maxRunDistance;
    }

    @Override
    public int jump() {
        return maxJumpHeight;
    }
}
