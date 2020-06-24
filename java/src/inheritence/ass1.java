package inheritence;

class animal{
	public void eat() {
		System.out.println("eat");
	}
	public void sleep() {
		System.out.println("sleep");
	}
}

class bird extends animal{
	
	
	public void eat() {
		System.out.println("b.eat");
	}
	public void sleep(){
		System.out.println("b.sleep");	
	}
	
	public void fly(){
		System.out.println("b.fly");	
	}
	
}


public class ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal an = new animal();
		bird bd = new bird();
		an.eat();
		an.sleep();
		bd.eat();
		bd.sleep();
		bd.fly();
		
	}

}
