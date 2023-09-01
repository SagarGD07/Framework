package assignment;
public class FibusingMWP 
{
	static void fib(int a, int b)
	{
		System.out.print(a+" "+b+" ");
		for (int i=0;i<=10;i++)
		{
			int c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
	}
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		fib(a,b);
	}
}
