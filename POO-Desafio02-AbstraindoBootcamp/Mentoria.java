//package br.com.dio.desafio.dominio;

import java.time.LocalDate;

// Classe Mentoria que herda de Conteudo e implementa métodos e atributos adicionais.
public class Mentoria extends Conteudo {
    // Atributos da classe Mentoria
    private String mentor; // Mentor que conduz a mentoria
    private LocalDate data; // Data da mentoria

    // Construtor da classe Mentoria
    public Mentoria(String titulo, String descricao, String mentor, LocalDate data) {
        super(titulo, descricao); // Inicializa os atributos da classe base
        this.mentor = mentor;
        this.data = data;
    }

    // Construtor padrão
    public Mentoria() {
        super("", ""); // Chama o construtor padrão da classe base
    }

    // Método para obter o mentor
    public String getMentor() {
        return mentor;
    }

    // Método para definir o mentor
    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    // Método para obter a data da mentoria
    public LocalDate getData() {
        return data;
    }

    // Método para definir a data da mentoria
    public void setData(LocalDate data) {
        this.data = data;
    }

    // Método que calcula o XP (experiência) ganho com a mentoria
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d; // XP padrão mais um bônus de 20
    }

    // Método para descrever a mentoria
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", mentor='" + getMentor() + '\'' +
                ", data=" + getData() +
                '}';
    }

    // Removido o método participar, pois não está definido na classe base Conteudo
}
