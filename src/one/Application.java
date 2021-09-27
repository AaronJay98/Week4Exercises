package one;

public class Application {
	public static void main(String[] args) {
		Person Aaron = new Person();
		Aaron.name = "Aaron";
		Aaron.age = 22;
		
		System.out.println("Person Name: " + Aaron.name);
		System.out.println("Person Age: " + Aaron.age);
	}
}
