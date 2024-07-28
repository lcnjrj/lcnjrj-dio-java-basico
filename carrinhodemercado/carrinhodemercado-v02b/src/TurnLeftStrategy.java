// TurnLeftStrategy.java
public class TurnLeftStrategy implements CartStrategy {
    @Override
    public void execute() {
        // Mensagem indicando a virada à esquerda
        System.out.println("Carrinho virando à esquerda");
        CartManager.getInstance().turnLeft();
    }
}
