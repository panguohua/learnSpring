package learningAOP.learningAOP.bean;

public class Book {
	
	//引数付けConstructor
	/*public Book(String id, String name, int price) {
      
        this.ID = id;
        this.name = name;
        this.price = price;
		}*/
	
	private String ID;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private String name;
	private int price;
	private Author author;
	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String toString() {
		return "ID: " + ID + " name: " + name + " price: " + price + " Author: " + author;
	}
}
