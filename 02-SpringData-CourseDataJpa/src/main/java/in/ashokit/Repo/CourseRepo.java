package in.ashokit.Repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import in.ashokit.Entity.Course;
@Repository
public interface CourseRepo extends JpaRepository<Course,Integer>{

}
