package in.ashokit.Service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.Entity.Books;
import in.ashokit.Repo.BooksRepo;
@Service
public class BooksService {
	private BooksRepo bsrepo;

	public BooksService(BooksRepo bsrepo) {
		super();
		this.bsrepo = bsrepo;
		System.out.println(this.bsrepo.getClass().getName());
	}
	public void get() {
		Books b1=new Books();
		b1.setBid(101);
		b1.setBname("java");
		b1.setPrice(500.00);
		Books b2=new Books();
		b2.setBid(102);
		b2.setBname("aws");
		b2.setPrice(350.00);
		Books b3=new Books();
		b3.setBid(103);
		b3.setBname("python");
		b3.setPrice(400.00);
		List<Books> list=Arrays.asList(b1,b2,b3);
		bsrepo.saveAll(list);
	}
	
	

}
