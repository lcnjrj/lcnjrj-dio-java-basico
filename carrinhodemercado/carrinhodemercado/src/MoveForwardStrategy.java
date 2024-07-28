public class MoveForwardStrategy implements CartStrategy {
    private int steps;

    public MoveForwardStrategy(int steps) {
        this.steps = steps;
    }

    @Override
    public void execute() {
        CartManager.getInstance().moveForward(steps);
    }
}
