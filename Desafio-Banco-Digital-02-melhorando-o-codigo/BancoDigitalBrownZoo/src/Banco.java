import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    /**
     * Adiciona uma nova conta ao banco.
     *
     * @param conta A conta a ser adicionada.
     */
    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    /**
     * Encontra uma conta com base no número da conta.
     *
     * @param numero O número da conta.
     * @return A conta encontrada ou null se não houver conta com o número especificado.
     */
    public Conta encontrarContaPorNumero(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }
}
