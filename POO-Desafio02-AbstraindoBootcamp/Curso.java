//package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    // Construtor da classe Curso que recebe parâmetros e chama o construtor da classe base
    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao); // Chama o construtor da classe base Conteudo
        this.cargaHoraria = cargaHoraria;
    }

    // Construtor padrão
    public Curso() {
        super("", ""); // Chama o construtor padrão da classe base Conteudo
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria; // XP padrão multiplicado pela carga horária do curso
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
