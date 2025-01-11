package Package1;

public class Arithmetic_Two {

	
	public int multi(int a, int b) {
		int c;
		c = a*b;
		System.out.println("Multi is: " + c);
		return c;
	}	
	public int sub(int a, int b) {
		int c;
		c = a-b;
		return c;
	}
	public int sum(int a, int b) {
		int c;
		c = a+b;
		System.out.println("Sum is: " + c);
		return c;
	}
	public int div(int a, int b) {
		int c;
		c = a/b;
		System.out.println("Div is: " + c);
		return c;
	}
	
	public static void main(String[] args) {
		
		System.out.println("**************Assignment two**************");
		
		Arithmetic_Two obj = new Arithmetic_Two();
		int MultiResult = obj.multi(10, 2);
		int FirstSubResult = obj.sub(MultiResult, 2);
		System.out.println("First Subtract result is: " + FirstSubResult);
		int SumResult = obj.sum(FirstSubResult, 2);
		int SecondSubResult = obj.sub(SumResult, 2);
		System.out.println("Second subtract result is: " + SecondSubResult);
		int DivResult = obj.div(SecondSubResult, 2);
		System.out.println("Final result for second expression is: " + DivResult);
		
	}
}
