package two;

	public class Main {
		public static void main(String[] args) {
			PrivatePerson Aaron = new PrivatePerson();
			Aaron.setName("Aaron");
			Aaron.setAge(22);
			
			System.out.println("PrivatePerson Name: " + Aaron.getName());
			System.out.println("PrivatePerson Age: " + Aaron.getAge());
		}
}
