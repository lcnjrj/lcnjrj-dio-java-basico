//package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * Classe Bootcamp que representa um bootcamp com cursos, mentorias, e devs inscritos.
 * Inclui funcionalidades para gerenciamento e exibição dos detalhes do bootcamp.
 */
public class Bootcamp {
    // Atributos do Bootcamp
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now(); // Data de início do bootcamp
    private final LocalDate dataFinal = dataInicial.plusDays(45); // Data final do bootcamp
    private Set<Dev> devsInscritos = new HashSet<>(); // Lista de desenvolvedores inscritos
    private Set<Conteudo> conteudos = new LinkedHashSet<>(); // Lista de conteúdos do bootcamp
    private List<Curso> cursos = new ArrayList<>(); // Lista de cursos
    private List<Mentoria> mentorias = new ArrayList<>(); // Lista de mentorias

    // Construtor da classe Bootcamp com nome
    public Bootcamp(String nome) {
        this.nome = nome;
    }

    // Métodos de acesso e modificação para os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public List<Mentoria> getMentorias() {
        return mentorias;
    }

    public void adicionarMentoria(Mentoria mentoria) {
        mentorias.add(mentoria);
    }

    // Método para exibir detalhes do Bootcamp
    public void mostrarDetalhes() {
        System.out.println("Bootcamp: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Data Inicial: " + dataInicial);
        System.out.println("Data Final: " + dataFinal);
        System.out.println("Cursos:");
        for (Curso curso : cursos) {
            System.out.println("- " + curso.getTitulo() + ": " + curso.getDescricao());
        }
        System.out.println("Mentorias:");
        for (Mentoria mentoria : mentorias) {
            System.out.println("- " + mentoria.getTitulo() + ": " + mentoria.getDescricao() + " com " + mentoria.getMentor());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos) && Objects.equals(cursos, bootcamp.cursos) && Objects.equals(mentorias, bootcamp.mentorias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos, cursos, mentorias);
    }
}
