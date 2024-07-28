
public class TurnLeftStrategy implements CartStrategy {
    @Override
    public void execute() {
        CartManager.getInstance().turnLeft();
    }
}
