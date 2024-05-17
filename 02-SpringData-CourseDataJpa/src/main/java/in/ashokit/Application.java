package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.Service.CourseService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext con=
				SpringApplication.run(Application.class, args);
	CourseService serv=con.getBean(CourseService.class);
	serv.getallcour();
	}

}
