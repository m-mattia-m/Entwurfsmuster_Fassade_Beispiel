import java.util.ArrayList;

public class Subsystem {
	
	public int id = 0;
	User user = new User();
	ArrayList<User> arrUsers = new ArrayList<User>();
	
	
	
	public void addUser(String firstName, String lastName, int age) {
		arrUsers.add(new User(id, firstName, lastName, age));
		id += 1;
	}
	
	public void remUser(int id) {
		arrUsers.remove(id);
	}
	
	public ArrayList<User> getUsers() {
		return arrUsers;
	}
	
	public User getUser(int id) {
		return arrUsers.get(id);
	}
	
	public void editUser(int id, String firstName, String lastName, int age) {
		arrUsers.remove(id);
		arrUsers.add(new User(id, firstName, lastName, age));
	}
	
}
