import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


      /*  System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricão Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCrisleine = new Dev();
        devCrisleine.setNome("Crisleine");
        devCrisleine.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Crisleine:" +devCrisleine.getConteudosInscritos());
        devCrisleine.progredir();
        devCrisleine.progredir();


        System.out.println("_");
        System.out.println("Conteúdos Inscritos Crisleine:" +devCrisleine.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Crisleine:" +devCrisleine.getConteudosConcluidos());
        System.out.println("xP:" +devCrisleine.calcularTotalXp());

        System.out.println("__________");

        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos");
        devMarcos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Marcos:" +devMarcos.getConteudosInscritos());
        devMarcos.progredir();
        devMarcos.progredir();
        devMarcos.progredir();

        System.out.println("_");
        System.out.println("Conteúdos Inscritos Marcos:" +devMarcos.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Marcos:" +devMarcos.getConteudosConcluidos());
        System.out.println("xP:"+ devMarcos.calcularTotalXp());

    }

}
