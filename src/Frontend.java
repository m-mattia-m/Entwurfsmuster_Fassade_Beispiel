import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 

public class Frontend {
	
	public String url;
	public String username;
	public String password;

	public Frontend() { //throws IOException
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
//		this.url = reader.readLine();
//		this.username = reader.readLine();
//		this.password = reader.readLine();
		
		this.url = "https://google.com/login";
		this.username = "max.mustermann";
		this.password = "Abc123456";
		
		
		Facade f = new Facade(this.url, this.username, this.password, true);
		
	}
	
}
