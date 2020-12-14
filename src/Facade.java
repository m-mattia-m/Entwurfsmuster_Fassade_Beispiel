public class Facade {
	
	public String firstName;
	public String lastName;
	public String age;
	private String[][] users;
	
	Subsystem s = new Subsystem();
	
	public Facade() {
		
	}
	
	public void getUser() {
		System.out.println("content Facade get");
		users = s.getUsers();
		for(int i = 0; i < users.length; i++) {
			System.out.println(users[i][0] + "\t | \t" + users[i][1] + "\t | \t" + users[i][2]);
		}
	}
	
	public void postUser(String firstName, String lastName, String age) {
		s.addUsers(firstName, lastName, age);
	}
	
	public void delUser(String id) {
		System.out.println("content Facade Del");
		s.delUsers(id);
	}
		
}
