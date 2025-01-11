package Package1;

public class Arithmetic_One {
	
	public int sum(int a,int b) {		
		int c;
		c = a + b;
		return c;
	}	
	public int sub(int a, int b) {		
		int c;
		c = a-b;
		System.out.println("Sub is: " + c);
		return c;
	}	
	public int multi(int a, int b) {
		int c;
		c = a*b;
		System.out.println("Multi is: " + c);
		return c;
	}	
	public int div(int a, int b) {
		int c;
		c = a/b;
		System.out.println("Div is: " + c);
		return c;
	}	
	public static void main(String[] args) {
		
		System.out.println("**************Assignment one**************");
				
		Arithmetic_One obj = new Arithmetic_One();
		int FirstSum = obj.sum(10, 2);
		System.out.println("First sum is: " + FirstSum);
		int FinalSum = obj.sum(FirstSum, 2);
		System.out.println("Final Sum is: " + FinalSum);
		
		int FinalSub = obj.sub(FinalSum, 2);
		int FinalMulti = obj.multi(FinalSub, 2);
		int FinalResult = obj.div(FinalMulti, 2);		
		System.out.println("Final result for first expression is: " +FinalResult );
		
	}
	
}
