import java.util.ArrayList;

public class Subsystem {
	
	public int id = 0;
	User user = new User();
	ArrayList<User> arrUsers = new ArrayList<User>();
	
	
	
	public void addUser(String firstName, String lastName, int age) {
		arrUsers.add(new User(id, firstName, lastName, age));
		id += 1;
	}
	
	public ArrayList<User> getUsers() {
		return arrUsers;
	}
	
}
