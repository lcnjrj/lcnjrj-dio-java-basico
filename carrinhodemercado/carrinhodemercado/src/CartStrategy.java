// Interface Strategy
public interface CartStrategy {
    void execute();
}

// Implementações concretas das estratégias
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

public class TurnLeftStrategy implements CartStrategy {
    @Override
    public void execute() {
        CartManager.getInstance().turnLeft();
    }
}

public class StopStrategy implements CartStrategy {
    @Override
    public void execute() {
        // Parar o carrinho (não implementado para simplicidade)
    }
}
