public class Frontend {
	
	Facade f = new Facade();

	public Frontend() {
		
		f.postUser("Mattia", "Mueggler", 17);
		f.postUser("Michael", "Schaedler", 17);
		f.postUser("Kay", "Wild", 17);
		f.getUsers();

	}
	
}
