public class Facade {
	
//	private String url;
//	private String username;
//	private String password;
//	private boolean send;
	
	public Facade(String url, String username, String password, boolean send) {
		Subsystem s = new Subsystem();
//		this.url = url;
//		this.username = username;
//		this.password = password;
//		this.send = send;
		
		s.enterURL(url);
		s.enterUsername(username);
		s.enterPassword(password);
		s.send(true);
	}
	
}
