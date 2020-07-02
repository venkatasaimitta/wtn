package encapsulation;

public class Book {
	private String name;
	private double price;
	private int qtyInStock;
	private Author author;
	
	public Book(String name,Author author,double price,int qtyInStox){
		this.name=name;
		this.author =author;
		this.price=price;
		this.qtyInStock=qtyInStock;
		
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}


	public static void main(String[] args) {
		
		

	}

}
