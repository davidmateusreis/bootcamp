import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Angular");
        curso2.setDescricao("Descrição Curso Angular");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Claro - Java com Spring Boot");
        bootcamp.setDescricão("Descrição do bootcamp Claro - Java com Spring Boot");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("David");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de David " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos inscritos de David " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de David " + dev1.getConteudosConcluidos());
        System.out.println("XP " + dev1.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("Mateus");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Mateus " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos inscritos de Mateus " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Mateus " + dev2.getConteudosConcluidos());
        System.out.println("XP " + dev2.calcularTotalXp());
    }
}
