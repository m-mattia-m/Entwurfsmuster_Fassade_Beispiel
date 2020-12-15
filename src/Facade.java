import java.util.ArrayList;

public class Facade {
	
	Subsystem s = new Subsystem();
	User user = new User();
	
	public Facade() {
	}
	
	public void getUsers() {
		ArrayList<User> arrUsers = new ArrayList<User>();
		arrUsers = s.getUsers();
		for(int i = 0; i < arrUsers.size(); i++) {
			System.out.println(arrUsers.get(i));
		}
	}
	
	public void postUser(String firstName, String lastName, int age) {
		s.addUser(firstName, lastName, age);
	}
}
