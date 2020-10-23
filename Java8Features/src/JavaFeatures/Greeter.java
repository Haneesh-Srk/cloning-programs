package JavaFeatures;

public class Greeter implements Greeting {

	String userName;

	@Override
	public void greet(Greeter greeter) {
		
		System.out.println(greeter.userName + " Hello good morning");
	}
}
