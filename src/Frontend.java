public class Frontend {
	
	Facade f = new Facade();

	public Frontend() {
		
		f.postUser("Max", "Mustermann", 17);
		f.postUser("Max2", "Mustermann", 17);
		f.postUser("Max3", "Mustermann", 17);
		f.getUsers();
		
		/* Output:
		* User@4517d9a3
		* User@372f7a8d
		* User@2f92e0f4
		*/

	}
	
}
