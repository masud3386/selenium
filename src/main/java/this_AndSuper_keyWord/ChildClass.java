package this_AndSuper_keyWord;

public class ChildClass extends ParentClass{
	public ChildClass() {
		super();
		
		System.out.println("I am inside of child calss constructor");
		
	}
	public ChildClass(int a) {
		
		super(22,33.3);
		System.out.println("I am inside of child calss constructor");
		
	}


}
