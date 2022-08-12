import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso curso1 = new Curso("Curso JAVA","Descrição Curso Java",8);
		Curso curso2 = new Curso("Curso JS","Descrição Curso JS",4);
		Mentoria mentoria = new Mentoria("Mentoria JAVA","Descrição Mentoria Java", LocalDate.now());
		
		
		Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer","Descrição Bootcamp Java Developer",LocalDate.now());
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devPedro = new Dev("Pedro");
		devPedro.inscreverBootcamp(bootcamp);
		devPedro.progredir();
		devPedro.progredir();
		System.out.println(devPedro);
		
		System.out.println("***********************");		
		
		Dev devMaria = new Dev("Maria");
		devMaria.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos:" + devMaria.getConteudosInscritos());
		devMaria.progredir();
		devMaria.progredir();
		devMaria.progredir();
		devMaria.progredir();
		System.out.println(devMaria);
	}

}
