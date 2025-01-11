package Package1;

public class abc {
	
	
	
	public abc() {
		// TODO Auto-generated constructor stub
		this(1,23,3);
		System.out.println("Default constructor");
	}
	public abc(int a) {
		this();
		System.out.println("one parameter constructor");
	}
	public abc(int a, int b) {
		this(2);
		System.out.println("two parameter constructor");
	}
	public abc(int a, int b, int c) {
		System.out.println("three parameterized constructor");
	}
	
	public static void main(String[] args) {
		abc obj= new abc(1,2);
	}

}
