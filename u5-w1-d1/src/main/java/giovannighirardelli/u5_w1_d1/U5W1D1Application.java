package giovannighirardelli.u5_w1_d1;

import giovannighirardelli.u5_w1_d1.entities.Menu;
import giovannighirardelli.u5_w1_d1.entities.MenuItem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class U5W1D1Application {

	public static void main(String[] args) {
		SpringApplication.run(U5W1D1Application.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U5W1D1Application.class);



//		Pizze p = context.getBean(Pizze.class);
//		System.out.println(p);

		Menu menu = context.getBean(Menu.class);
		menu.printMenu();

	}


}
