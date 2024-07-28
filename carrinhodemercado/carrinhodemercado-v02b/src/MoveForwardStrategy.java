// MoveForwardStrategy.java
public class MoveForwardStrategy implements CartStrategy {
    private int steps;

    public MoveForwardStrategy(int steps) {
        this.steps = steps;
    }

    @Override
    public void execute() {
        // Mensagem indicando o movimento do carrinho
        System.out.println("Carrinho indo " + steps + " passos para frente");
        CartManager.getInstance().moveForward(steps);
    }
}
