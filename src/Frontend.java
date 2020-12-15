public class Frontend {
	
	Facade f = new Facade();

	public Frontend() {
		
		f.postUser("Johannes1", "Mustermann", 17);
		f.getUsers();
		f.postUser("Johannes2", "Mustermann", 17);
		f.getUsers();
		f.postUser("Johannes3", "Mustermann", 17);
		f.getUsers();
		f.postUser("LöschenUser", "LöschenUser", 18);
		f.getUsers();
		f.delUser(3);
		f.getUsers();
		f.getUser(2);
		f.putUser(2, "EditedUser", "EditedUser", 21);
		f.getUsers();

	}
	
}
