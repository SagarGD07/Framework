package assignment;
public class FactorialusingMWP 
{
	static void factorial(int no)
	{
		int fact=1;
		for(int i=1; i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) 
	{
		int no=5;
		factorial(no);
	}
}
