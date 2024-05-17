package in.ashokit.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Books {
	@Id
	private Integer bid;
	private String bname;
	private double price;
	
	public Books() {
		
	}

	public Books(Integer bid, String bname, double price) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.price = price;
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Books [bid=" + bid + ", bname=" + bname + ", price=" + price + "]";
	}
	

}
