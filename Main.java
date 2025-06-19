import model.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java Orientado a Objetos");
        curso1.setDescricao("Aprenda os pilares da POO com Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Spring Boot");
        curso2.setDescricao("Desenvolvimento de APIs REST com Spring Boot");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Carreira");
        mentoria.setDescricao("Como crescer como desenvolvedor");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprenda do básico ao avançado em Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir();
        devJoao.progredir();

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        devMaria.progredir();

        System.out.println("João - Conteúdos Inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("João - Conteúdos Concluídos: " + devJoao.getConteudosConcluidos());
        System.out.println("João - XP: " + devJoao.calcularTotalXp());

        System.out.println("Maria - Conteúdos Inscritos: " + devMaria.getConteudosInscritos());
        System.out.println("Maria - Conteúdos Concluídos: " + devMaria.getConteudosConcluidos());
        System.out.println("Maria - XP: " + devMaria.calcularTotalXp());
    }
}
