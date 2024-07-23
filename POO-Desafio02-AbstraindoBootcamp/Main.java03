//import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criação dos cursos
        Curso curso1 = new Curso();
        curso1.setTitulo("Java Básico");
        curso1.setDescricao("Introdução ao Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java Avançado");
        curso2.setDescricao("Aprofundamento em Java");
        curso2.setCargaHoraria(16);

        // Criação da mentoria
        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Mentoria sobre Java com especialista", "João", LocalDate.now());

        // Criação do Bootcamp
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer");
        bootcamp.setDescricao("Um bootcamp intensivo para se tornar um desenvolvedor Java.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getMentorias().add(mentoria1);

        // Criação do desenvolvedor
        Dev dev = new Dev();
        dev.setNome("Carlos");

        // Inscrição do desenvolvedor no bootcamp
        dev.inscreverBootcamp(bootcamp);

        // Exibindo detalhes do Bootcamp
        System.out.println("Bootcamp: " + bootcamp.getNome());
        System.out.println("Descrição: " + bootcamp.getDescricao());
        System.out.println("Data Inicial: " + bootcamp.getDataInicial());
        System.out.println("Data Final: " + bootcamp.getDataFinal());
        System.out.println("Cursos:");
        for (Curso curso : bootcamp.getCursos()) {
            System.out.println("- " + curso.getTitulo() + ": " + curso.getDescricao());
        }
        System.out.println("Mentorias:");
        for (Mentoria mentoria : bootcamp.getMentorias()) {
            System.out.println("- " + mentoria.getTitulo() + ": " + mentoria.getDescricao() + " com " + mentoria.getMentor());
        }

        // Exibindo detalhes do Dev
        System.out.println("\nDetalhes do Dev:");
        System.out.println("Nome: " + dev.getNome());
        System.out.println("Conteúdos Inscritos: " + dev.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + dev.getConteudosConcluidos());

        // Progredindo o desenvolvedor
        dev.progredir();

        // Exibindo detalhes após progresso
        System.out.println("\nApós progresso:");
        System.out.println("Conteúdos Inscritos: " + dev.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + dev.getConteudosConcluidos());
        System.out.println("Total XP: " + dev.calcularTotalXp());
    }
}
