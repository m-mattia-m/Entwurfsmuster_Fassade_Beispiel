
public class User {

	private int id;
	private String firstName;
	private String lastName;
	private int age;
	
	public User() {
		
	}
	
	public User(int id, String firstName, String lastName, int age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String toString() {
		return " |\t" + id + "\t|\t" + firstName + "\t|\t" + lastName + "\t|\t" + age  + "\t|\t";
	}
	
}
