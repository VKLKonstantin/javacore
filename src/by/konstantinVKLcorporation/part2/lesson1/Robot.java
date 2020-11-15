package by.konstantinVKLcorporation.part2.lesson1;

public class Robot implements RunAndJump {
    public int maxRunDistance;
    public int maxJumpHeight;

    public Robot(int maxRunDistance, int maxJumpHeight) {
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
