// Singleton para gerenciar o carrinho
public class CartManager {
    private static CartManager instance;
    private int position = 0; // Posição do carrinho

    private CartManager() {
        // Construtor privado para evitar instância externa
    }

    public static CartManager getInstance() {
        if (instance == null) {
            instance = new CartManager();
        }
        return instance;
    }

    public void moveForward(int steps) {
        position += steps;
    }

    public void turnLeft() {
        // Lógica para virar à esquerda (não implementado para simplicidade)
    }

    public int getPosition() {
        return position;
    }


    
    public void printMessage() {
        if (position >= 10) { // Supondo que o ponto final é a posição 10
            System.out.println("Fila única máximo 15 itens");
        }
    }
}
