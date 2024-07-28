// TurnLeftStrategy.java
public class TurnLeftStrategy implements CartStrategy {
    @Override
    public void execute() {
        System.out.println("Carrinho virando à esquerda");
        CartManager.getInstance().turnLeft();
    }
}
