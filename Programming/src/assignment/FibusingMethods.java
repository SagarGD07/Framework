package assignment;
public class FibusingMethods 
{
	static void fib()
	{
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		for (int i=0; i<=10; i++)
		{
			int c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
	}
	public static void main(String[] args) 
	{
		fib();
	}
}