import java.util.ArrayList;

public class Facade {
	
	Subsystem s = new Subsystem();
	User user = new User();
	
	public Facade() {
	}
	
	public void getUsers() {
		ArrayList<User> arrUsers = new ArrayList<User>();
		arrUsers = s.getUsers();
		System.out.println("\n\n\n\n\n --------------------------------------------------------------------------------");
		System.out.println(" |\t ID \t|\t Firstname \t|\t Lastname \t|\t Age \t|\t");
		for(int i = 0; i < arrUsers.size(); i++) {
			System.out.println(" --------------------------------------------------------------------------------");
			System.out.println(arrUsers.get(i));
		}
		System.out.println(" --------------------------------------------------------------------------------");
	}
	
	public void postUser(String firstName, String lastName, int age) {
		s.addUser(firstName, lastName, age);
	}
	
	public void delUser(int id) {
		s.remUser(id);
	}
	
	public void getUser(int id) {
		System.out.println("\n\n\n\n\n --------------------------------------------------------------------------------");
		System.out.println(" |\t ID \t|\t Firstname \t|\t Lastname \t|\t Age \t|\t");
		System.out.println(" --------------------------------------------------------------------------------");
		System.out.println(s.getUser(id));
		System.out.println(" --------------------------------------------------------------------------------");
	}
	
	public void putUser(int id, String firstName, String lastName, int age) {
		s.editUser(id, firstName, lastName, age);
	}
}
