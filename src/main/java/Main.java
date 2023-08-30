import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ch03_ex1.config.ProjectConfig;
import ch03_ex1.entity.Parrot;
import ch03_ex1.entity.Person;

public class Main {

	public static void main(String[] args) {
		PrintStream ps = new PrintStream(System.out, true, UTF_8);
		var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var parrot = (Parrot)c.getBean(Parrot.class);
		
		ps.println(parrot.getName());
		
		var person = (Person)c.getBean(Person.class);
		
		ps.println(person.getName());
	}

}
