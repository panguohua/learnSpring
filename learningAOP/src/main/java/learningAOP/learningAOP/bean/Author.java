package learningAOP.learningAOP.bean;

public class Author {
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String name;
	private int age;
	public String toString() {
		return "ID: " + ID + " name: " + name + " age: " + age;
	}
}
