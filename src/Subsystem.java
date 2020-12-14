import java.util.Arrays;

public class Subsystem {
	
	// Alter ist der einfachheit halber auch ein String da man sonst ein neues Objekt braucht mit Id:String, Vorname:String, Nachname:String und Alter:Int
//	private String id;
	private String firstName;
	public String lastName;
	public String age;
	
	private String[][] users = {
			{"Michael","Schädler", "17"},
			{"Kay","Wild", "16"},
			{"Mattia","Müggler", "17"},
	};
	
	
	public String[][] getUsers() {
		System.out.println("content Subsystem get");

		return users;

	}
	
	public void addUsers(String firstName, String lastName, String age) {
		int i = users.length;
		if(users[i - 1][0] == null) {
			users[i - 1][0] = firstName;
			users[i - 1][1] = lastName;
			users[i - 1][2] = age;
		}else {
			users[i][0] = firstName;
			users[i][1] = lastName;
			users[i][2] = age;
		}
		
	}
	
	public void delUsers(String id) {
		users[Integer.parseInt(id)][0] = null;
		users[Integer.parseInt(id)][1] = null;
		users[Integer.parseInt(id)][2] = null;
	}
}
