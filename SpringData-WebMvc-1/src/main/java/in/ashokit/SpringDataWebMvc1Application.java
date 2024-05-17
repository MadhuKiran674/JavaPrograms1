package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.Service.BooksService;

@SpringBootApplication
public class SpringDataWebMvc1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext con=
				SpringApplication.run(SpringDataWebMvc1Application.class, args);
   BooksService ser=con.getBean(BooksService.class);
   ser.get();
	
	}

}
