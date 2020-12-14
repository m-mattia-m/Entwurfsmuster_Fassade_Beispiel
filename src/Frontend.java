public class Frontend {
	
	public String firstName;
	public String lastName;
	public String age;

	public Frontend() {
		this.firstName = "Max";
		this.lastName = "Mustermann";
		this.age = "18";
		
		Facade f = new Facade();
		
		f.getUser();
		f.postUser(this.firstName, this.lastName, this.age);
		f.delUser("1");
	}
	
}
