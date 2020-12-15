public class Frontend {
	
	Facade f = new Facade();

	public Frontend() {
		
		f.postUser("Max", "Mustermann", 17);
		f.postUser("Max2", "Mustermann", 17);
		f.postUser("Max3", "Mustermann", 17);
		f.getUsers();

	}
	
}
