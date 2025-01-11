package Package1;

public class SumSubMulti {

	
	public int sum(int a, int b) {
		int c;
		c= a+b;
		System.out.println("sum is: " + c);
		return c;
	}
	
	public int sub(int x, int y) {
		int z;
		z=x-y;
		System.out.println("sub is: " + z);
		return z;
	}
	public void multi(int a1, int a2) {
		
		int multiResult;
		multiResult = a1*a2;
		System.out.println("Multi result: " + multiResult);
		
	}
	
	public static void main(String[] args) {
		SumSubMulti obj= new SumSubMulti();
		
		int sumRelust=obj.sum(10, 2);
		int subResult=obj.sub(8, 10);
		obj.multi(sumRelust, subResult);
		
	}
}
