package in.ashokit.Service;

import java.util.Arrays;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.Entity.Course;
import in.ashokit.Repo.CourseRepo;

@Service
public class CourseService {
	private CourseRepo crepo;
	public CourseService(CourseRepo crepo) {
		this.crepo=crepo;
		System.out.println(this.crepo.getClass().getName());
	}
	public void getallcour() {
		Course c1=new Course();
		c1.setCid(101);
		c1.setCname("java");
		c1.setPrice(5000.00);
		Course c2=new Course();
		c2.setCid(102);
		c2.setCname("python");
		c2.setPrice(4000.00);
		Course c3=new Course();
		c3.setCid(103);
		c3.setCname("aws");
		c3.setPrice(3500.00);
		Course c4=new Course();
		c4.setCid(104);
		c4.setCname("UI");
		c4.setPrice(5000.00);
		Course c5=new Course();
		List<Course>list=Arrays.asList(c1,c2,c3,c4);
		crepo.saveAll(list);
	}

}
