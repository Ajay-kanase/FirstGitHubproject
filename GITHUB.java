package Day2;
import java.util.Scanner;

public class ArithmeticOps {
	public static int sub(int x,int y) {
		int difference= x-y;
		return difference;
	
	}
	public static int multiple(int a, int b)
	{
		//Done multiplication
		int multi= a*b;
		return multi;
	}
	public static float divide(int x,int y) 
	{
		float div=x/y;
		return div;
	}
	
	public static void main(String[] args) 
	{
		ArithmeticOps A= new ArithmeticOps();
		Scanner obj = new Scanner(System.in);  
		System.out.println("enter number1");
		int number1= obj.nextInt();
		Scanner obj2 = new Scanner(System.in);  
		System.out.println("enter number2");
		int number2= obj2.nextInt();
		System.out.println(A.sub(number1, number2));
		System.out.println(A.multiple(number1, number2));
		System.out.println(A.divide(number1, number2));

	}

}
