package JavaFeatures;

public class Client {

	public static void main(String[] args) {
		
		Greeter greet = new Greeter();
		greet.userName = "Haneesh";
		
		greet.greet(greet);
	}
}
