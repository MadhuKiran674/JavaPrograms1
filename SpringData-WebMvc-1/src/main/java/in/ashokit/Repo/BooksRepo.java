package in.ashokit.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.Entity.Books;
@Repository
public interface BooksRepo extends JpaRepository<Books, Integer>{

}
