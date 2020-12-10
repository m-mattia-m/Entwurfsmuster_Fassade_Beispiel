public class Subsystem {
	
	private String url;
	private String username;
	private String password;
	private boolean send;
	
//	public Subsystem() {
//		
//	}
	
	public void enterURL(String url) {
		this.url = url;
		System.out.println("URL wurde eingegeben:\t\t -> " + this.url);
	}
	
	public void enterUsername(String username) {
		this.username = username;
		System.out.println("Benutzername wurde eingegeben: \t -> " + this.username);
	}
	
	public void enterPassword(String password) {
		this.password = password;
		System.out.println("Password wurde eingegeben: \t -> " + this.password);
	}
	
	public void send(boolean send) {
		this.send = send;
		System.out.println("\n\nErfolgreich angemeldet");
	}
	
}
