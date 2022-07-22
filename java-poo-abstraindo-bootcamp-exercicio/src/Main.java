import java.time.LocalDate;

import Dominio.Bootcamp;
import Dominio.Curso;
import Dominio.Dev;
import Dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devArthur = new Dev();
        devArthur.setNome("Arthur");
        devArthur.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Arthur:" + devArthur.getConteudosInscritos());
        devArthur.progredir();
        devArthur.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Arthur:" + devArthur.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Arthur:" + devArthur.getConteudosConcluidos());
        System.out.println("XP:" + devArthur.calcularTotalXp());

        Dev devCaio = new Dev();
        devCaio.setNome("Caio");
        devCaio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Caio:" + devCaio.getConteudosInscritos());
        devCaio.progredir();
        devCaio.progredir();
        devCaio.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Caio:" + devCaio.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Caio:" + devCaio.getConteudosConcluidos());
        System.out.println("XP:" + devCaio.calcularTotalXp());

    }
}
