// CartFacade.java
public class CartFacade {
    private CartStrategy moveForwardStrategy;
    private CartStrategy turnLeftStrategy;
    private CartStrategy stopStrategy;

    public CartFacade() {
        this.moveForwardStrategy = new MoveForwardStrategy(1); // Default steps = 1
        this.turnLeftStrategy = new TurnLeftStrategy();
        this.stopStrategy = new StopStrategy();
    }

    public void moveForward(int steps) {
        moveForwardStrategy = new MoveForwardStrategy(steps);
        moveForwardStrategy.execute();
    }

    public void turnLeft() {
        turnLeftStrategy.execute();
    }

    public void stop() {
        stopStrategy.execute();
    }

    public void checkStatus() {
        CartManager.getInstance().printMessage();
    }
}
