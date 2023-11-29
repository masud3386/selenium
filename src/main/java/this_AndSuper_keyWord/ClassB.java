package this_AndSuper_keyWord;

public class ClassB extends ClassA{

	int a = 5;
	public void MethodX() {
		System.out.println("i am inside method of Class b ");
	}
	public void methody() {
		System.out.println("I love automation");
		System.out.println(super.a);
		super.MethodX();
		
	}
	
	
	
}