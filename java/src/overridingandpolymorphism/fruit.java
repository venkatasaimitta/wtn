package overridingandpolymorphism;

public class fruit {
	 String name;
	 String taste;
	 int size;
	
	fruit() {
		name="apple";
		taste="sweet";
		size=20;
		
	}
	
	public void eat() {
		System.out.println(name+" tastes "+taste);
	}
	
	class Apple extends fruit {
		public void eat() {
			System.out.println(name+" tastes "+taste);
	}
	}
	
	class orange extends fruit{
		public void eat() {
			System.out.println(name+" tastes "+taste);
	}
	}
	public static void main(String[] args) {
		fruit obj = new fruit();
		obj.eat();
		
		

	}

}
